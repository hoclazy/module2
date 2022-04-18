package abstractandinterface.lophinhhoc;

public class AbstractInterface {
    public static void main(String[] args) {
        Shape[] hinh1 = new Shape[1];
        hinh1[0] = new Circle(6, 8, 8);
        Shape[] hinh2 = new Shape[1];
        hinh2[0] = new Circle(6, 8, 8);

        for (Shape elements1 : hinh2) {
            elements1.resize(2);
            System.out.println(elements1);
        }


        Circle cc = new Circle();
        for (Shape elements : hinh1) {
            System.out.println(elements);
            if (elements instanceof Circle) {
                cc.howToColor();

            }
        }
    }
}