import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        children c1 = new children();
        c1.name = "Hanan Qaisar";
        c1.age = 17;
        c1.school = "Comsat University Islamabad";
        c1.Gender = "Male";
        sc.close();

        System.out.println("Name is : " + c1.name);
        System.out.println("Institution is : " + c1.school);
    }
}

class grandfather {

    public String name;
    public int age;
    public String Gender;

}

class children extends grandfather {
    public String school;
    public String rollno;

}
