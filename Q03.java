import java.util.Arrays;

public class Q03 {
    static void print(int arr[],int value){
        int start=0;
        int end=arr.length-1;
        int count=0;
        while(start<end){
            if(arr[start]<=value){
                start++;}
            else if(arr[end]>=value) {
                end--;
            }
                else{
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                count++;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,1,2};
        int k = 1;

        print(arr,k);

    }
}
