package generics;

import java.util.ArrayList;

public class ParametrizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> el1 = new ArrayList<>();
        el1.add(10);
        el1.add(20);
        el1.add(30);
        int a = GenMethod.getSecondElement(el1);
        System.out.println(a);

        ArrayList<String> el2 = new ArrayList<>();
        el2.add("10st");
        el2.add("20st");
        el2.add("30st");
        String s = GenMethod.getSecondElement(el2);
        System.out.println(s);

    }
}

class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> a1) {
        return a1.get(1);
    }
}
