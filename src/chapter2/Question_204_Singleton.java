package chapter2;

public class Question_204_Singleton {

    static class SolutionHolder {
        static Question_204_Singleton INSTACE = new Question_204_Singleton();
    }

    /**
     * 204. 单例
     *
     * 静态类实现
     *
     * @return: The same instance of this class every time
     */
    public static Question_204_Singleton getInstance() {
        // write your code here
        return SolutionHolder.INSTACE;
    }
}
