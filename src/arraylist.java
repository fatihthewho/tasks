import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class arraylist {

    public static void main(String[] args) {


        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(5,6,7,9,0,-9,-45,0,4,9,9,18));
        int tempindex=0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.size()-1 ; i++) {


            for (int j = i; j <arr.size() ; j++) {
                if (min>arr.get(j))
                {
                  min=arr.get(j);
                  tempindex=j;
                }
            }
            Collections.swap(arr,i,tempindex);
            min=Integer.MAX_VALUE;

        }

System.out.println(arr);

    }

}
