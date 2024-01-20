package mang;

import java.util.Scanner;
import java.util.Arrays;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu: [" + (i + 1) + "]la:");
            a[i] = sc.nextInt();
        }

        // Arrays.sort(a);
        // System.out.println("mang sau tang la: ");
        // System.out.println(Arrays.toString(a));

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int tam;
                if (a[i] < a[j]) {
                    tam = a[i];
                    a[i] = a[j];
                    a[j] = tam;
             
                }
            }
        }
        System.out.println("mang sau tang la: ");
        System.out.println(Arrays.toString(a));
        // for (int i = 0; i < n; i++) {
        //     System.out.println(a[i]);
        // }
        sc.close();
    }
}
