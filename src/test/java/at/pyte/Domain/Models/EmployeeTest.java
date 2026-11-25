package at.pyte.Domain.Models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    @Test
    void SalaryIncreaseIncreasesSalaryByTen() {
        Employee employee = new Employee("Mustermann", "Max", "E150", 25);
        employee.setSalary(10);
        employee.salaryIncrease(10);
        assertEquals(11, employee.getSalary());
    }

    @Test
    void employeeCanBeUsedAsPerson() {
        Person person = new Employee("Mustermann", "Max", "E150", 25);

        assertEquals("Max Mustermann", person.getFullName());
    }

}
