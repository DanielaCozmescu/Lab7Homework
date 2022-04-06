package ro.fasttrackit.lab7;

public class Homework2 {
    public static void main(String[] args) {
        Product product1 = new Product("Sapun Lichid ", 10, 5, "Sanitare");
        Product product2 = new Product("Balsam ", 18,20,  "Sanitare");
        Product product3 = new Product("Piept pui ", 25, 0, "Carne");
        Product product4 = new Product("Salam ", 86, 3, "Carne");
        Product product5 = new Product("Sampon ", 16, 0, "Sanitare");
        Product product6 = new Product("Perie ", 66, 0, " ");


        printProduct(product1);
        printProduct(product2);
        printProduct(product3);
        printProduct(product4);
        printProduct(product5);
        printProduct(product6);


    }
    public static void printProduct(Product product) {

        if (product.isCategory("Carne")) {
            System.out.println("Preparate din Carne");
        } else if (product.isCategory("Sanitare")) {
            System.out.println("Sanitare");
        } else {
            System.out.println("Produs neintrgistrat");
        }

        if (product.hasStock()) {
            System.out.println(product.getName() + product.getPrice() + " Lei " + product.getQuantity() + " bucati " + "este in stoc.");
        } else {
            System.out.println(product.getName() + product.getPrice() + " Lei " + product.getQuantity() + " bucati " + "nu este in stoc.");
        }


    }
}
