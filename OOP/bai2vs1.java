public class bai2vs1 {
    public double a;
    public double b;
    public double c;

    public bai2vs1() {
        a = 4;
        b = 8;
        c = 3;
    }
    public bai2vs1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("a="+a+" b="+b+" c="+c);
    }
    public void diem(double a, double b, double c, double d){
        System.out.println("a="+a+" b="+b+" c="+c+ " d="+d);
    }
    public double geta(){
        return a;
    }
    public double getb(){
        return b;
    }
    public double getc(){
        return c;
    }

    public void seta(double a){
        this.a=a;
    }
    public void setb(double b){
        this.b=b;
    }
    public void setc(double c){
        this.c=c;
    }

    public double tinhdelta(){
        return Math.pow(b,2)-4*a*c;
    }
    public void ptbac2(){
        // double delta=tinhdelta();
        double x1=(-b+Math.sqrt(tinhdelta()))/(2*a);
        double x2=(-b-Math.sqrt(tinhdelta()))/(2*a);
        double x=(-b/(2*a));
        if (tinhdelta()>0){
            System.out.println("nghiem phuong trinh x1 la: "+x1+"va"+x2); 
        }else if(tinhdelta()==0){
            System.out.println("nghiem phuong trinh x1 la: "+x);
        }else{
            System.out.println("phuong trinh vo nghiem");
        }
    }
}
