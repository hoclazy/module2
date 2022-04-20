package arraylist.person;

import java.util.ArrayList;

public class Town {
    private ArrayList<Family> familyArrayList= new ArrayList<>();

    public Town() {
        this.familyArrayList = familyArrayList;
    }

    public void add(Family family) {
        familyArrayList.add(family);
    }

    public int search(String address) {
        for (int i = 0; i < familyArrayList.size(); i++) {
            if (familyArrayList.get(i).getAddress().equals(address)) {
                return i;
            }
        }
        return -1;
    }

    public void set(String address, String family) {
        familyArrayList.get(search(address)).setAddress(family);
    }

    public void remove(String address) {
        familyArrayList.remove(search(address));
    }
    public int search (int numberOfMember) {
        for (int i = 0; i < familyArrayList.size(); i++) {
            if (familyArrayList.get(i).getNumberOfMember() == numberOfMember) {
                return i;
            }
        }
        return -1;
    }
    public void maxNumberOfMember() {
        int max = familyArrayList.get(0).getNumberOfMember();
        for (int i = 0; i < familyArrayList.size(); i++) {
            if (familyArrayList.get(i).getNumberOfMember()> max) {
                max = familyArrayList.get(i).getNumberOfMember();
            }
        }
        System.out.println("Ho gia dinh co nhieu nguoi nhat la: " + max);
    }
    public void display(){
        for(int i = 0; i < familyArrayList.size(); i++){
            System.out.println("Ho gia dinh " + (i+1));
            familyArrayList.get(i).display();
        }
    }

}
