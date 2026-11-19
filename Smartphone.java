public class Smartphone implements Device{
    

    private String brand;
    private String model;
    private double screenSize;

    public Smartphone(String brand, String model, double screenSize){
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String b){
        b = brand;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String m){
        m = model;
    }

    public double getScreenSize(){
        return screenSize;
    }

    public void setScreenSize(double ss){
        ss = screenSize;
    }
    
    @Override
    public void turnOn(){
        System.out.println("The " + brand + " " + model + " smartphone is powering up.");
        System.out.println("Screen size: " + screenSize);
        
    }

}

