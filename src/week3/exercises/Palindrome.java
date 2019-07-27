//Find whether a word is palindrome
//
//radar : true
//yellow : false

package week3.exercises;

public class Palindrome {

    public boolean isPalindrome(String word) {
        char[] wordChar = word.toCharArray();

        String reversedWord = "";
        for (int i = wordChar.length - 1; i >= 0; i--) {
            reversedWord += "" + wordChar[i];
//            reversedWord = reversedWord + wordChar[i]; same as above line
        }

        if (word.equals(reversedWord)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        String word1 = "radar";
        boolean result1 = palindrome.isPalindrome(word1);
        System.out.println(word1 + " is palindrome? : " + result1);

        String word2 = "yellow";
        boolean result2 = palindrome.isPalindrome(word2);
        System.out.println(word2 + " is palindrome? : " + result2);
    }
}
