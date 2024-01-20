// import java.util.Scanner;

// public class vonglapwhile {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("moi nhap so mong muon: ");
//         int n =sc.nextInt();

//         while (n<100 && n>0) {
//             System.out.println("moi ban nhap lai");
//             n = sc.nextInt();
//         }
//         System.out.println("ket thuc.");
//         sc.close();
//     }
// }
import java.util.Scanner;

public class vonglapwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("moi nhap so mong muon: ");
            n = sc.nextInt();

        } while (n < 100 && n > 0);

        System.out.println("ket thuc.");
        sc.close();
    }
}