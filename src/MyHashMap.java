import java.util.HashMap;

public class MyHashMap {

    public static void main(String[] args) {
        HashMap<Float,String> versions = new HashMap<>();
        versions.put(new Float(1.0),"Kitkat");
        versions.put(new Float(7.3),"Lolipop");
        System.out.println(versions.get(new Float(1.0)));
        int size = versions.size();
        System.out.println(size);

        if(versions.containsKey(new Float(1.1))){
            System.out.println("Kitkat is available");
        }
        else{
            System.out.println("Kitkat not available");
        }
    }
}
