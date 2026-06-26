import java.util.Scanner;

import java.util.Scanner;
public class MinEleofMaxEleofeachRow {

    public static void main(String[] args) {
int min=0;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter "+(i+1)+"th rows");
            for (int j = 0; j < 4; j++) {

                System.out.println("Enter "+(j+1)+"th element");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            int max=Integer.MIN_VALUE;

            for (int j = 0; j < 4; j++) {
if(arr[i][j]>max){
    max=arr[i][j];
}
            }
            if(max<min){
                min=max;
            }
        }
        System.out.println(min);

    }
}
