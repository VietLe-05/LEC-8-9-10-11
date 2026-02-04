package Lec11_Encapsulation.StaticKeyword;

class StudentChange{

    int rollno;
    String name;
    static String college = "DTU";

    static void change() {
        college = "BBDIT";
    }

    StudentChange(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        StudentChange.change();
        StudentChange sc1 = new StudentChange(111, "Trang");
        StudentChange sc2 = new StudentChange(222, "Duong");
        sc1.display();
        sc2.display();
    }
}
