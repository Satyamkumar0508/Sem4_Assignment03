import java.util.Arrays;

public class Q05_separate_even_odd {
    static void sort(int arr[]){
        int start=0;
        int end=arr.length-1;
        int c=0;
        while(start<end){
            if(arr[start]%2!=0){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                end--;
                c++;
            }
            else{
                start++;
            }
        }
        System.out.println("Number of swap:"+c);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int a[]={
                2,4,6,8,1,3,5,7,12,14,16};

        sort(a);
    }
}
