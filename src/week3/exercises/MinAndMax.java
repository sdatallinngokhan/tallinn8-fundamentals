//Find smallest and biggest element of an array
//
//int[] arr = {5, 2, 5, 3, 8, 9, 1, 7, 0};
//
//smallest : 0
//biggest : 9

package week3.exercises;

public class MinAndMax {

    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 3, 8, 9, 1, 7, 0};

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Min number : " + min);
        System.out.println("Max number : " + max);
    }
}
