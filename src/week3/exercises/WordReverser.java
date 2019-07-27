//-reverse all words of a given sentence
//
//input : bottle and glass
//result : elttob dna ssalg

package week3.exercises;

public class WordReverser {

    public static void main(String[] args) {
        String word = "bottle and glass";
        String[] splittedWord = word.split(" ");

        for (String w : splittedWord) {
            char[] arr = w.toCharArray();

            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }

            System.out.print(" ");
        }
    }

}
