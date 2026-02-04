package lec8;

public class Student {
    int id;
    String name;
    
    Student(int i, String n){
        id = i;
        name = n;
    }
    void display(){System.out.println(id + " " + name);}
    
    public static void main(String[] args) {
        Student stu1 = new Student(111,"Karan");
        Student stu2 = new Student(222,"Aryan");
        stu1.display();
        stu2.display();
    }
}
