import org.junit.Assert;
import org.junit.Test;

/**
 * @Author :13340
 * @Date :Created in 2021-07-03-18:50
 * @Description:
 **/

public class CalculatorTest {
    @Test
    public void shouldReturn2When1plus1(){
        Calculator calculator = new Calculator();
        int realResult = calculator.compute(1,1,'+');
        int expectResult = 2;
        Assert.assertEquals(realResult,expectResult);
    }
    @Test
    public void shouldReturn0When1Sub1(){
        Calculator calculator = new Calculator();
        int realResult = calculator.compute(1,1,'-');
        int expectResult = 0;
        Assert.assertEquals(realResult,expectResult);
    }
}