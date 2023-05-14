import java.util.ArrayList;
import java.util.Collections;

public class Q09_findmin_findmax_findmedian {
    static void arrop(ArrayList<Integer> a){
        Collections.sort(a);
        System.out.println("MAx:"+a.get(0));
        System.out.println("MIn:"+a.get(a.size()-1));
        if(a.size()%2!=0){
            System.out.println("Median:"+a.get(a.size()/2));
        }
        else{
            int i=a.size()/2;
            int j=i+1;
            System.out.println("Median:"+((a.get(i-1)+a.get(j-1))/2.0));
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> s=new ArrayList<>();

        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        s.add(8);
        s.add(9);
        arrop(s);

    }
}
