package ro.fasttrackit.lab7;

public class Homework {
    public static void main(String[] args) {
        Person person1 = new Person("Dorel", 56, true);
        Person person2 = new Person("Ilinca", 24, false);
        Person person3 = new Person("Vasile", 60, false);

        printPerson(person1);
        printPerson(person2);
        printPerson(person3);

    }

    public static void printPerson(Person person) {
        if (person.isMarried()) {
            System.out.println(person.getName() + " is " + person.getAge() + " years old and married.");
        } else {
            System.out.println(person.getName() + " is " + person.getAge() + " years old and not married.");
        }
    }

}
