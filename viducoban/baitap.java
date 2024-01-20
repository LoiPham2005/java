import java.util.Scanner;

public class baitap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("moi nhap ban kinh: ");
        int r = sc.nextInt();
        
        double chuVi= 2* Math.PI* r;

        double dienTich= Math.PI* Math.pow(r,2);
        System.out.println("chu vi la: "+ chuVi);
        System.out.println("dien tich la: "+ dienTich);
        sc.close();
    }
}
