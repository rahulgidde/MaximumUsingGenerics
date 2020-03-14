import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest
{
    MaximumNumber number = new MaximumNumber();
    int result;

    @Test
    public void givenIntegerNumbers_WhenFirstNumberIsMaximum_ThenReturnFirstNumber()
    {
        result = number.getMaximumNumber(15, 10, 5);
        Assert.assertEquals(15, result);
    }

    @Test
    public void givenIntegerNumbers_WhenSecondNumberIsMaximum_ThenReturnSecondNumber()
    {
        result = number.getMaximumNumber(5, 15, 10);
        Assert.assertEquals(15, result);
    }

    @Test
    public void givenIntegerNumbers_WhenThirdNumberIsMaximum_ThenReturnThirdNumber()
    {
        result = number.getMaximumNumber(5, 10, 15);
        Assert.assertEquals(15, result);
    }
}
