package ngoailevadebug;

import java.util.Scanner;

public class Trianggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Trianggle tamGiac = new Trianggle();
        System.out.println("nhap canh a: ");
        int a = sc.nextInt();

        System.out.println("nhap canh b: ");
        int b = sc.nextInt();

        System.out.println("nhap canh c: ");
        int c = sc.nextInt();

        if (a < 0 || b < 0 || c < 0) {
            try {
                throw new IllegalTriangleException();
            }catch (IllegalTriangleException e) {
                System.out.println(e);
            }
        }
        if ( a + b < c || a + c < b || b+c < a ) {
            try {
                throw new IllegalTriangleException();
            }catch (IllegalTriangleException e) {
                System.out.println(e);
            }
        }

    }
}

class IllegalTriangleException extends Exception {
    /**
     * Returns a string representation of the object.
     *
     * @return a string representation of the object.
     * @apiNote In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * The string output is not necessarily stable over time or across
     * JVM invocations.
     * @implSpec The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     */
    @Override
    public String toString() {
        return "tam giac chua hop le";
    }
}
