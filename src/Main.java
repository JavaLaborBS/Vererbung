import Domain.Models.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Doe", "John", "E123", 30);
        emp.setSupervisorId("S456");
        emp.setSalary(50000);
        
        emp.printAll();
    }
}
