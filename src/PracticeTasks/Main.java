package PracticeTasks;

import PracticeTasks.StringsChallenge.Strings;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Strings strings = new Strings();
        Map<Character, Integer> count = strings.countDuplicateCharacters("");
        System.out.println(count);
        int[] numbers = {56, 45, 89, 1, 45, 13, 4, 69, 11, -89};
        System.out.println(numbers[0]);

    }
}
