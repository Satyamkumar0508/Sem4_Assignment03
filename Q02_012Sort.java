import java.util.Arrays;

public class Q02_012Sort {
    public static void sortArray(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid = 0;

        while (mid <= hi) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[lo];
                    arr[lo] = arr[mid];
                    arr[mid] = temp;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp2;
                    hi--;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int a[]={
                1,1,1,1,0,0,1,2,2,2,2,2,0,1,0,1,0,1,1,1,1};

        sortArray(a);
        System.out.println(Arrays.toString(a));
    }
}
