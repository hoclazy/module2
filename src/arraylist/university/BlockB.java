package arraylist.university;

public class BlockB extends University {
    public final String block = "B";
    public final String math = "math";
    public final String physics = "physics";
    public final String biological = "biological";

    public BlockB() {
    }

    public BlockB(String name, String address, int priority) {
        super(name, address, priority);
    }

    @Override
    public String toString() {
        return "BlockB{" + super.toString() +
                "block='" + block + '\'' +
                ", math='" + math + '\'' +
                ", physics='" + physics + '\'' +
                ", biological='" + biological + '\'' +
                '}';
    }
}
