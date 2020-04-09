import java.util.Scanner;

public class TinhLaiNganHang {
    public static void main(String[] args) {
        System.out.println("Chương trình tính lãi ngân hàng");
        double money;
        double rate;
        double month;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số tiền bạn gửi : ");
        money = sc.nextDouble();
        System.out.println(" Nhập lãi suất (theo năm) : ");
        rate = (sc.nextDouble())/1200;
        System.out.println("Nhập kỳ hạn gửi tiền (số tháng) : ");
        month = sc.nextDouble();

        double rateMoney = money*rate*month;
        double moneyAfter = money + rateMoney;
        rateMoney = Math.floor(rateMoney);
        moneyAfter = Math.floor(moneyAfter);
        System.out.printf("Số tiền lãi của bạn là : %s \n ", rateMoney);
        System.out.printf("Số tiền lãi + gốc của bạn sau khi gửi là : %6s ", moneyAfter);
    }
}
