import java.util.*;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // If c1 is already mapped, check if it's correctly mapped to c2
            if (mapS.containsKey(c1) && mapS.get(c1) != c2) {
                return false;
            }

            // If c2 is already mapped, check if it's correctly mapped to c1
            if (mapT.containsKey(c2) && mapT.get(c2) != c1) {
                return false;
            }

            // Establish bidirectional mapping
            mapS.put(c1, c2);
            mapT.put(c2, c1);
        }

        return true;
    }
}
