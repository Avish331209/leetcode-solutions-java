class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        String res = "";

        for (int i = 0; i < str.length; i++) {
            String temp = str[i];

            for (int j = temp.length() - 1; j >= 0; j--) {
                res = res + temp.charAt(j);
            }

            if (i < str.length - 1)
                res = res + " ";
        }

        return res;
    }
}