import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        System.out.println("Chương trình kiểm tra 1 số có phải số nguyên tố");
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập số nguyên dương cần kiểm tra (>1)");
        int number = sc.nextInt();
        boolean result = true;
        if (number == 2) {
            result = true;
        }
        else if (number > 2) {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        if (result) System.out.println("Số bạn nhập là số nguyên tố");
        else System.out.println("Số bạn nhập ko phải số nguyên tố");
    }
}
