package University_Staff_Management;

public class AdminStaff extends Employee {
    private String role;
    private int overtimeHours;

    public AdminStaff(String name, int age, String id, double baseSalary, String role, int overtimeHours) {
        super(name, age, id, baseSalary);
        this.role = role;
        this.overtimeHours = overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        if (overtimeHours < 0) {
            System.out.println("Invalid");

        } else {
            this.overtimeHours = overtimeHours;
        }
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setRole(String role) {
        if (role == null || role.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            this.role = role;
        }
    }

    @Override
    public double calcsalary() {
        return getBaseSalary() + (this.overtimeHours * 50);
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Role: %s | Overtime hours: %2d\n", getRole(), getOvertimeHours());
    }
}
