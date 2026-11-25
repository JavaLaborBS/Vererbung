package at.pyte.Domain.Models;

public class Employee extends Person {
    private String employeeId;
    private String supervisorId;
    private long salary;

    public Employee(String lastName, String firstName, String empId, int age) {
        super(firstName, lastName);

        if (empId.isBlank())
            throw new IllegalArgumentException("Employee ID is empty!");
        if (age < 0)
            throw new IllegalArgumentException("Age cannot be negative!");

        this.employeeId = empId;
        this.age = age;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setSupervisorId(String supervisorId) {
        if (supervisorId.isBlank())
            return;

        this.supervisorId = supervisorId;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public void setSalary(long salary) {
        if (salary < 0)
            return;

        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }

    public void printAll() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Supervisor ID: " + supervisorId);
        System.out.println("Full Name: " + getFullName());
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public void salaryIncrease(long amount) {
        if (amount < 0)
            return;

        salary += amount;
    }

}
