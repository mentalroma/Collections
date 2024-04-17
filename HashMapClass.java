import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    Map<Integer, String> hashMap;
    Map<Integer, String> linkedHashMap;
    Map<Integer, String> treeMap;

    HashMapClass(){
        hashMap = new HashMap<>(); //Внутри не гарантируется никакого порядка
        linkedHashMap = new HashMap<>(); //В каком порядке добавили в таком и вернутся
        treeMap = new HashMap<>(); //Будут отсортированны по ключу(Естсественный порядок)
    }

    public void add() {
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");
        hashMap.put(6, "Six");
        hashMap.put(7, "Seven");
        hashMap.put(8, "Eight");
    }

    public void get(int key){
        System.out.println(hashMap.get(key));
    }
    public void print(){
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
