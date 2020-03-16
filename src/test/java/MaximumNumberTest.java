import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest
{
    int result1;
    Float result2;
    String result3;

    @Test
    public void givenThreeIntegerNumbers_WhenFirstNumberIsMaximum_ThenReturnFirstNumber()
    {
        MaximumNumber maximum = new MaximumNumber(15, 5, 10);
        result1 = (int) maximum.getMaximum();
        Assert.assertEquals(15, result1);
    }

    @Test
    public void givenThreeIntegerNumbers_WhenSecondNumberIsMaximum_ThenReturnSecondNumber()
    {
        MaximumNumber maximum = new MaximumNumber(5, 15, 10);
        result1 = (int) maximum.getMaximum();
        Assert.assertEquals(15, result1);
    }

    @Test
    public void givenThreeIntegerNumbers_WhenThirdNumberIsMaximum_ThenReturnThirdNumber()
    {
        MaximumNumber maximum = new MaximumNumber(5, 10, 15);
        result1 = (int) maximum.getMaximum();
        Assert.assertEquals(15, result1);
    }

    @Test
    public void giveThreeFloatNumbers_WhenFirstNumberIsMaximum_ThenReturnFirstNumber()
    {
        MaximumNumber maximum = new MaximumNumber(15.4f, 10.4f, 5.4f);
        result2 = (Float) maximum.getMaximum();
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveThreeFloatNumbers_WhenSecondNumberIsMaximum_ThenReturnSecondNumber()
    {
        MaximumNumber maximum = new MaximumNumber(5.4f, 15.4f, 10.4f);
        result2 = (Float) maximum.getMaximum();
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveThreeFloatNumbers_WhenThirdNumberIsMaximum_ThenReturnThirdNumber()
    {
        MaximumNumber maximum = new MaximumNumber(5.4f, 10.4f, 15.4f);
        result2 = (Float) maximum.getMaximum();
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveThreeString_WhenFirstStringIsMaximum_ThenReturnFirstString()
    {
        MaximumNumber maximum = new MaximumNumber("welcome", "hello", "hi");
        result3 = (String) maximum.getMaximum();
        Assert.assertEquals("welcome", result3);
    }

    @Test
    public void giveThreeString_WhenSecondStringIsMaximum_ThenReturnSecondString()
    {
        MaximumNumber maximum = new MaximumNumber("hello", "welcome", "hi");
        result3 = (String) maximum.getMaximum();
        Assert.assertEquals("welcome", result3);
    }

    @Test
    public void giveThreeString_WhenThirdStringIsMaximum_ThenReturnThirdString()
    {
        MaximumNumber maximum = new MaximumNumber("hello", "hi", "welcome");
        result3 = (String) maximum.getMaximum();
        Assert.assertEquals("welcome", result3);
    }

    @Test
    public void giveThreeCapitalString_WhenGetMaximumString_ThenReturnMaximumString()
    {
        MaximumNumber maximum = new MaximumNumber("HELLO", "HI", "WELCOME");
        result3 = (String) maximum.getMaximum();
        Assert.assertEquals("WELCOME", result3);
    }

    @Test
    public void giveThreeNumberAsString_WhenGetMaximumString_ThenReturnMaximumString()
    {
        MaximumNumber maximum = new MaximumNumber("123", "231", "444");
        result3 = (String) maximum.getMaximum();
        Assert.assertEquals("444", result3);
    }

    @Test
    public void giveThreeStringCombination_WhenGetMaximumString_ThenReturnMaximumString()
    {
        MaximumNumber maximum = new MaximumNumber("ABC", "123", "abc");
        result3 = (String) maximum.getMaximum();
        Assert.assertEquals("abc", result3);
    }
}
