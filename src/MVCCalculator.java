/**
 * Created by 279766 on 03.11.2016.
 */
public class MVCCalculator {
    public static void main(String[] args) {
        CalculationView theView = new CalculationView();
        CalculatorModel theModel = new CalculatorModel();
        CalculationController theController = new CalculationController(theView, theModel);
        theView.setVisible(true);

    }


}
