public class TBC {
    public static void main(String[] args) {
        int tang=0;
        int cong=0;
        for (int i=27; i<=250; i++){
            if (i%3==0){
                cong+=i;
             tang++;
            }
        }
        int tong = cong/tang;
        System.out.println("ket qua la: "+tong);
    }
}
