import java.util.Scanner;

public class baitapswitchcase {
    public static void main(String[] args) {
        int chucNang;
        do {
            Scanner sc = new Scanner(System.in);

            System.out.print("moi nhap chuc nang: ");

            chucNang = sc.nextInt();
            switch (chucNang) {
                case 1:
                    System.out.println("ten la: phamducloi");
                    break;
                case 2:
                    System.out.println("ten tac gia: pham");
                    break;
                case 0:
                    System.out.println("ket thuc");
                    break;
                default:
                    System.out.println("moi nhap lai");
                    break;
            }
            sc.close(); 
        } while (chucNang != 0);
        
    }
}
