package ro.fasttrackit.lab7;

public class Homework3 {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle("Pepsi",30, 10, true);
        Bottle bottle2 = new Bottle("Cola",50, 60, false);
        Bottle bottle3 = new Bottle("Sprite",40, 5, true);

        printBottle(bottle1);
        bottle1.open();
        bottle1.close();
        printBottle(bottle2);
        printBottle(bottle3);
        System.out.println(bottle3.drink(3));
        bottle2.open();
        System.out.println(bottle3.drink(3));
        System.out.println(bottle2.drink(30));

    }

    public static void printBottle(Bottle bottle) {

        if (bottle.moreLiquid()){
            System.out.println("The " + bottle.getBrand() + " bottle is overflowing.");
        }

    }

}
