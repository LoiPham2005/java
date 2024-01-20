import java.util.Scanner;

public class baiham {
    public static int tinhTong(int a, int b) {
        System.out.print("ket qua tong la: ");
        return a + b;
    }

    public static void bangCuuChuong(int a1) {
        if (a1 > 10 || a1 < 0) {
            System.out.println("khong co. moi nhap lai");
        } else {
            int tich;
            for (int i = 1; i <= 10; i++) {
                tich = a1 * i;
                System.out.println(a1 + "*" + i + "=" + tich);

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        do {
            System.out.println("nhap vao chuc nang: ");
            x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("nhap vao a:");
                    int a = sc.nextInt();

                    System.out.println("nhap vao b");
                    int b = sc.nextInt();

                    int tong = tinhTong(a, b);
                    System.out.println(tong);
                    break;

                case 2:
                    System.out.println("nhap vao a1:");
                    int a1 = sc.nextInt();
                    bangCuuChuong(a1);

                    break;

                case 0:
                    System.out.println("ket thuc chuong trinh.");
                    break;

                default:
                    System.out.println("moi nhap lai: ");
                    break;
            }
        } while (x != 0);
        sc.close();
    }
}
