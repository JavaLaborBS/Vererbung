package at.pyte.Domain.Models;

public class Employee extends Person {
    private String employeeId;
    private String supervisorId;
    private double salary;

    public Employee(String lastName, String firstName, String empId, int age) {
        super(firstName, lastName);

        if (empId.isBlank())
            throw new IllegalArgumentException("Employee ID is empty!");
        if (age < 0)
            throw new IllegalArgumentException("Age is negative!");

        this.employeeId = empId;
        super.setAge(age);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getSupervisorId() {
        return supervisorId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSupervisorId(String supervisorId) {
        if (supervisorId.isBlank())
            return;

        this.supervisorId = supervisorId;
    }

    public void setSalary(double salary) {
        if (salary < 0)
            throw new IllegalArgumentException("Age is negative!");

        this.salary = salary;
    }

    public void printAll() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Supervisor ID: " + supervisorId);
        System.out.println("Full Name: " + getFullName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Salary: " + salary);
    }

    public void salaryIncrease(double percentChange) {

        // Required name implies that only a positive percentage change is allowed.
        if (percentChange < 0)
            throw new IllegalArgumentException("Percent change is negative!");

        double numberChange = (this.salary * percentChange) / 100;

        salary += numberChange;
    }

}
