import java.util.Scanner;


public class MinEleofMaxEleofeachRow {

    public static void main(String[] args) {
        //min will be used to compare maximum of each row with maximum of other row and min will be initialized with less maximum;
int min=Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][5];
        //this loop will take input of 2d array
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter "+(i+1)+"th rows");
            for (int j = 0; j < 5; j++) {

                System.out.println("Enter "+(j+1)+"th element");
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int max=Integer.MIN_VALUE;
//this loop will find maximum of each rown
            for (int j = 0; j < 5; j++) {
if(arr[i][j]>max){
    max=arr[i][j];
}
            }
            //this will compare with maximum of other row;
            if(max<min){
                //minimum will be initialized with min
                min=max;
            }
        }
        //printing min
        System.out.println(min);

    }
}
