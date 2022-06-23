import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 434, 5, 3, 78, 45, 98, -34, 1, -69, -91, 12, 0, 123};
        int max;
        int maxindex = 0;
        int temp;


        for (int i = 0; i < arr.length - 1; i++) {
            max = arr[i];
            for (int j = i; j < arr.length; j++) {

                if (max <= arr[j]) {
                    max = arr[j];
                    maxindex = j;
                }

            }

            temp = arr[maxindex];
            arr[maxindex] = arr[i];
            arr[i] = temp;

        }

        System.out.println(Arrays.toString(arr));
    }
}
