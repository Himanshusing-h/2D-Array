import java.util.Scanner;
public class column_wise_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + (i + 1) + "th rows");
            for (int j = 0; j < 4; j++) {

                System.out.println("Enter " + (j + 1) + "th element");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            //thinking---i zero rahe phir j 0,1,2 ho jae isse ek column print ho jaega then i=2 and so on
            //i ki condition column tk
            //j ki condition row tk

            for (int j = 0; j < 3; j++) {

                System.out.print(arr[j][i]+ " ");

            }
            System.out.println();
        }
    }
}
