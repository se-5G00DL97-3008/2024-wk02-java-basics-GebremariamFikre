import java.util.Scanner;
public class E04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a day: ");
        int day = in.nextInt();

        System.out.print("Enter a month: ");
        int month = in.nextInt();

        if (day == 24 && month == 12) {
            System.out.println("Merry Christmas");
        }

        System.out.print("Enter a day: ");
        day = in.nextInt();

        System.out.print("Enter a month: ");
        month = in.nextInt();
    }
}
