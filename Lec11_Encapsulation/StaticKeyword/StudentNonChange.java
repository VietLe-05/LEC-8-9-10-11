package Lec11_Encapsulation.StaticKeyword;

class StudentNonChange{

    int rollno;
    String name;
    static String college = "DTU";

    static void change() {
        college = "BBDIT";
    }

    StudentNonChange(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String args[]) {
        StudentNonChange snc1 = new StudentNonChange(111, "Trang");
        StudentNonChange snc2 = new StudentNonChange(222, "Duong");
        snc1.display();
        snc2.display();
    }
}
