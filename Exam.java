import java.util.Scanner;

class Student {
    static String universityName = "Comsat University";
    static int studentCount = 0;
    String name;

    int rollNo;
    double marks;
    final int max = 100;

    Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        studentCount++;
    }

    void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("Marks: " + marks);
        displayMax();
    }

    static void displayUniversity() {
        System.out.println("University: " + universityName);
    }

    public void displayMax() {
        System.out.println("Max marks: " + max);
    }

    public static void chgUniversity() {
        Scanner input = new Scanner(System.in);

        System.out.println("Change University naem: (0 for cancel)");
        int i = input.nextInt();
        input.nextLine();// it clear the previous new line problem

        if (i != 0) {

            System.out.println("Enter univerity name: ");
            universityName = input.nextLine();
            System.out.println("University name: " + universityName);
        } else {
            System.out.println("\n");
        }
    }
}

public class Exam {
    public static void main(String[] args) {
        Student s1 = new Student("Hanan Qaisar", 187, 54);
        Student s2 = new Student("Ahtisham Qaisar", 187, 67);
        Student s3 = new Student("Ali", 187, 84);
        s1.displayStudentInfo();
        s1.chgUniversity();
        Student.displayUniversity();

        s2.displayStudentInfo();
        Student.displayUniversity();

        s3.displayStudentInfo();
        Student.displayUniversity();
    }
}
// 1. Create 3 student objects and display their information.
// 2. Add a static variable courseName.
// 3. Add a final variable PASSING_MARKS.
// 4. Create a static method to change university name.
// 5. Observe the difference between static and non-static members.