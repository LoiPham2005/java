import java.util.Calendar;
import java.util.Scanner;

public class baitapdatetime {
    public static void main(String[] args) {
        int day, month, year, tuoi;
        Scanner input = new Scanner(System.in);
        System.out.println("moi nhap ngay sinh");
        day = input.nextInt();
        System.out.println("moi nhap thang sinh");
        month = input.nextInt();
        System.out.println("moi nhap nam sinh");
        year = input.nextInt();

        Calendar birthday = Calendar.getInstance();
        // set ngày tháng năm sinh cho người dùng nhập vào
        birthday.set(year, month + 1, day);
        // xuất ngày tháng năm sinh
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        System.out.println(" ngay thang nam sinh"+ ngaySinh+"/"+thangSinh+"/"+namSinh);
       
        // tinh tuoi
        // nam gien tai
        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        // tinh
        tuoi= namHienTai-namSinh;
        System.out.println("tuoi cua ban la: "+tuoi);
        input.close();

    }
}
