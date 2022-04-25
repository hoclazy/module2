package arraylist.university;

import java.util.ArrayList;

public class Manage {
    ArrayList<University> universityArrayList = new ArrayList<>();

    public void add(University university) {
        universityArrayList.add(university);
    }

    public void search(int number) {
        for (int i = 0; i < universityArrayList.size(); i++) {
            if (universityArrayList.get(i).getNumber() == number) {
                System.out.println(universityArrayList.get(i));
            }
        }
    }
    public void display() {
        for (int i = 0; i < universityArrayList.size(); i++) {
            System.out.println(universityArrayList.get(i));
        }
    }
}
