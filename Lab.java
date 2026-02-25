class Students {
    private final int MAX_MARKS = 100;
    String name;
    int rollNo;
    double marks;
    static String uniName = "Comsats University Islamabad, Lahore Campus";
    static int studentCount = 0;

    public void displayStudent(String a, int b, double c) {
        name = a;
        rollNo = b;
        marks = c;
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Obtained Marks: " + marks);
    }

    public void maxMarks() {
        System.out.println("Max Marks is: " + MAX_MARKS);
    }

    public void calculategrade(double grade) {
        if (grade > 90) {
            System.out.println("Grade is: A");
        } else if (grade > 80) {
            System.out.println("Grade is: B");
        } else if (grade > 65) {
            System.out.println("Grade is: C");
        } else if (grade > 50) {
            System.out.println("Grade is: D");
        } else if (grade < 50) {
            System.out.println("Grade is: F");
        }

    }

    public static void displayUni() {
        Students.studentCount++;
        System.out.println(uniName);
    }
}

class Info {// execute it by command java Info
    public static void main(String[] args) {
        Students s1 = new Students();
        double marks = 95.45;

        s1.maxMarks();
        s1.displayStudent("Hanan Qaisar", 187, marks);
        Students.displayUni();// i am aceesing it byy class name bcz this is static
        s1.calculategrade(marks);

    }
}