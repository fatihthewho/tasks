import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class permutation {


    public static void main(String[] args) {



            ArrayList<Integer> arrlist= new ArrayList<>(Arrays.asList(1,2,3));
            ArrayList<Integer> temp= new ArrayList<>(arrlist);

            for (int j = 0; j < arrlist.size() ; j++) {
                if (j!=0)
                {
                    Collections.swap(arrlist,0,j); //2,1,3
                }
                for (int i = 0; i < arrlist.size()-1; i++) {
                    if (i!=0)
                    {
                        Collections.swap(arrlist,1,2);
                    }
                    System.out.println(arrlist); //1,2,3 // 1,3,2
                }
                arrlist= new ArrayList<>(temp);
            }
        }
    }

