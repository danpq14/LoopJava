import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        System.out.println("Chương trình tìm ước chung lớn nhất của 2 số nguyên dương (>1) :");
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a : ");
        a = sc.nextInt();
        System.out.println("Nhập số b : ");
        b = sc.nextInt();
        if (a < 1 || b < 1) System.out.println("Bạn đã nhập sai");
        else if (a > 1 && b > 1) {
            while (a != b) {
                if (a>b)
                    a = a - b;
                else
                    b = b - a;
            }
        }
        System.out.println("Ước chung lớn nhất của 2 số là : " + a);
    }
}
