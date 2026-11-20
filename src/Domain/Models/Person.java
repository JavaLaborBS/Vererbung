package Domain.Models;

public class Person {
    private String name; // Nachname nicht voller Name (denk ich mal)
    private String firstName;
    public int age;

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

    public void setName(String firstName, String lastName) {
        if (firstName.isBlank())
            return;
        if (lastName.isBlank()) 
            return;

        this.firstName = firstName;
        this.name = lastName;   
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    
}
