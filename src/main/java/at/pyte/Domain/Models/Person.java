package at.pyte.Domain.Models;

public class Person {
    private String name; // Nachname nicht voller Name (denk ich mal)
    private String firstName;
    private int age;

    public Person(String firstName, String lastName) {
        if (firstName.isBlank())
            throw new IllegalArgumentException("Firstname is empty!");

        if (lastName.isBlank())
            throw new IllegalArgumentException("Lastname is empty!");

        name = lastName;
        this.firstName = firstName;
    }

    public Person() {
        this("Max", "Mustermann"); // Placeholder
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0)
            throw new IllegalArgumentException("Age is negative!");

        this.age = age;
    }

    public void setName(String firstName, String lastName) {
        if (firstName.isBlank())
            throw new IllegalArgumentException("Firstname is empty!");
        if (lastName.isBlank())
            throw new IllegalArgumentException("Lastname is empty!");

        this.firstName = firstName;
        this.name = lastName;
    }

    public String getFullName() {
        return firstName + " " + name;
    }

}
