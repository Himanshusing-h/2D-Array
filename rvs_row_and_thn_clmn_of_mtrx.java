import java.util.Scanner;
public class rvs_row_and_thn_clmn_of_mtrx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //intializing 2D array
        int[][] arr = new int[3][4];
        //Taking input in array
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter "+(i+1)+"th rows");
            for (int j = 0; j < 4; j++) {

                System.out.println("Enter "+(j+1)+"th element");
                arr[i][j] = sc.nextInt();
            }
        }
        //we will use 2 pointer technique for reversing and as we are reversing row
        //row variable should be constant for each iteration
        //that's why i got the limit of row
        //like i=0 is reversed first then i=2 then i=3
        for (int i = 0; i < 3; i++) {
            //applying two pointer
            //in row
            int low=0;
            int high=arr[0].length-1;
            while(low<=high)
            {
                int temp=arr[i][low];
                arr[i][low]=arr[i][high];
                arr[i][high]=temp;
                low++;
                high--;
            }

        }
        //using for each loop to print reversed row matrix
        for(int[] a:arr)
        {
            //printing krdi
            for (int ele:a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        //we will use 2 pointer technique to reverse column
        //in column printing,column limit is given to i
        //working i=0;0th clmn will be reversed then 1th coloum reverse

        for (int i = 0; i < 4; i++) {
            //two pointer applying in column
            int low=0;
            int high=arr.length-1;
            while(low<=high)
            {
                int temp=arr[low][i];
                arr[low][i]=arr[high][i];
                arr[high][i]=temp;
                low++;
                high--;
            }

        }
        //printing matrix with reversed column
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
