import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class listpgmSort {

    public static void findLargest(Integer[] a,int total){
        List<Integer> list = Arrays.asList(a);
        Collections.sort(list);
        int element = list.get(total-2);
        System.out.println(element);
    }


    public static void main(String[] args) {
        Integer[] a ={10,2,9,1};
        findLargest(a,4);
    }
}
