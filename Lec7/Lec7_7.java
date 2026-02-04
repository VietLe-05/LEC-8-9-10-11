package Lec7;

import java.util.Scanner;

public class Lec7_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        String so = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                so = so + ch; 
            } else {
                if (!so.equals("")) {
                    System.out.print(so + " ");
                    so = "";
                }
            }
        }

        if (!so.equals("")) {
            System.out.print(so);
        }
    }
}
