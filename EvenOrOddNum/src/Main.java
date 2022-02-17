import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        num = sc.nextInt();

        int temp = num % 2;
        if (temp == 0) {
            System.out.println("Given number is even");
        }
        else {
            System.out.println("Given number is odd");
        }
    }
}
