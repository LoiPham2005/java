public class baitap1vs1 {
    public double chieuDai;
    public double chieuRong;

    public baitap1vs1(){
        chieuDai=5;
        chieuRong=6;
    }
    public baitap1vs1(double chieuDai,double chieuRong){
        this.chieuDai=chieuDai;
        this.chieuRong=chieuRong;
    }
    

    public double getchieuDai(){
        return chieuDai;
    }
    public double getchieuRong(){
        return chieuRong;
    }
    public void setChieuDai(double chieuDai){
        this.chieuDai=chieuDai;
    }
    public void setChieuRong(double chieuRong){
        this.chieuRong=chieuRong;
    }


    public double dienTichhcn(){
        return chieuDai*chieuRong;
    }
    public double chuVihcn(){
        return (chieuDai+chieuRong)*2;
    }
}
