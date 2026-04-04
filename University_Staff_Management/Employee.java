package University_Staff_Management;

class Employee extends Person {
    private String id;
    private double baseSalary;

    public Employee(String name, int age, String id, double baseSalary) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.id = id;
    }

    public double calcsalary() {
        return this.baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            System.out.println("invalid");
        } else {
            this.baseSalary = baseSalary;
        }
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            this.id = id;
        }
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Id: %s | Base salary: \n", getId(), getBaseSalary())
                + String.format(" Final Salary: %.3f\n", calcsalary());
    }

}
