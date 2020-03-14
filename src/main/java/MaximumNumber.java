public class MaximumNumber
{
    //METHOD TO FIND MAXIMUM NUMBER
    public int getMaximumNumber(Integer firstNumber, Integer secondNumber, Integer thirdNumber)
    {
        int maximumNumber = firstNumber;
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
