import java.util.Arrays;

public class Q01_01Sort {
    static void sort(int arr[]){
        int start=0;
        int end=arr.length-1;
        int c=0;
        while(start<end){
            if(arr[start]==1){
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
                1,1,1,1,0,0,1,0,1,0,1,0,1,1,1,1};

        sort(a);
    }
}
