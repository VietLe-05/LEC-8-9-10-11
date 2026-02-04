package Lec11_Encapsulation.StaticKeyword;

public class PersonNonStatic {

    private String name;
    private int count = 0; 

    public PersonNonStatic(String n) {
        name = n;
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        PersonNonStatic p1 = new PersonNonStatic("Trang");
        PersonNonStatic p2 = new PersonNonStatic("Duong");
        PersonNonStatic p3 = new PersonNonStatic("Luong");
    }
}

