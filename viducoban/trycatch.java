import java.util.Scanner;

public class trycatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("moi nhap vao so: ");
        int nhap= sc.nextInt();
        System.out.println("so da nhap"+nhap);
        // }catch(ArithmeticException ex){ // câu lệnh bắt lỗi toán học
        //     System.out.println("bai bị loi toán hoc");
        //     ex.printStackTrace();  // câu lệnh chỉ ra lỗi
        
        }catch( Exception ex ){  // câu lệnh bắt lỗi chung
            System.out.println("bai nay bi loi");
            ex.printStackTrace();
        }
        System.out.println("ket thuc bai lam");
        sc.close();
    }
}
