//-Write a Java program to return a new string using every characters of even
// positions from a given string.
//
//input : bottle and glass
//result : btl n ls

package week3.exercises;

public class EvenPositions {

    public static void main(String[] args) {
        String word = "bottle and glass";

        char[] arr = word.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) { // check index is even or not
                System.out.print(arr[i]);
            }
        }
    }
}
