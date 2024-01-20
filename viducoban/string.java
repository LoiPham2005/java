public class string {
    public static void main(String[] args) {
        // String noi = "chao cac em";
        // System.out.println(noi);

        // thêm vào sau chuỗi
        StringBuilder sb = new StringBuilder();
        sb.append("caho cuc cung");
        sb.append("\nanh rat dep trai");
        System.out.println(sb);

        // chèn thêm vào chuỗi
        // sb.insert(3,"ko be oi");
        // System.out.println(sb);

        // xoá vị trí chuỗi
        sb.delete(2, 4);
        System.out.println(sb);

        // đếm số trong chuoi
        System.out.println(sb.length());

        // kiểm tra vị trí đầu tiên của chuỗi
        String viTri = "kkk long hoa long";
        System.out.println("vi tri có chu long ở dau:" + viTri.indexOf("long"));

        // kiểm tra vị trí cuối cùng của chuỗi

        System.out.println("vi tri có chu long ở cuối:" + viTri.lastIndexOf("long"));

        // kiểm tra xem có phải chuỗi con hay không
        String s2 = ".mp3";
        String s3 = "co.mp3";
        boolean check = s3.contains(s2);
        if (check) {
            System.out.println("có .mp3 trong chuỗi");
        } else {
            System.out.println("ko có .mp3 trong chuoi");
        }

        // trích lọc chuỗi con từ chuỗi ban đầu
        String s5= "abcdefgh";
        String s6=s5.substring(3);
        System.out.println(s6);
        String s7=s5.substring(2,4);
        System.out.println(s7);

        // thay thế chuỗi old bằng chuỗi new
        String s8= "helo cac ban tre helo";
        String s9= s8.replace("helo","okkk");
        System.out.println(s9);

        // thay thế chuỗi old đầu tiên bằng chuỗi new
        String s10= "helo helo cac ban tre ";
        String s11= s10.replaceFirst("helo","okkk");
        System.out.println(s11);

        // trin() xoá toàn bộ khoảng trắng ở đầu và cuối
        String s12="         gà lại lập trinhgf";
        String s13=s12.trim();
        System.out.println(s12);
        System.out.println(s13);

        // trin() xoá toàn bộ khoảng trắng ở cuối
        
    }
}
