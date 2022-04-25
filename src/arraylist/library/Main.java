package arraylist.library;

public class Main {
    public static void main(String[] args) {
            Manage mn = new Manage();
            mn.add(new Book(111, "nxb Giao Duc", 10000, "Nguyen Nhat Anh", 344));
            mn.add(new Magerzine(112, "nxb Van Hoa", 11011, 19042022, 042022 ));
            mn.add(new Newspaper(113, "nxb Xay Dung", 9999, 21042022));

            mn.display();

        System.out.println("...........timkiem.........");
        System.out.println("vi tri can tim la: " +mn.search(1));
        System.out.println("......xoa.............");
            mn.remove(2);
            mn.display();
//        System.out.println(".....xoa.........");
//        mn.remove(112);
//        mn.display();
    }
}
