// Employee.java
public class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String nationalIN;

    public Employee(String name, double annualSalary, int startYear, String nationalIN) {
        super(name);
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.nationalIN = nationalIN;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getnationalIN() {
        return nationalIN;
    }

    public void setnationalIN(String nationalIN) {
        this.nationalIN = nationalIN;
    }
}
