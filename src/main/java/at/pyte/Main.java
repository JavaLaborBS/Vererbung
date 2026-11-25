package at.pyte;

import at.pyte.Domain.Models.Employee;
import at.pyte.Domain.Models.Person;

public class Main {
    public static void main(String[] args) {

        // Schreibe eine Klasse Main mit einer main-Methode, die eine Person und zwei Employee-Objekte anlegt und alle Methoden aufruft.
        Person person = new Person("Max", "Mustermann");
        Employee employee1 = new Employee("Müller", "Anna", "E123", 30);
        Employee employee2 = new Employee("Schmidt", "Peter", "E456", 40);
    
        System.out.println("Person:");
        System.out.println("Full Name: " + person.getFullName());

        System.out.println("\nEmployee 1:");
        employee1.printAll();

        System.out.println("\nEmployee 2:");
        employee2.salaryIncrease(10); // Increase salary by 10%
        employee2.printAll();
    }
}
