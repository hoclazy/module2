package lopvadoituong.ptbac2;

public class PhuongTrinhBac2 {
    private double a,b,c;

    public PhuongTrinhBac2() {

    }
    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDelta() {

        return  b*b - 4*a*c;
    }

    public double getX1() {
            return ((-b + Math.sqrt(getDelta())) / (2 * a));
        }
    public double getX2() {
        return ((-b-Math.sqrt(getDelta()))/(2*a));
    }
    public void display() {
        if(getDelta()<0) {
            System.out.println("pt vo nghiem");
        }
        if(getDelta()>0) {
            System.out.println("nghiem x1 co gia tri la: " +getX1());
            System.out.println("nghiem x2 co gia tri la: " +getX2());
        }
        if(getDelta()==0) {
            System.out.println("pt co 1 nghiem la: " +(-b/2*a));
        }
    }
}
