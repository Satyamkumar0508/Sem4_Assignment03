
import java.util.Arrays;
import java.util.Collections;


public class Q04_order_defne {
    static void sort(Integer arr1[], int arr2[]) {
        for (int i = 0; i < arr2.length - 1; i++) {
            if (arr2[i] < arr2[i + 1]) {
                Arrays.sort(arr1);
            } else if (arr2[i] > arr2[i + 1]) {
                Arrays.sort(arr1, Collections.reverseOrder());
            }
        }
    }


        public static void main(String[] args) {
            Integer [] arr = {7,6,5,4,1,2};
            int[] arr1 = {6,5,4,3,2,1};
            sort(arr,arr1);
            System.out.println(Arrays.toString(arr));

        }

}
