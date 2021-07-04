import org.junit.Assert;
import org.junit.Test;

/**
 * @Author :13340
 * @Date :Created in 2021-07-03-18:50
 * @Description:
 **/

public class CalculatorTest {
    @Test
    public void shouldReturn2When1plus1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int realResult = calculator.compute(1,1,"Add");
        int expectResult = 2;
        Assert.assertEquals(realResult,expectResult);
    }
    @Test
    public void shouldReturn0When1Sub1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int realResult = calculator.compute(1,1,"Sub");
        int expectResult = 0;
        Assert.assertEquals(realResult,expectResult);
    }
}