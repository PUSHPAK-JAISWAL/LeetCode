
// this is a program to solve the leetcode problem number nine
class Solution3
 {
    public boolean isPalindrome(int x) {
        String a = Integer.toString(x);
        char b[] = a.toCharArray();
        int c = a.length();
        boolean d = true; // Initialize d as true, assuming the number is a palindrome
        
        for (int i = 0; i < c/2; i++) { // Only need to iterate half of the string
            if (b[i] != b[c - i - 1]) { // Compare characters from both ends
                d = false; // If characters don't match, it's not a palindrome
                break; // No need to continue checking, exit the loop
            }
        }
        return d; // Return the result whether it's a palindrome or not
    }
}
