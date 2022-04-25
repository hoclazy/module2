package arraylist.university;

public class BlockC extends University{
    public final String block = "C";
    public final String literary = "literary";
    public final String history = "history";
    public final String geography = "geography";

    public BlockC() {
    }

    public BlockC(String name, String address, int priority) {
        super(name, address, priority);
    }

    @Override
    public String toString() {
        return "BlockC{" + super.toString() +
                "block='" + block + '\'' +
                ", literary='" + literary + '\'' +
                ", history='" + history + '\'' +
                ", geography='" + geography + '\'' +
                '}';
    }
}
