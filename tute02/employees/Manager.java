package employees;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    /**
     * 
     * @param name full name of the manager
     * @param salary salary in cents
     * @param hireDate day they signed the contract
     */
    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    /**
     * 
     * @param hireDate
     */
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    
    @Override
    public String toString() {
        return super.toString() + "HireDate = " + hireDate.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Manager other = (Manager) obj;
        return (hireDate.equals(other.hireDate));
    }

    public static void main(String[] args) {
        Employee a = new Employee("Alicia", 1);
        Manager m = new Manager("Alicia", 1, LocalDate.now());
        System.out.println(a.equals(m));
    }
}
