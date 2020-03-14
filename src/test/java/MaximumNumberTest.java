import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest
{
    MaximumNumber number = new MaximumNumber();
    int result;

    @Test
    public void givenIntegerNumbers_WhenMaximum_ThenReturnMaximumNumber()
    {
        result = number.getMaximumNumber(5,10,15);
        Assert.assertEquals(15, result);
    }
}
