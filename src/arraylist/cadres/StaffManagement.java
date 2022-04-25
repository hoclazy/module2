package arraylist.cadres;

import java.util.ArrayList;
import java.util.List;

public class StaffManagement {
    public static void main(String[] args) {

        List<Cadres> cadresList = new ArrayList<>();

        cadresList.add(new Cadres("Trinh Xuan Hung", 27, "male", "23 nguyen cong chu"));
        cadresList.add(new Cadres("Phung Xuan Nam", 42, "male", "29 nguyen cong chu"));
        cadresList.add(new Cadres("Nguyen Ngoc Anh", 24, "female", "26 nguyen cong chu"));

        System.out.println("danh sach can bo: ");
        for (int i = 0; i < cadresList.size(); i++) {
            System.out.println(cadresList.get(i));
        }
        cadresList.toString();

        System.out.println("........tìm kiếm........");
        int indexOf = -1;
        for (int i = 0; i < cadresList.size(); i++) {
            if (cadresList.get(i).getFullName().equals("Nguyen Ngoc Anh")) {
                indexOf = i;
                break;
            }
        }

        if (indexOf == -1) {
            System.out.println("khong co");
        } else {
            System.out.println(cadresList.get(indexOf).toString());
        }

        System.exit(0);
    }



}
