public class MaximumNumber
{
    //METHOD TO FIND MAXIMUM
    public <T extends Comparable> T getMaximum(T firstNumber, T secondNumber, T thirdNumber)
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
