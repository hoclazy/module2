package AccessModifier;

public class Cars {
    private String name;
    private String hang;
    private String color;
    public static int number;

    public Cars(String name, String hang, String color) {
        this.name = name;
        this.hang = hang;
        this.color = color;
        number++;
    }

    public static void main(String[] args) {
        Cars cars1 = new Cars("CRV","honda","white");
        System.out.println(Cars.number);
        Cars cars2 = new Cars("GLC", "MERCERDES","BLACK");
        System.out.println(Cars.number);
    }

}
