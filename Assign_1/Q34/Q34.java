// TestEmployee.java
public class Q34 {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("John Doe", 50000, 2020, "ABC123");

        // Displaying employee information
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Start Year: " + employee.getStartYear());
        System.out.println("National Insurance Number: " + employee.getnationalIN());

        // Updating employee information
        employee.setAnnualSalary(55000);
        employee.setStartYear(2021);

        // Displaying updated employee information
        System.out.println("\nUpdated Employee Information:");
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Start Year: " + employee.getStartYear());
    }
}
