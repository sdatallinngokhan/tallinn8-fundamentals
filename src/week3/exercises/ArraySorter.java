//int[] arr = {5, 2, 5, 3, 8, 9, 1, 7, 0};
//
//sort this array
//
//result : 0, 1, 2, 3, 5, 5, 7, 8, 9

package week3.exercises;

public class ArraySorter {

    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 3, 8, 9, 1, 7, 0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + ", ");
        }
    }
}
