package chapter2;

import java.util.Arrays;

public class Question_212_replaceBlank {

    public static void main(String[] args) {
        System.out.println(new Question_212_replaceBlank().replaceBlank("Mr John Smith".toCharArray(), 13));
    }

    /**
     * 212. 空格替换
     *
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    public int replaceBlank(char[] string, int length) {
        // write your code here
        if (string == null) {
            return  0;
        }

        int len = length;
        for (int i = 0; i < len; i++) {
            if (string[i] == ' ') {
                len += 2;
                string = Arrays.copyOf(string, len);
                System.arraycopy(string, i + 1, string, i + 3, len  - 3 - i);

                string[i] = '%';
                string[i + 1] = '2';
                string[i + 2] = '0';
            }
        }

        return len;
    }
}
