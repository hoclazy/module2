package arraylist.university;

public class Main {
    public static void main(String[] args) {
        Manage manage = new Manage();
        manage.add(new BlockA("tdh", "nd", 1));
        manage.add(new BlockB("tdd", "hn", 2));
        manage.add(new BlockA("tdv", "nb", 3));
        manage.display();

        System.out.println("....tim kiem......");
        manage.search(2);

    }
}
