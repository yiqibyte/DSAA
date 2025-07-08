package DSAA;
import java.math.BigInteger;

public class recursion {
    public static void main(String[] args) {
        int n = 100;

        long startTime1 = System.nanoTime();
        BigInteger res1 = factorial(BigInteger.valueOf(n));
        System.out.println(res1);
        long endTime1 = System.nanoTime();
        System.out.println("普通递归时间(ns): " + (endTime1 - startTime1));

        long startTime2 = System.nanoTime();
        BigInteger res2 = tailFactorial(BigInteger.valueOf(n), BigInteger.ONE);
        System.out.println(res2);
        long endTime2 = System.nanoTime();
        System.out.println("尾递归时间(ns): " + (endTime2 - startTime2));
    }

    // 普通递归
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ONE)) return BigInteger.ONE;
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    // 尾递归版本
    public static BigInteger tailFactorial(BigInteger n, BigInteger res) {
        if (n.equals(BigInteger.ONE)) return res;
        return tailFactorial(n.subtract(BigInteger.ONE), res.multiply(n));
    }
}