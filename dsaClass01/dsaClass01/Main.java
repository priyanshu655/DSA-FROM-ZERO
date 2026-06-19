package dsaClass01;

import java.util.HashMap;

public class Main {
    public static String bulls_cows(String secret, String guess) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bulls++;
            }

            if (s != g) {
                map1.put(s, map1.getOrDefault(s, 0) + 1);
                map2.put(s, map2.getOrDefault(g, 0) + 1);
                if (map2.get(s) > 0) {
                    cows++;
                    map2.put(s, map2.getOrDefault(s, 0) - 1);
                }

            }
        }
        return bulls + "A" + cows + "B";
    }

    public static void main(String args[]) {
        System.out.println(bulls_cows("18071807", "18017807"));
    }
}