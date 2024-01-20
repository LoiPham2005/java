import java.util.Scanner;

public class baitapcontinue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap so: ");
        int a = sc.nextInt();

        int tong = 0;
        if (a % 2 != 0) {
            for (int i = 0; i <= a; i++) {
                if (i % 2 != 0) {

                    if (i == 3) {
                        continue;
                    } else {
                        tong += i;
                    }
                }
            }
            System.out.println("tong so le la: " + tong);
        } else {
            System.out.println("toi khong tinh so chan");
        }

        sc.close();
    }

}
