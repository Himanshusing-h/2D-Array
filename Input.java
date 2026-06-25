import java.util.Scanner;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter "+(i+1)+"th rows");
            for (int j = 0; j < 3; j++) {

                System.out.println("Enter "+(j+1)+"th element");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}






