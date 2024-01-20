package mang;

public class bai3 {
    public static void main(String[] args) {
        int [] arr = new int[]{6,7,2,9,1,};
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    
        System.out.println("mang dao nguoc la: ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
