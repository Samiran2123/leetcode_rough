public class le389 {
    public char findTheDifference(String s, String t) {
        int totalS = 0;
        int totalT = 0;

        // 1. Add up all characters in string s
        for (int i = 0; i < s.length(); i++) {
            totalS = totalS + s.charAt(i);
        }

        // 2. Add up all characters in string t
        for (int i = 0; i < t.length(); i++) {
            totalT = totalT + t.charAt(i);
        }

        // 3. The difference is our extra character
        int resultValue = totalT - totalS;

        // 4. Convert the number back into a character
        return (char) resultValue;
    }
}
