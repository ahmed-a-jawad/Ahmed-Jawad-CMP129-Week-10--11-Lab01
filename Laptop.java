public class Laptop implements Device {
    
    private String brand;
    private String model;
    private String processorType;

    public Laptop(String brand, String model, String processorType){
        this.brand = brand;
        this.model = model;
        this.processorType = processorType;
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

    public String getProcessorType(){
        return processorType;
    }

    public void setProcessorType(String pt){
        pt = processorType;
    }

    @Override 
    public void turnOn(){
        System.out.println("The " + brand + " laptop is starting.");
        System.out.println("Processor " + processorType);
    }
}
