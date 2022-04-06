package ro.fasttrackit.lab7;

public class Bottle {
    private String brand;
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;


    public Bottle(String brand, int totalCapacity, int availableLiquid, boolean open) {
        this.brand = brand;
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public String getBrand() {
        return brand;
    }

    public void open() {
        if (isOpen()){
            System.out.println("The " + this.getBrand() + " bottle is already open");
        } else {
            this.open = true;
            System.out.println("The " + this.getBrand() + " bottle is now open");
        }
    }

    public void close(){
        if (isClosed()){
            System.out.println("The " + this.getBrand() + " bottle is already closed");
        } else {
            this.open = false;
            System.out.println("The " + this.getBrand() + " bottle is now closed");
        }
    }

    public boolean isOpen() {
        return open;
    }

    boolean isClosed() {
        return !open;
    }

    boolean moreLiquid(){
        return availableLiquid > totalCapacity;
    }

    boolean hasAvailableLiquid() {
        return availableLiquid > 0;
    }

    int getAvailableLiquid() {
        return availableLiquid;
    }

    int availableCapacity() {
        return totalCapacity - availableLiquid;
    }

    String drink(int quantity){
        if(isClosed()) {
            return "You must open the bottle  in order to drink from it";
        }
        if (availableLiquid >= quantity) {
            availableLiquid = availableLiquid - quantity;
            return "You drank " + quantity + " and you have left " + availableLiquid + " juice";
        } else {
            return "You don't have enough juice.";
        }
    }



}
