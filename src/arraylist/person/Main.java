package arraylist.person;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();

        Family f = new Family("23 nguyen cong chu", 3);
        f.add(new Person("nam", 23, "ky su", 1));
        f.add(new Person("ngoc", 24, "ke toan", 2));
        f.add(new Person("ngan", 22, "HR", 3));

        Family f1 = new Family("25 nguyen cong chu", 4);
        f1.add(new Person("hoang", 28, "lam ruong", 1));
        f1.add(new Person("nghia", 29, "ngan hang", 2));
        f1.add(new Person("chinh", 21, "tho ho", 3));
        f1.add(new Person("dat", 28, "di xay", 4));
        town.add(f);
        town.add(f1);
        f.display();
        f1.display();

        System.out.println(".......xoa........");

        f.remove("nam");
        f.display();

        System.out.println(".......sua........");

        f.set("ngoc", new Person("nga", 24, "ke toan", 2));
        town.display();

        System.out.println(".........sua ho gia dinh..........");
        town.set("25 nguyen cong chu", "21 nguyen cong chu");
        town.display();

        System.out.println(".........max tuoi..........");

        System.out.println("nguoi cao tuoi nhat ho gia dinh 1 la: " +f.maxAge());
        System.out.println("nguoi cao tuoi nhat ho gia dinh 2 la: " +f1.maxAge());

        System.out.println(".........max number..........");
        town.maxNumberOfMember();
    }
}
