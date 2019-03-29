package chapter1;

import java.util.ArrayList;
import java.util.List;

public class Question_9 {
    public static void main(String[] args) {
        System.out.println(new Question_9().fizzBuzz(15).toString());
        System.out.println(new Question_9().fizzBuzz(9).toString());
    }
    /**
     * 9. Fizz Buzz 问题
     * @param n: An integer
     * @return: A list of strings.
     */
    private List<String> fizzBuzz(int n) {
        // write your code here
        List<String> result = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            result.add(String.valueOf(i + 1));
        }
        for (int i = 2; i < n; i += 3) {
            result.set(i, "fizz");
        }

        for (int i = 4; i < n; i += 5) {
            if ("fizz".equals(result.get(i))) {
                result.set(i, "fizz buzz");
            } else {
                result.set(i, "buzz");
            }
        }

        return result;
    }
}
