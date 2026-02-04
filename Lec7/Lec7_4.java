package Lec7;

import java.util.Scanner;

public class Lec7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();

        String kq = "";
        boolean laKhoangTrang = false;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c != ' ') {
                kq = kq + c;
                laKhoangTrang = false;
            } else {
                if (!laKhoangTrang) {
                    kq = kq + ' ';
                    laKhoangTrang = true;
                }
            }
        }

        if (kq.length() > 0 && kq.charAt(0) == ' ') {
            kq = kq.substring(1);
        }
        if (kq.length() > 0 && kq.charAt(kq.length() - 1) == ' ') {
            kq = kq.substring(0, kq.length() - 1);
        }

        System.out.println("Chuoi da xoa khoang trang: " + kq);
    }
}
