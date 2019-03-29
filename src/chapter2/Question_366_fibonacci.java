package chapter2;

public class Question_366_fibonacci {

    public static void main(String[] args) {

    }

    /**
     * 366. 斐波纳契数列
     *
     * @param n: an integer
     * @return: an ineger f(n)
     */
    public int fibonacci(int n) {
        // write your code here
        if (n < 3) {
            return n;
        }

        int a = 0;
        int result = 1;

        for (int i = 2; i < n; i++) {
            int temp = result;
            result += a;
            a = temp;
        }

        return result;
    }
}
