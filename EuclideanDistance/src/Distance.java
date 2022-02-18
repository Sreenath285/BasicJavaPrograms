import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter x and y values : ");
        int x = scn.nextInt();
        int y = scn.nextInt();

        double distance = Math.sqrt((Math.pow(x, x)) + (Math.pow(y, y)));
        System.out.println("Euclidean distance : " + distance);

    }

}
