import java.util.Scanner;

public class toan3ngoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap so diem: ");
        float diem= sc.nextInt();

        String kq = (diem >=8)? "gioi":((diem>=6.5 && diem<8)? "kha":(diem>=5 && diem<6.5)? "trung binh": "yeu");
        System.out.println(kq);
        sc.close();
    }
}
