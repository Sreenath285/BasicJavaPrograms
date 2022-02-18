import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {

        double root1, root2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a, b and c values : ");
        double a = scn.nextDouble();
        double b = scn.nextDouble();
        double c = scn.nextDouble();
        
        double delta = (b * b - 4 * a * c);
        System.out.println("Delta : " + delta);

        root1 = (-b + Math.sqrt(delta)) / (2 * a);
        root2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Root 1 : " + root1);
        System.out.println("Root 2 : " + root2);

    }
}
