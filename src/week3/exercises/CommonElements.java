//int[] arr1 = {5, 2, 5, 3, 8, 9, 1, 7, 0};
//int[] arr2 = {4, 6, 1, 5, 9};
//
//find common elements?
//
//result : 5, 9, 1

package week3.exercises;

public class CommonElements {

    public static void main(String[] args) {
        int[] arr1 = {5, 2, 5, 3, 8, 9, 1, 7, 0};
        int[] arr2 = {4, 6, 1, 5, 9};

        System.out.print("Result : ");
        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.print(num1 + ", ");
                }
            }
        }


    }
}
