import java.util.Scanner;
public class For_each {
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
        //array of arrays
        //this will take one array
        for(int[] a:arr)
        {
            //this is for another array
            for (int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
