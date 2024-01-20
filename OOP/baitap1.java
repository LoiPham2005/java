public class baitap1 {
    public static void main(String[] args) {

        baitap1vs1 hs1 = new baitap1vs1();

        System.out.println("dien tich hinh chu nhat la: " + hs1.dienTichhcn());
        System.out.println("chu vu hinh chu nhat la: " + hs1.chuVihcn());


        baitap1vs1 hs2 = new baitap1vs1(8,9);
        System.out.println("dien tich hinh chu nhat la: " + hs2.dienTichhcn());
        System.out.println("chu vu hinh chu nhat la: " + hs2.chuVihcn());
      
        System.out.println(hs2.getchieuDai());
        System.out.println(hs2.getchieuRong());

        hs2.setChieuDai(2);
        System.out.println(hs2.getchieuDai());

        hs2.setChieuRong(3);
        System.out.println(hs2.getchieuRong());

        System.out.println(hs2.dienTichhcn());
       System.out.println(hs2.chuVihcn());
    }
}
