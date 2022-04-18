package arraylist.student;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {

        //thêm
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1, "Nam", 22));
        studentList.add(new Student(2, "Ngoc", 26));
        studentList.add(new Student(3, "Cuong", 21));

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        System.out.println("....................");

        //xóa
        studentList.remove(2);

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

        System.out.println("....................");

        //sửa
        studentList.set(1, new Student(4, "Long", 24));
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println("--------------------------");
        int indexOf = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getName().equals("hoc")) {
                indexOf = i;
                break;
            }
        }

        if (indexOf == -1) {
            System.out.println("khong co");
        } else {
            System.out.println(studentList.get(indexOf).toString());
        }
    }
}
