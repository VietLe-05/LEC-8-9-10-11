package Lec7;

import java.util.Scanner;

public class Lec7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = sc.nextLine();
        
        int dem=0;
        boolean n = false;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' ' && n == false){
                dem++;
                n = true;
            }else if(str.charAt(i) == ' '){
                n = false;
            }
        }
        System.out.print("So tu trong chuoi la: " + dem);
    }
}
