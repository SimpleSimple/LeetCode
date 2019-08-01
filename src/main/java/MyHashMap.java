import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    private List<Integer> buckets;

    public MyHashMap(){
        buckets = new ArrayList<>();
    }

    public boolean add(int value){
        return buckets.add(value);
    }

    public boolean contains(int value){
        return buckets.contains(value);
    }
}
