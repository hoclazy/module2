package mangvaphuongthuc;

public class daoNguoc {
    public static void main(String[] args) {
        int[] src = {0, 1, 2, 3, 4, 5};

        /*Đảo ngược mảng trong Java bằng vòng lặp*/
        for (int i = src.length-1;i>=0; i--){
           System.out.println(src[i]);
        }
    }
}
