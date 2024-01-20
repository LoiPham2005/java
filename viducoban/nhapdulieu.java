import java.util.Scanner;

public class nhapdulieu {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);

        System.out.println("moi nhap ten: ");
        String ten = a.nextLine();
        System.out.println("ten can in la: " + ten);   

        Scanner b = new Scanner(System.in);
        System.out.println("moi nhap so: ");
        int so = b.nextInt();
        System.out.println("so can in la: " + so);  

        a.close();    
        b.close(); 
    }
}


