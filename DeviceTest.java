import java.util.ArrayList;

public class DeviceTest {
    public static void main(String[] args) {    //Device refers to different classes
        Device phone1 = new Smartphone("Apple", "IPhone 13 Pro",  6.1);
        Device phone2 = new Smartphone("Samsung", "Note 20 Ultra",  6.9);
        Device laptop1 = new Laptop("Asus", "Triton 500", "Ryzen 7 5800x");
        Device laptop2 = new Laptop("Lenovo", "Thinkpad", "Ryzen 7 259");

        ArrayList<Device> devices = new ArrayList<>();  //holds the interface type so it can store classes that implements Device
        devices.add(phone1); 
        devices.add(phone2);
        devices.add(laptop1);
        devices.add(laptop2);

        for(Device device : devices){   //calls turnOn for each device in list
            device.turnOn();
            System.out.println();
        }


    }
}
