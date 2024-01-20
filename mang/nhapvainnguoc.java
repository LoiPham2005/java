package mang;

import java.util.Scanner;

public class nhapvainnguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap cac phan tu cua mang: ");
        int n = sc.nextInt();
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("phan tu " + (i + 1) + "la:");
            mang[i] = sc.nextInt();
        }
        System.out.println("mang in nguoc la: ");
        for ( int i = n-1; n >= 0; i--) {
            System.out.print(mang[i]);
        }
        sc.close();
    }

}