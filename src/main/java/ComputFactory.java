/**
 * @Author :13340
 * @Date :Created in 2021-07-04-23:10
 * @Description:
 **/


public class ComputFactory {
    private static final Sub sub = new Sub();
    private static final Add add = new Add();
    public static Computable getCompute(char symbol) {
        switch (symbol) {
            case '+':
                return add;
            case '-':
                return sub;
            default:
                throw new IllegalArgumentException();
        }
    }
}
