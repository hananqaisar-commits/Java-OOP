public class PracticeEqualsmethod {

    public static void main(String[] args) {

        Student Hanan1 = new Student("Hanan", 187, 3.13, "CS");
        Student Hanan2 = new Student("Hanan", 187, 3.13, "CS");
        Student Hanan3 = new Student("Hanan Qaisar", 187, 3.13, "CS");

        System.out.println(Hanan1.equals(Hanan2));
        System.out.println(Hanan2.equals(Hanan3));

        String name1 = "Hanan Qaisar";// it is stored in string pool
        String name2 = "Hanan Qaisar";// now name2 is pointing to same object in string pool
        // simple it mean Both "Hanan Qaisar" strings are stored once in memory.so,
        // name1==name2 have same reference and give me true
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
    }
}

class Student {
    public String name;
    public int rollNo;
    public double cgpa;
    public String department;

    public Student(String name, int rollNo, double cgpa, String department) {
        this.name = name;
        this.cgpa = cgpa;
        this.department = department;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (object == null) {
            return false;
        }
        if (!(object instanceof Student)) {// it mean object is type of Student if yes then ! make it false and it mean
                                           // object is NOT a Student → return false and further conditions will not
                                           // check
            return false;
        }

        Student other = (Student) object;
        if (this.name == null && other.name != null)
            return false;
        if (this.name != null && !this.name.equals(other.name))
            return false;

        if (this.department == null && other.department != null)
            return false;
        if (this.department != null && !this.department.equalsIgnoreCase(other.department))
            return false;
        if (this.rollNo != other.rollNo)
            return false;
        if (this.cgpa != other.cgpa)
            return false;

        return true;
    }
}