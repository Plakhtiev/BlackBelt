package generics;

public class ParametrizeClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("privet ", 2569);
        System.out.println(pair1.getFirstValue() + pair1.getSecondValue());
        Pair<String, Double> pair2 = new Pair<>("privet ", 2569.45);
        System.out.println(pair2.getFirstValue() + pair2.getSecondValue());
    }
}

class Pair<V1, V2> {
    private final V1 value1;
    private final V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}