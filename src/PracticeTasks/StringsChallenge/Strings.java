package PracticeTasks.StringsChallenge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Strings {
    public Map<Character, Integer> countDuplicateCharacters(String str) {

        if (str == null || str.isBlank()) {
            // or throw IllegalArgumentException
            return Collections.emptyMap();
        }
        Map<Character, Integer> result = new HashMap<>();
        for (char ch: str.toCharArray()) {
            result.compute(ch, (key, value) -> (value == null) ? 1 : ++value);
        }
        return result;
    }
}
