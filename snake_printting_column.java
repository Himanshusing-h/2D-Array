import java.util.Scanner;

public class snake_printting_column{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter "+(i+1)+"th rows");
            for (int j = 0; j < 4; j++) {

                System.out.println("Enter "+(j+1)+"th element");
                arr[i][j] = sc.nextInt();
            }

        }
        //print row with even idex as it is
        //print in reverse which has odd index
        for (int i = 0; i < 4; i++) {
            //checking odd or even index
            if(i%2==0){
                //if even printing normally
                for (int j = 0; j < 3; j++) {
                    System.out.print(arr[j][i]+" ");
                }

            }
            else{
                //if odd printing reverse
                for (int j=arr.length-1;j>=0;j--)
                {
                    System.out.print(arr[j][i]+" ");
                }
            }
            System.out.println();
        }

    }
}


