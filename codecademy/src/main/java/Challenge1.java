public class Challenge1 {

    static String reverseString(String toReverse) {
        StringBuilder result = new StringBuilder();
        for (char character: toReverse.toCharArray()) {
            result.insert(0, character);
        }

        return result.toString();
    }

    /* Pig way
    static String reverseString(String toReverse){
        String result = "";
        for (int i = toReverse.length(); i != 0; i -= 1){
            char character =  toReverse.charAt(i - 1);
            result = result.concat(String.valueOf(character));
        }

        return result;
    }
    */
}
