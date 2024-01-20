public class baicoban {
    public static void main(String[] args){
        // khoi tạo đói tượng thuộc class sinh viên
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();

        sv1.hienThiThongTin();
        sv2.hienThiThongTin();

        SinhVien sv3 = new SinhVien( "Tèo");
        sv3.hienThiThongTin();

        SinhVien sv4 = new SinhVien("ti", 9.5);
        sv4.hienThiThongTin();

        System.out.println(sv4.getHoten());
        System.out.println(sv4.getDiem());

        // thay đổi họ tên
        sv4.setHoTen("thanh");
        sv4.setDiem(4.4);
        sv4.hienThiThongTin();
    }
}