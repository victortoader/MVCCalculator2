import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by 279766 on 03.11.2016.
 */
public class CalculationController {

    private CalculationView theView;
    private CalculatorModel theModel;


    public CalculationController(CalculationView theView, CalculatorModel theModel)

    {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListener());
        this.theView.addMultipliListener(new CalculateListener2());


    }

    class CalculateListener implements ActionListener

    {
        public void actionPerformed(ActionEvent arg0)

        {
            int firstNumber, secondNumber = 0;

            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber, secondNumber);

                theView.setCalcSolution(theModel.getCalculationValue());
            } catch (NumberFormatException ex)

            {

                theView.displayErrorMessage("Enter 2 integers");
            }
        }
    }


    class CalculateListener2 implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            int firstNumber, secondNumber=0;

            try{
                firstNumber=theView.getFirstNumber();
                secondNumber=theView.getSecondNumber();

                theModel.multipliValues(firstNumber, secondNumber);

                theView.setCalcSolution(theModel.getMultipleValue());





            }catch (NumberFormatException ex)

            {
                theView.displayErrorMessage("Enter 2 integers");

            }


        }
    }


}