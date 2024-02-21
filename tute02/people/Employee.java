package people;

public class Employee {
    private String name;
    private int salary;


    /**
     * Constructor for an Employee
     * @param name legal name on birth certificate
     * @param salary dollars per year
     */
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getSalary() {
        return salary;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;

        // Comparing memory addresses
        if (this == obj) return true;

        // Make sure classes are the same
        if (this.getClass() != obj.getClass()) return false;

        Employee oth = (Employee) obj;
        return (this.getName().equals((oth.getName())) && this.getSalary() == oth.getSalary());
    }

    // this.getName() <-- string
    // oth.getName() <-- string

    @Override
    public String toString() {
        return this.getClass().toString() + " name =" + name + "salary=" + salary;
    }
    // this.getClass()


    public static void main(String[] args) {
        Employee a = new Employee("Gary", 1);
        Employee b = new Employee("Gary", 1);

        System.out.println(a);
    }


}
