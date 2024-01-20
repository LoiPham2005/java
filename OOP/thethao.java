import java.util.Scanner;

public class thethao {
    private String hoTen;
    private double diem;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ho ten:");
        hoTen = sc.nextLine();
        System.out.println("nhap diem:");
        diem = sc.nextDouble();

        sc.close();
    }

    public void xuatThongTin() {
        System.out.println("hoTen cua sinh vien la: " + hoTen);
        System.out.println("diem cua sinh vien la: " + diem);
    }

    public void xepLoaiHocLuc() {
        if (diem >= 9.0) {
            System.out.println("Xếp loại: Xuất sắc");
        } else if (diem >= 8.0) {
            System.out.println("Xếp loại: Giỏi");
        } else if (diem >= 6.5) {
            System.out.println("Xếp loại: Khá");
        } else if (diem >= 5.0) {
            System.out.println("Xếp loại: Trung bình");
        } else {
            System.out.println("Xếp loại: Yếu");
        }

    }

    public static void main(String[] args) {

        thethao sv = new thethao();
        sv.nhapThongTin(); // Nhập thông tin sinh viên
        System.out.println("Thông tin sinh viên:");
        sv.xuatThongTin(); // Xuất thông tin sinh viên
        sv.xepLoaiHocLuc(); // Xếp loại học lực
    }
}
