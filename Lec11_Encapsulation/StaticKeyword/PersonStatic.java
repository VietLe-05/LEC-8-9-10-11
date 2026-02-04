package Lec11_Encapsulation.StaticKeyword;

public class PersonStatic {

    private String name;
    private static int count = 0; 

    public PersonStatic(String n) {
        name = n;
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        PersonStatic p1 = new PersonStatic("Trang");
        PersonStatic p2 = new PersonStatic("Duong");
        PersonStatic p3 = new PersonStatic("Luong");
    }
}
