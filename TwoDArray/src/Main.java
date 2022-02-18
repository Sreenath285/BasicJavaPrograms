import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static int[][] arrayInt(int m, int n) {
        int arrInt[][] = new int[m][n];
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Integer Array : ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrInt[i][j] = sc.nextInt();
            }
        }
        return arrInt;
    }

    public static double[][] arrayDouble(int m, int n) {
        double arrDouble[][] = new double[m][n];
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Double Array : ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrDouble[i][j] = sc.nextDouble();
            }
        }
        return arrDouble;
    }

    public static boolean[][] arrayBoolean(int m, int n) {
        boolean arrBool[][] = new boolean[m][n];
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Boolean Array : ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arrBool[i][j] = Boolean.parseBoolean(sc.nextLine());
            }
        }
        return arrBool;
    }


    public static void main(String[] args) {
        System.out.println("Enter number of rows : ");
        Scanner u = new Scanner(System.in);
        int m = u.nextInt();
        System.out.println("Enter number of columns : ");
        int n = u.nextInt();
        int[][] a = arrayInt(m, n);
        double[][] b = arrayDouble(m, n);
        boolean[][] c = arrayBoolean(m, n);
        display(a, b, c, m, n);
    }

    public static void display(int[][] a, double[][] b, boolean[][] c, int m, int n) {
        PrintWriter pw = new PrintWriter(System.out, true);
        System.out.println();
        pw.println("2d Integer Array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pw.print("\t" + a[i][j] + " ");
            }
            pw.println("\t");
        }

        System.out.println();
        pw.println("2d Double Array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pw.print("\t" + b[i][j] + " ");
            }
            pw.println("\t");
        }

        System.out.println();
        pw.println("2d Boolean Array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                pw.print("\t" + c[i][j] + " ");
            }
            pw.println("\t");
        }
    }
}
