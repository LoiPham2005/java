public class hocluc {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.xuatRaThongTin();

        HocSinh hs2 = new HocSinh("phamduclong", " xuatsac");
        hs2.xuatRaThongTin();

        //  có 2 kiểu in ra 
        // 1. dùng system.out.println
        // 2. dùng xuatRaThongTin:  (hs2.xuatRaThongTin();) với điều kiện biên class kia phải có phương thức


        // System.out.println(hs2.getHoten());
        // System.out.println(hs2.getHanhKiem());

    //    System.out.println(hs1.getHoten()); 
       System.out.println(hs1.getHanhKiem()); 
       
      System.out.println(hs1.getDiem()); 
        
        // hs1.xuatRaThongTin();

        // hs1.setHoTen("phong");
        // hs1.setDiem(23f);
        // hs2.xuatRaThongTin();

    }
}
