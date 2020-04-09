import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Draw Triangle");
        System.out.println("2 : Draw Rectangle");
        System.out.println("3 : Draw Square");
        System.out.println("0 : Exit");
        System.out.println("Enter your choice : ");
        while (flag ==  true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    System.out.println("Draw TriAngle");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2 :
                    System.out.println("Draw RectAngle");
                    System.out.println(" * * * * *");
                    System.out.println(" * * * * *");
                    System.out.println(" * * * * *");
                    break;
                case 3 :
                    System.out.println("Draw RectAngle");
                    System.out.println(" * * * * *");
                    System.out.println(" * * * * *");
                    System.out.println(" * * * * *");
                    System.out.println(" * * * * *");
                    break;
                case 0 :
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
            }
        }
    }
}
