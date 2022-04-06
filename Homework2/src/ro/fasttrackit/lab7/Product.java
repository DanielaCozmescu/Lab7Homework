package ro.fasttrackit.lab7;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private String category;

    public Product(String name, int price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    boolean hasStock(){
        return quantity != 0;
    }

    boolean isCategory(String category){
        return this.category.equals(category);
    }

}
