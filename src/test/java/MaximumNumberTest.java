import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest
{
    MaximumNumber maximum = new MaximumNumber();
    int result1;
    Float result2;
    String result3;

    @Test
    public void givenIntegerNumbers_WhenFirstNumberIsMaximum_ThenReturnFirstNumber()
    {
        result1 = maximum.getMaximumNumber(15, 10, 5);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void givenIntegerNumbers_WhenSecondNumberIsMaximum_ThenReturnSecondNumber()
    {
        result1 = maximum.getMaximumNumber(5, 15, 10);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void givenIntegerNumbers_WhenThirdNumberIsMaximum_ThenReturnThirdNumber()
    {
        result1 = maximum.getMaximumNumber(5, 10, 15);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void giveFloatNumbers_WhenFirstNumberIsMaximum_ThenReturnFirstNumber()
    {
        result2 = maximum.getMaximumNumber(15.4f, 10.4f, 5.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveFloatNumbers_WhenSecondNumberIsMaximum_ThenReturnSecondNumber()
    {
        result2 = maximum.getMaximumNumber(5.4f, 15.4f, 10.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveFloatNumbers_WhenThirdNumberIsMaximum_ThenReturnThirdNumber()
    {
        result2 = maximum.getMaximumNumber(5.4f, 10.4f, 15.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveString_WhenFirstStringIsMaximum_ThenReturnFirstString()
    {
        result3 = maximum.getMaximumString("welcome", "hello", "hi");
        Assert.assertEquals("welcome", result3);
    }

    @Test
    public void giveString_WhenSecondStringIsMaximum_ThenReturnSecondString()
    {
        result3 = maximum.getMaximumString("hello", "welcome", "hi");
        Assert.assertEquals("welcome", result3);
    }
}
