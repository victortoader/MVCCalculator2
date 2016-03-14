/**
 * Created by 279766 on 03.11.2016.
 */

import java.awt.event.ActionListener;
import javax.swing.*;


public class CalculationView extends JFrame {

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionalLabel = new JLabel("+");
    private JButton multiplyButton = new JButton("Multiply");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("SUM");
    private JTextField calcSolution = new JTextField(10);


    CalculationView()

    {
        JPanel calcPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        calcPanel.add(firstNumber);


        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);
        calcPanel.add(multiplyButton);
        calcPanel.add(calcSolution);

        this.add(calcPanel);


    }


    public int getFirstNumber() {

        return Integer.parseInt(firstNumber.getText());


    }

    public int getSecondNumber()

    {
        return Integer.parseInt(secondNumber.getText());

    }

    public int getCalcSolution()

    {
        return Integer.parseInt(calcSolution.getText());

    }


    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));

    }

    void addCalculationListener(ActionListener listenerForCalcButton)

    {
        calculateButton.addActionListener(listenerForCalcButton);

    }


    void addMultipliListener(ActionListener listenerForMultipliButton)
    {

        multiplyButton.addActionListener(listenerForMultipliButton);

    }


    void displayErrorMessage(String errorMessage) {

        JOptionPane.showMessageDialog(this, errorMessage);
    }


}
