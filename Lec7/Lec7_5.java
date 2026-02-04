package Lec7;

import java.util.Scanner;

public class Lec7_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        System.out.print("Nhap ky tu muon dem: ");
        char kyTu = sc.next().charAt(0);

        int dem = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu) {
                dem++;
            }
        }

        System.out.println("So lan xuat hien: " + dem); 
    }
}
