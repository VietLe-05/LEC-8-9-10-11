package Lec7;

import java.util.Scanner;

public class Lec7_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        String dao = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            dao = dao + str.charAt(i);
        }

        System.out.println("Chuoi da dao nguoc: " + dao);
    }
}
