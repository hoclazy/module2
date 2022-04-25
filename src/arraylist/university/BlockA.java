package arraylist.university;

public class BlockA extends University{
    public final String blockA = "block A";
    public final String math = "math";
    public final String physics = "physics";
    public final String chemistry = "chemistry";

    public BlockA() {
    }

    public BlockA(String name, String address, int priority) {
        super(name, address, priority);
    }

    @Override
    public String toString() {
        return "BlockA{" + super.toString() +
                "blockA='" + blockA + '\'' +
                ", math='" + math + '\'' +
                ", physics='" + physics + '\'' +
                ", chemistry='" + chemistry + '\'' +
                '}';
    }
}
