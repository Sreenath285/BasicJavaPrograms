import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = scn.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter elements :");
        for (int a = 0; a < n; a++) {
            arr[a] = scn.nextInt();
        }

        int i, j, k, count = 0;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                for (k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println("["  + arr[i] + " " + arr[j] + " " + arr[k] + "]");
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of triplets : " + count);
    }

}
