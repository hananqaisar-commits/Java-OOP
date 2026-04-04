package University_Staff_Management;

class Person {
    private String name;
    private int age;
    public static int count;

    public Person(String name, int age) {
        ++count;
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Invalid");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Invalid");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void count() {
        System.out.print("---Staff " + count + "---\n");
    }

    @Override
    public String toString() {
        count();
        return String.format("Name: %s | Age: %2d \n", getName(), getAge());
    }
}
