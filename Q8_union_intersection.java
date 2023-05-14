import java.util.HashSet;

public class Q8_union_intersection {
    static void sorted (int arr1[],int arr2[]){
        HashSet<Integer> s=new HashSet<>();
        for(int i:arr1){
            s.add(i);
        }
        for(int i:arr2){
            s.add(i);
        }
        System.out.println(s);
        for(int i:arr1){
            for (int j:arr2){
                if(i==j){
                    System.out.print(i+ ",");
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={
                2,4,6,8,1,3,5,7,12,14,16};
        int b[]={
                5,2,4,6,9};
        sorted(a,b);
    }
}
