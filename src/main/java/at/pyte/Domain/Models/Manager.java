package at.pyte.Domain.Models;

import java.util.List;

public class Manager extends Employee {
    private List<Employee> employees;

    public Manager(String firstName, String lastName, String employeeId, int age) {
        super(firstName, lastName, employeeId, age);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEMployee(Employee employee) {
        if (employee == null)
            throw new IllegalArgumentException("Employee is null!");

        if (employees == null)
            throw new IllegalStateException("Employees list is not initialized!");

        employees.add(employee);
    }

    @Override
    public void printAll() {
        int index = 0;
        for (Employee employee : employees) {
            index++;
            System.out.println(index + ": " + employee.getFullName());
        }

        super.printAll();

    }

}
