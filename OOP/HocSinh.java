public class HocSinh {
    private String hoTen;
    private float diem;
    private String hanhKiem;

    // contruction
    public HocSinh() {
        hoTen = "phamducloi";
        diem = 7.5f ;
        hanhKiem = "tot";
    }
    public HocSinh(String hoTen, String hanhKiem){
        this.hoTen = hoTen;
        diem = 9.7f ;
        this.hanhKiem = hanhKiem;
    }
    // phương thức
     public void xuatRaThongTin() {
        System.out.println(hoTen +":"+ diem +":" );
    }

    // xem thông tin 
    public String getHoten(){
        return hoTen;
    }
    public String getHanhKiem(){
        return hanhKiem;
    }
    public float getDiem(){
        return diem;
    }

    // sửa thông tin 
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public void setDiem(float diem){
        this.diem = diem;
    }

}
