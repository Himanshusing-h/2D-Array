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
        //{{2,1,3},{7,8,9,},{7,5,1}}
        //array of arrays
        //2d array mai se 1d ko uthaya
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
