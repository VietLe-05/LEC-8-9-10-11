package Lec8;

class Student57 {

    int id;
    String name;

    Student57() {
        System.out.println("default constructor is invoked");
    }

    Student57(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student57 stu1 = new Student57(111, "karan");
        Student57 stu2 = new Student57(222, "Aryan");
        stu1.display();
        stu2.display();
    }
}
