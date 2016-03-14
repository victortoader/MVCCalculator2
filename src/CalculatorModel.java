/**
 * Created by 279766 on 03.11.2016.
 */
public class CalculatorModel {

    private int multipleValue;

    private int calculationValue;


    public void multipliValues(int firsNumber, int secondNumber)

    {
        multipleValue = firsNumber * secondNumber;

    }


    public void addTwoNumbers(int firstNumber, int secondNumber)

    {

        calculationValue = firstNumber + secondNumber;


    }

    public int getCalculationValue() {

        return calculationValue;
    }

    public int getMultipleValue() {
        return multipleValue;

    }


}

