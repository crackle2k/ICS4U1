/*
Author: Dinesh Sinnathamby
Date: November 24th, 2026
Description: Converts a Fahrenheit temperature to Celsius when the user presses Enter.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2 extends JPanel implements ActionListener {

    private JTextField temperatureField;
    private JLabel resultLabel;

    public Q2() {
        setLayout(new FlowLayout());

        JLabel promptLabel = new JLabel("Enter the temperature in Fahrenheit:");
        add(promptLabel);

        temperatureField = new JTextField(10);
        temperatureField.addActionListener(this);
        add(temperatureField);

        resultLabel = new JLabel("Press Enter to convert to Celsius.");
        add(resultLabel);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        try {
            double fahrenheit = Double.parseDouble(temperatureField.getText().trim());

            if (!Double.isFinite(fahrenheit)) {
                throw new NumberFormatException();
            }

            double celsius = 5.0 / 9 * (fahrenheit - 32);
            resultLabel.setText(String.format("Temperature in Celsius: %.2f °C", celsius));

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number and try again.", "Invalid Temperature", JOptionPane.WARNING_MESSAGE);
            temperatureField.selectAll();
            temperatureField.requestFocusInWindow();
        }
    }

    public static void main(String[] args) {

        JFrame window = new JFrame("Temperature Converter");

        Q2 panel = new Q2();
        window.add(panel);

        window.setSize(420, 160);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
