package people;

import java.time.LocalDate;

public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        


        return false;
    }
}
