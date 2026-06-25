import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String[] args) {
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

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                     sum+=arr[i][j];
                    }

                }
        System.out.println(sum);
            }
        }

