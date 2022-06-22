package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Zaur Tregulov");
        map1.put(3563, "Ivan Ivanov");
        map1.put(7896, "Maria Sokolova");
        map1.put(100412560, "Nik Mik");
        map1.put(null, "Nik Mik1");
        map1.put(null, "Nik Mik null");
        System.out.println(map1);
    }
}
