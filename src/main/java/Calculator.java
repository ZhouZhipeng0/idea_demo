/**
 * @Author :13340
 * @Date :Created in 2021-07-03-18:50
 * @Description:
 **/

public class Calculator {
    public int compute(int num1, int num2, String symbol) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Computable compute = ComputFactory.getCompute(symbol);
        return compute.compute(num1, num2);
    }
}
