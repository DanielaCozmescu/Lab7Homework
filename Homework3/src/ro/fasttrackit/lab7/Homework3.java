package ro.fasttrackit.lab7;

public class Homework3 {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle("Pepsi",30, 10, true);
        Bottle bottle2 = new Bottle("Cola",50, 60, false);
        Bottle bottle3 = new Bottle("Sprite",40, 0, true);

        printBottle(bottle1);
        bottle1.open();
        bottle1.closed();
        printBottle(bottle2);
        printBottle(bottle3);

    }

    public static void printBottle(Bottle bottle) {

        if (bottle.moreLiquid()){
            System.out.println("The " + bottle.getBrand() + " bottle is overflowing.");
        }

    }

}
