import java.util.Scanner;

public class Asm {

    // Array to store employee names
    private static String[] tenNhanVien;

    public static void chucNang1() {
        Scanner ssc = new Scanner(System.in);
        System.out.println("Moi nhap so luong nhan vien");
        int n = ssc.nextInt();
        ssc.nextLine(); // Consume the newline character
        tenNhanVien = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Moi nhap ten nhan vien " + (i + 1) + ": ");
            tenNhanVien[i] = ssc.nextLine();
        }
    }

    public static void chucNang2() {
        if (tenNhanVien == null) {
            System.out.println("Danh sach nhan vien chua duoc nhap.");
        } else {
            System.out.println("Danh sach nhan vien:");
            for (int i = 0; i < tenNhanVien.length; i++) {
                System.out.println("Nhan vien " + (i + 1) + ": " + tenNhanVien[i]);
            }
        }
    }

    // Other chucNang methods remain unchanged

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        do {
            System.out.println("*******************\n"
                    + "1. Nhap va xuat danh sach nhan vien\n"
                    + "2. Xoa nhan vien hoac cap nhat thong tin nhan vien\n"
                    + "3. Tim kiem nhan vien theo luong\n"
                    + "4. Sap xep nhan vien theo ho ten va thu nhap\n"
                    + "5. Xuat 5 nhan vien co thu nhap cao nhat cong ty\n"
                    + "6. Tim nhan vien theo khoang luong\n"
                    + "7. Sap xep nhan vien theo ho va ten\n"
                    + "8. Sap xep nhan vien theo thu nhap\n"
                    + "9. Xuat 5 nhan vien co thu nhap cao nhat\n"
                    + "0. Thoat\n"
                    + "******************************\n");
            System.out.println("Moi nhap chuc nang: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    chucNang1();
                    break;

                case 2:
                    chucNang2();
                    break;

                // ... other cases

                case 0:
                    System.out.println("Thoat");
                    break;

                default:
                    System.out.println("Khong ton tai. Moi nhap lai");
                    break;
            }
        } while (menu != 0);
    }
}
