package abstractandinterface.animal;

public class chicken extends animal implements interfaceEdible{
    @Override
    public String makeSound() {
        return "chicken: cuc ta cuc tac";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
