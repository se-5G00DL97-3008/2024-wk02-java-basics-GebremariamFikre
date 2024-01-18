import java.util.Scanner;
public class E03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        if (num > 0){
            System.out.println("Positive number");
        }
        System.out.println();
        System.out.println("Enter a number:");
        num = in.nextInt();
        if (num < 0) {
            System.out.println("Negative number");
        }
    }
}
