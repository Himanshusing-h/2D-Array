import java.lang.reflect.Array;
import java.util.ArrayList;

public class TwoD_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();
        a.add(5);
        a.add(4);
        a.add(7);
        b.add(7);
        b.add(9);
        b.add(3);
        c.add(5);
        c.add(4);
        c.add(7);
        //initializing two d array
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        //adding arraylist to arraylist
        arr.add(a);
        arr.add(b);
        arr.add(c);
        System.out.println(arr);
        //printing using for loop
        for(int i=0;i<arr.size();i++)
        {
            for (int j=0;j<arr.get(i).size();j++)
            {
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
        //printing using for each loop
        for (ArrayList<Integer> list:arr)
        {
            for (int ele:list)
            {
                System.out.print(ele+" ");
            }
            System.out.println();
        }

    }
}
