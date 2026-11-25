package at.pyte.Domain.Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    void getFullNameReturnsFirstAndLastNameSeparatedBySpace() {
        Person person = new Person("Max", "Mustermann");

        assertEquals("Max Mustermann", person.getFullName());
    }
}
