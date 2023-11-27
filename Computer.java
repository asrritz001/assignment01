package activityoops;
public class Computer {// This is class representing computer

 	public String brand;
    public String model;
    public String serialNumber;
    public double price;
	public long SN;
//These are the attributes of a computer
    public Computer(String brand, String model, String serialNumber, double price) {//This is a constructor to initialize computer objects with specified values
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.price = price;
    }
//This is the getter methods tp return the values of the attributes
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void displayComputerInfo(int computerNumber) {    // This is the method to display information about the computer

        System.out.println("Computer # " + computerNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("SN: " + serialNumber);
        System.out.println("Price: $" + price);
    }
    // These are the setter methods to update the values of certain attributes
    public void updateBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void updateModel(String newModel) {
        this.model = newModel;
    }

    public void updateSerialNumber(String newSerialNumber) {
        this.serialNumber = newSerialNumber;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }

}

