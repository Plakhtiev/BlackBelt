package generics;

public class ParametrizeClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Privet info1");
        System.out.println(info1);
        Info<Integer> info2 = new Info<>(369);
        System.out.println(info2);
    }
}

class Info <T> {
    private final T value;
    public  Info (T value) {
        this.value = value;
    }
    public String toString() {
        return "([" + value + "])";
    }
}
