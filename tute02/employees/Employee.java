package employees;

public class Employee {
    private String name;
    private int salary;

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
    public String toString() {
        return getClass().getName() + "[Name=" + name + ", salary=" + salary + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) { return true; }
        if (obj == null) { return false; }
        if (this.getClass() != obj.getClass()) { return false; }

        Employee other = (Employee) obj;

        return (name.equals(other.name) && salary == other.salary);
    }

    public static void main(String[] args) {
        Employee a = new Employee("Daniel", 1);
        Employee x = null;
        System.out.println(a.equals(x));
    }
}


