public class SinhVien {
    // thuộc tính (giống với biến)

    private String hoTen;

    private double diem;

    // phương thức (các hàm)
    // phương thức không có giá trị trả về

    public SinhVien() {
        this.hoTen = "loi";
        this.diem = 9;
    }

    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;

    }

    public void hienThiThongTin() {
        System.out.println(hoTen + " : " + diem);
    }

    // get
    public String getHoten(){
        return hoTen;
    }
    public double getDiem(){
        return diem;
    }

    // set
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public void setDiem(double diem){
        this.diem = diem;
    }
}
