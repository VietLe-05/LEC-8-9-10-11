package Lec8_ObjectAndClass;

public class Student54 {
    int id;
    String name;
    
    Student54(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){System.out.println(id + " " + name);}
    
    public static void main(String[] args) {
        Student stu1 = new Student(111,"Karan");
        Student stu2 = new Student(222,"Aryan");
        stu1.display();
        stu2.display();
    }
}
