public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        String resultString;

        resultString = string1.trim().concat(string2.trim());

        return resultString;
    }

    public Integer getIndexOrNull(String string, char c) {
        int result = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == c) {
                result = i;
                return result;
            }

            // if (i == string.length() - 1 && string.charAt(string.length() - 1) != c) {
            // return null;
            // }
        }
        return null;
    }

    public Integer getIndexOrNull(String string1, String string2) {
        if (string1.length() < string2.length() || string2.length() == 0) {
            return null;
        }
        int result = string1.indexOf(string2);
        if (result >= 0) {
            return result;
        } else {
            return null;
        }

    }

    public String concatSubstring(String string1, int startIndex, int endIndex, String string2) {
        String result;

        // result = string1.concat(string2, startIndex, endIndex)
        String subString = string1.substring(startIndex, endIndex);
        result = subString + string2;

        return result;
    }

}