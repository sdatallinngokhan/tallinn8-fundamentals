package week3.exercises;

public class Calculator {

    public double sum(double x, double y) {
        return x + y;
    }

    public double subtract(double x, double y) {
        return x - y;
    }

    public double multiply(double x, double y) {
        return x * y;
    }

    public double divide(double x, double y) {
        return x / y;
    }

    public double mod(double x, double y) {
        return x % y;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double x = 5;
        double y = 4;

        double sumResult = calculator.sum(x, y);
        double subtractResult = calculator.subtract(x, y);
        double multiplyResult = calculator.multiply(x, y);
        double divideResult = calculator.divide(x, y);
        double modResult = calculator.mod(x, y);

        System.out.println("Sum result : "+sumResult);
        System.out.println("Subtract result : "+subtractResult);
        System.out.println("Multiply result : "+multiplyResult);
        System.out.println("Divide result : "+divideResult);
        System.out.println("Mod result : "+modResult);
    }
}
