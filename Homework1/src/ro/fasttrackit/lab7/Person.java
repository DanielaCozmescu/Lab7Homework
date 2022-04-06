package ro.fasttrackit.lab7;

public class Person {
    private String name;
    private int age;
    private boolean married;


    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isMarried() {
        return married;
    }
}
