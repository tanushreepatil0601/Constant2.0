package DSA;

import java.util.Scanner;

public class MultiDimensionalArray {
 // snake pattern
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[m][n];
//        arr[0][0]=12;
//        System.out.println(arr[0][0]);

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                arr[i][j] = i + j;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("////////");
        for (int i=0; i<n; i++) {
            if (i%2==0) {
                for (int j=0; j<m; j++) {
                    System.out.print(arr[i][j]+" ");
                }

            } else {
                for (int j=m-1; j>=0; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
