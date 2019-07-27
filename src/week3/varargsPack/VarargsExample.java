package week3.varargsPack;

public class VarargsExample {

    // without vararg
    public double sumWithoutVarargs(double x, double y, double z, double t) {
        double result = x + y + z + t;

        return result;
    }

    // with vararg
    public double sumWithVarargs(double... nums) {
        double result = 0;

        for (double num : nums) {
            result = result + num;
        }

        return result;
    }

    // with array
    public double sumWithArray(double[] arr) {
        double result = 0;

        for (double num : arr) {
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

        double[] arr = {x, y, z, t};
        double result3 = varargsExample.sumWithArray(arr);
        System.out.println("Result with array : " + result3);
    }
}
