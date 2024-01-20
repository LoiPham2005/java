
package mang;

import java.util.Scanner;

public class nhapvainmang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Mời nhập các phần tử: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử " + i + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Các phần tử của mảng là: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử " + i + ": " + arr[i]);
        }
        
        sc.close();
    }
}


