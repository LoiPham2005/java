package mang;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("moi nhap mang:");
        int a= sc.nextInt();
        int [] mang = new int[a];

        for (int i=0;i<a;i++){
            System.out.println("phan tu "+i+ "la: ");
            mang[i]= sc.nextInt();
        }
        int soLon=mang[0];
        for (int i=0;i<a;i++){
          
            if(soLon<mang[i]){
                soLon=mang[i];
            }
         
        }
        System.out.println("mang co phan tu lon nhat la: "+soLon);

        sc.close();
    }
}
