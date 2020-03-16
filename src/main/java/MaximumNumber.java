public class MaximumNumber<T extends Comparable<T>>
{
    private T firstValue;
    private T secondValue;
    private T thirdValue;

    //DEFAULT CONSTRUCTOR
    public MaximumNumber()
    {

    }

    //PARAMETERISED CONSTRUCTOR
    public MaximumNumber(T firstValue, T secondValue, T thirdValue)
    {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    //METHOD TO CALL INTERNAL METHOD
    public T getMaximum()
    {
        return getMaximum(firstValue,secondValue,thirdValue);
    }

    //METHOD TO FIND MAXIMUM
    public <T extends Comparable<T>> T getMaximum(T firstNumber, T secondNumber, T thirdNumber)
    {
        T maximumNumber = firstNumber;
        if(secondNumber.compareTo(maximumNumber) > 0)
            maximumNumber = secondNumber;
        if(thirdNumber.compareTo(maximumNumber) > 0)
            maximumNumber = thirdNumber;
        return maximumNumber;
    }

    //MAIN METHOD
    public static void main(String[] args)
    {
        System.out.println("--------WELCOME--------");
    }
}
