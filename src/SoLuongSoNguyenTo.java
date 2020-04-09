import java.util.Scanner;

public class SoLuongSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố muốn in ra : ");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 2; ;i++) {
            if (count != number) {
                boolean flag = true;
                for (int j = 2; j<= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count ++;
                    System.out.println(i);
                }

            } else if (count == number) {
                break;
            }
        }
    }
}

