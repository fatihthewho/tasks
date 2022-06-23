import java.util.Arrays;

public class movezeros {

    public static void main(String[] args) {

        /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]*/

        int [] arr = {1,0,99,12,145,4,65,0,45,78,88,-8,-9,12,79,65,0,4,60,0,0};
        int temp=0;
        int tempindex=arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (i==tempindex)
            {
                break;
            }
            if (arr[i]==0)
            {
                if(arr[tempindex]==0)
                {
                    tempindex--;
                }
                temp=arr[tempindex];
                arr[tempindex]=arr[i];
                arr[i]=temp;
                i--;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
