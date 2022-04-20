package arraylist.person;

import java.util.ArrayList;

public class Family {
    private ArrayList<Person> personArrayList ;
    private String address;
    private int numberOfMember;

    public Family(){
        this.personArrayList = new ArrayList<>();
    }

    public int size(){
        return personArrayList.size();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfMember() {
        return numberOfMember;
    }

    public void setNumberOfMember(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    public Family(String address, int numberOfMember) {
        this.personArrayList = new ArrayList<>();
        this.address = address;
        this.numberOfMember = numberOfMember;
    }

    public void add(Person person) {
        personArrayList.add(person);
    }

    public int search(String name) {
        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return 0;
    }
    public int search (int age) {
        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getAge() == age) {
                return i;
            }
        }
        return -1;
    }
    public Person maxAge () {
        int max = personArrayList.get(0).getAge();
        for (int i = 0; i < personArrayList.size(); i++) {
            if (personArrayList.get(i).getAge() > max) {
                max = personArrayList.get(i).getAge();
            }
        }
        return personArrayList.get(search(max));
    }
    public void set(String name, Person person) {
        personArrayList.set(search(name), person);
    }
    public void remove(String name) {
        personArrayList.remove(search(name));
    }

    public void display() {

//        for(Person person :personArrayList){
//            System.out.println(person.toString());
//        }
        for (int i = 0; i < personArrayList.size(); i++) {
            System.out.println(personArrayList.get(i).toString());
        }


        System.out.println("Address: " + address + ", Number of member: " + numberOfMember + "\n");
    }


}
