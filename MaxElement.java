import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
            int max=Integer.MIN_VALUE;
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
                   if(arr[i][j]>max){
                       max=arr[i][j];
                    }

                }

            }
        System.out.println(max);
        }


    }

