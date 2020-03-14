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
        result1 = maximum.getMaximum(15, 10, 5);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void givenIntegerNumbers_WhenSecondNumberIsMaximum_ThenReturnSecondNumber()
    {
        result1 = maximum.getMaximum(5, 15, 10);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void givenIntegerNumbers_WhenThirdNumberIsMaximum_ThenReturnThirdNumber()
    {
        result1 = maximum.getMaximum(5, 10, 15);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void giveFloatNumbers_WhenFirstNumberIsMaximum_ThenReturnFirstNumber()
    {
        result2 = maximum.getMaximum(15.4f, 10.4f, 5.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveFloatNumbers_WhenSecondNumberIsMaximum_ThenReturnSecondNumber()
    {
        result2 = maximum.getMaximum(5.4f, 15.4f, 10.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveFloatNumbers_WhenThirdNumberIsMaximum_ThenReturnThirdNumber()
    {
        result2 = maximum.getMaximum(5.4f, 10.4f, 15.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveString_WhenFirstStringIsMaximum_ThenReturnFirstString()
    {
        result3 = maximum.getMaximum("welcome", "hello", "hi");
        Assert.assertEquals("welcome", result3);
    }

    @Test
    public void giveString_WhenSecondStringIsMaximum_ThenReturnSecondString()
    {
        result3 = maximum.getMaximum("hello", "welcome", "hi");
        Assert.assertEquals("welcome", result3);
    }

    @Test
    public void giveString_WhenThirdStringIsMaximum_ThenReturnThirdString()
    {
        result3 = maximum.getMaximum("hello", "hi", "welcome");
        Assert.assertEquals("welcome", result3);
    }

    @Test
    public void giveCapitalString_WhenGetMaximumString_ThenReturnMaximumString()
    {
        result3 = maximum.getMaximum("HELLO", "HI", "WELCOME");
        Assert.assertEquals("WELCOME", result3);
    }

    @Test
    public void giveNumberAsString_WhenGetMaximumString_ThenReturnMaximumString()
    {
        result3 = maximum.getMaximum("123", "231", "444");
        Assert.assertEquals("444", result3);
    }

    @Test
    public void giveStringCombination_WhenGetMaximumString_ThenReturnMaximumString()
    {
        result3 = maximum.getMaximum("ABC", "123", "abc");
        Assert.assertEquals("abc", result3);
    }
}
