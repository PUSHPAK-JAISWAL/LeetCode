// this is a program to solve the leetcode problem 1768
class Solution4
 {
    public String mergeAlternately(String word1, String word2) {
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();
        char[] c = new char[word1.length() + word2.length()];

        int d = 0;
        int e = 0;

        int i, j;
        for (i = 0, j = 0; i < a.length && j < b.length; i++, j++) {
            c[d++] = a[i];
            c[d++] = b[j];
        }

        while (i < a.length) {
            c[d++] = a[i++];
        }

        while (j < b.length) {
            c[d++] = b[j++];
        }

        String word = new String(c);
        return word;
    }
}
