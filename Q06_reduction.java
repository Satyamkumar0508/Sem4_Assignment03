
import java.util.Arrays;

public class Q06_reduction {
    static void red(int []arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            Arrays.sort(arr);
            int c=0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] != 0) {
                    arr[j] = arr[j] - arr[c];
                    c++;
                }
                else{
                    c++;
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }
        public static void main(String[] args) {
            int a[]={
                    2,4,6,8,1,3,5,7,12,14,16};

            red(a);
        }
}
