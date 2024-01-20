package mang;

import java.util.Scanner;

public class diemtheoten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap mang: ");
        int n = scanner.nextInt();

        String[] hoTen = new String[n];
        double[] diem = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("nhap ho ten sinh vien " + i + "la: ");
            scanner.nextLine();
            hoTen[i] = scanner.nextLine();
            System.out.println("nhap diem sinh vien " + i + "la: ");
            diem[i] = scanner.nextDouble();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] < diem[j]) {
                    double temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;

                    String doi = hoTen[i];
                    hoTen[i] = hoTen[j];
                    hoTen[j] = doi;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(hoTen[i] + " " + diem[i]);
        }
        scanner.close();
    }
}
