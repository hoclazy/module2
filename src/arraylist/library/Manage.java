package arraylist.library;

import java.util.ArrayList;

public class Manage {
   ArrayList<Document> documentArrayList = new ArrayList<>();

   public void add(Document document) {
      documentArrayList.add(document);

      }
//   public int search(int id) {
//      for (int i = 0; i < documentArrayList.size(); i++) {
//         if (documentArrayList.get(i).getId()== id) {
//            return i;
//         }
//      }
//      return 0;
//   }

//   public void remove(int id) {
//      documentArrayList.remove(search(id));
//   }

   public int search(int number) {
      for (int i = 0; i < documentArrayList.size(); i++) {
         if (documentArrayList.get(i).getNumber() == number) {
            return i;
         }
      }
      return -1;
   }

   public void remove(int number) {
      if (search(number) == -1) {
         System.out.println("khong co");
      }else {
         documentArrayList.remove(number);
      }
   }
   public void display() {
      System.out.println("danh sach tai lieu: ");
      for (int i = 0; i < documentArrayList.size(); i++) {
         System.out.println(documentArrayList.get(i));
      }
   }
   }

