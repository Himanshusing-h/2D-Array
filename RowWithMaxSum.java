import java.util.Scanner;

import java.util.Scanner;

public class RowWithMaxSum {
    public static void main(String[] args) {
        int row=0;
        int max=Integer.MIN_VALUE;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter "+(i+1)+"th rows");
            for (int j = 0; j < 3; j++) {

                System.out.println("Enter "+(j+1)+"th element");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            sum=0;
            for (int j=0;j<3;j++)
            {
              sum+=arr[i][j];
              if(sum>max)
                  row=i;
              max=sum;
            }

        }
        System.out.println((row+1));
    }
}
