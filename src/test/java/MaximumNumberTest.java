import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest
{

    int result1;
    Float result2;
    String result3;

    @Test
    public void givenIntegerNumbers_WhenFirstNumberIsMaximum_ThenReturnFirstNumber()
    {
        MaximumNumber maximum = new MaximumNumber();
        result1 = (int) maximum.getMaximum(15, 10, 5);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void givenIntegerNumbers_WhenSecondNumberIsMaximum_ThenReturnSecondNumber()
    {
        MaximumNumber maximum = new MaximumNumber();
        result1 = (int) maximum.getMaximum(5, 15, 10);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void givenIntegerNumbers_WhenThirdNumberIsMaximum_ThenReturnThirdNumber()
    {
        MaximumNumber maximum = new MaximumNumber();
        result1 = (int) maximum.getMaximum(5, 10, 15);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void giveFloatNumbers_WhenFirstNumberIsMaximum_ThenReturnFirstNumber()
    {
        MaximumNumber maximum = new MaximumNumber();
        result2 = (Float) maximum.getMaximum(15.4f, 10.4f, 5.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveFloatNumbers_WhenSecondNumberIsMaximum_ThenReturnSecondNumber()
    {
        MaximumNumber maximum = new MaximumNumber();
        result2 = (Float) maximum.getMaximum(5.4f, 15.4f, 10.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveFloatNumbers_WhenThirdNumberIsMaximum_ThenReturnThirdNumber()
    {
        MaximumNumber maximum = new MaximumNumber();
        result2 = (Float) maximum.getMaximum(5.4f, 10.4f, 15.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveString_WhenFirstStringIsMaximum_ThenReturnFirstString()
    {
        MaximumNumber maximum = new MaximumNumber();
        result3 = (String) maximum.getMaximum("welcome", "hello", "hi");
        Assert.assertEquals("welcome", result3);
    }

    @Test
    public void giveString_WhenSecondStringIsMaximum_ThenReturnSecondString()
    {
        MaximumNumber maximum = new MaximumNumber();
        result3 = (String) maximum.getMaximum("hello", "welcome", "hi");
        Assert.assertEquals("welcome", result3);
    }

    @Test
    public void giveString_WhenThirdStringIsMaximum_ThenReturnThirdString()
    {
        MaximumNumber maximum = new MaximumNumber();
        result3 = (String) maximum.getMaximum("hello", "hi", "welcome");
        Assert.assertEquals("welcome", result3);
    }

    @Test
    public void giveCapitalString_WhenGetMaximumString_ThenReturnMaximumString()
    {
        MaximumNumber maximum = new MaximumNumber();
        result3 = (String) maximum.getMaximum("HELLO", "HI", "WELCOME");
        Assert.assertEquals("WELCOME", result3);
    }

    @Test
    public void giveNumberAsString_WhenGetMaximumString_ThenReturnMaximumString()
    {
        MaximumNumber maximum = new MaximumNumber();
        result3 = (String) maximum.getMaximum("123", "231", "444");
        Assert.assertEquals("444", result3);
    }

    @Test
    public void giveStringCombination_WhenGetMaximumString_ThenReturnMaximumString()
    {
        MaximumNumber maximum = new MaximumNumber();
        result3 = (String) maximum.getMaximum("ABC", "123", "abc");
        Assert.assertEquals("abc", result3);
    }

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
