import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest
{
    MaximumNumber number = new MaximumNumber();
    int result1;
    Float result2;

    @Test
    public void givenIntegerNumbers_WhenFirstNumberIsMaximum_ThenReturnFirstNumber()
    {
        result1 = number.getMaximumNumber(15, 10, 5);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void givenIntegerNumbers_WhenSecondNumberIsMaximum_ThenReturnSecondNumber()
    {
        result1 = number.getMaximumNumber(5, 15, 10);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void givenIntegerNumbers_WhenThirdNumberIsMaximum_ThenReturnThirdNumber()
    {
        result1 = number.getMaximumNumber(5, 10, 15);
        Assert.assertEquals(15, result1);
    }

    @Test
    public void giveFloatNumbers_WhenFirstNumberIsMaximum_ThenReturnFirstNumber()
    {
        result2 = number.getMaximumNumber(15.4f, 10.4f, 5.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveFloatNumbers_WhenSecondNumberIsMaximum_ThenReturnSecondNumber()
    {
        result2 = number.getMaximumNumber(5.4f, 15.4f, 10.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }

    @Test
    public void giveFloatNumbers_WhenThirdNumberIsMaximum_ThenReturnThirdNumber()
    {
        result2 = number.getMaximumNumber(5.4f, 10.4f, 15.4f);
        Assert.assertEquals((Float)15.4f, result2);
    }
}
