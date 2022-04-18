package abstractandinterface.animal;

public class test {
    public static void main(String[] args) {
        animal[] arr = new animal[2];
        arr[0] = new Tiger();
        arr[1] = new chicken();
        for (animal ani:arr) {
            System.out.println(ani.makeSound());
            if ( ani instanceof chicken) {
                interfaceEdible edible = (chicken) ani;
                System.out.println(edible.howToEat());
            }

        }
        fruit[] ft = new fruit[2];
        ft[0] = new apple();
        ft[1] = new orange();
        for (fruit fru: ft) {
            System.out.println(fru.howToEat());
        }
    }
}
