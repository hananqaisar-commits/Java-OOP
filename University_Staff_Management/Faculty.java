package University_Staff_Management;

class Faculty extends Employee {
    private String department;
    private double researchBonous;

    public Faculty(String name, int age, String id, double baseSalary, String department, double researchBonous) {
        super(name, age, id, baseSalary);
        this.department = department;
        this.researchBonous = researchBonous;
    }

    public void setDepartment(String department) {
        if (department == null || department.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            this.department = department;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setResearchBonous(double researchBonous) {
        if (researchBonous < 0.0) {
            System.out.println("Invalid");

        } else {
            this.researchBonous = researchBonous;
        }
    }

    public double getResearchBonous() {
        return researchBonous;
    }

    @Override
    public double calcsalary() {
        return this.researchBonous + getBaseSalary();
    }

    @Override
    public String toString() {
        return super.toString()
                + String.format("Department: %s | Research bonous: %.3f\n", getDepartment(), getResearchBonous());
    }
}
