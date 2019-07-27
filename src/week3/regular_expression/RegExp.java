package week3.regular_expression;

public class RegExp {

    public static void main(String[] args) {
        String word = "dfghjA9";

        if (word.matches("[a-zA-Z0-9]*")){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
