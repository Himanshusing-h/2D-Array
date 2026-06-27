import java.util.Scanner;
public class Transpose_matrix {
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
        for (int i = 0; i < 3-1; i++) {
            for (int j = i+1; j < 3; j++) {
                int temp=arr[i][j];
                arr[i][j] =arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int[] a:arr)
        {
            //printing krdi
            for (int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
