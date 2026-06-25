public class Output {
    public static void main(String[] args) {
        int[][]arr=new int[2][3];
        //printing all element
        for(int i=0;i<2;i++){
            for (int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        //printing no of rows
        System.out.println(arr.length);
        //priting no of coloumn
        System.out.println(arr[0].length);

    }
}
