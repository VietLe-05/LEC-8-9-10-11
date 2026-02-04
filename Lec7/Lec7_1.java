package lec7_1;

import java.util.Scanner;

public class Lec7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        int soKT = str.length();
        System.out.println("So ky tu cua chuoi la: " + soKT);
    }  
}
