package week3.varargsPack;

public class VarargsExample {

    public double sumWithoutVarargs(double x, double y, double z, double t) {
        double result = x + y + z + t;

        return result;
    }

    public double sumWithVarargs(double... nums) {
        double result = 0;

        for (double num : nums) {
            result = result + num;
        }

        return result;
    }

    public static void main(String[] args) {
        VarargsExample varargsExample = new VarargsExample();

        double x = 5;
        double y = 6;
        double z = 4;
        double t = 1;

        double result1 = varargsExample.sumWithoutVarargs(x, y, z, t);
        System.out.println("Result without varargs : " + result1);

        double result2 = varargsExample.sumWithVarargs(x, y, z, t);
        System.out.println("Result with varargs : " + result2);
    }
}
