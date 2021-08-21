import java.util.ArrayList;

public class MyArray {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("tiju");
        list.add("tittu");
        list.add("tinu");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.add(0,"lilly");
        System.out.println(list);
        int size = list.size();
        for(int i = 0; i < size ; i++){
            System.out.println(list.get(i));
        }
    }
}
