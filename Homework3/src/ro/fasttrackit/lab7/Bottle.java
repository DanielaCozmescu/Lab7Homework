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

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getAvailableLiquid() {
        return availableLiquid;
    }

    public void setAvailableLiquid(int availableLiquid) {
        this.availableLiquid = availableLiquid;
    }

    public void open() {
        if (isOpen()){
            System.out.println("The " + this.getBrand() + " bottle is already open");
        } else {
            this.open = true;
            System.out.println("The " + this.getBrand() + " bottle is now open");
        }
    }

    public void closed(){
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

    public void setOpen(boolean open) {
        this.open = open;
    }

    boolean moreLiquid(){
        return availableLiquid > totalCapacity;
    }

}
