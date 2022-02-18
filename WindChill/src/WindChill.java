import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {

        double t, v;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature : ");
        t = sc.nextDouble();
        System.out.println("Enter the wind speed : ");
        v = sc.nextDouble();

        if (t > 50 || v > 120 || v < 3) {
            System.out.println("Invalid input");
        }
        else {
            double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t) - 35.75) * (Math.pow(v, 0.16));
            System.out.println("Wind chill : " + windChill);
        }
    }
}
