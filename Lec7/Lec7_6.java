package Lec7;

import java.util.Scanner;

public class Lec7_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap chuoi: ");
        String str = sc.nextLine();
        
        System.out.println("Nhap tu muon thay: ");
        String tuCu = sc.nextLine();
        
        System.out.println("Nhap tu moi: ");
        String tuMoi = sc.nextLine();
        
        String result = "";
        String tu = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                tu = tu + ch; 
            } else {
                if (tu.equals(tuCu)) {
                    result = result + tuMoi;
                } else {
                    result = result + tu;
                }
                result = result + " ";
                tu = "";
            }
        }

        if (tu.equals(tuCu)) {
            result = result + tuMoi;
        } else {
            result = result + tu;
        }

        System.out.println("Chuoi sau khi thay: " + result);
    }
}
