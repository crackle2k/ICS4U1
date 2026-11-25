/*
Author: Dinesh Sinnathamby
Date: November 24th, 2026
Description: Plays a guessing game with warmer and colder colours and a restart button.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 extends JPanel implements ActionListener {

    private JTextField guessField;
    private JLabel resultLabel;
    private JButton restartButton;
    private int number;
    private int previousDistance;
    private Color startingColour;

    public Q3() {
        setLayout(new FlowLayout());
        startingColour = getBackground();

        JLabel promptLabel = new JLabel("I have a number between 1 and 1000. Can you guess my number?");
        add(promptLabel);

        resultLabel = new JLabel("Please enter your first guess.");
        add(resultLabel);

        guessField = new JTextField(10);
        guessField.addActionListener(this);
        add(guessField);

        restartButton = new JButton("Restart");
        restartButton.addActionListener(this);
        add(restartButton);

        number = (int)(Math.random() * 1000) + 1;
        previousDistance = -1;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == restartButton) {
            number = (int)(Math.random() * 1000) + 1;
            previousDistance = -1;
            setBackground(startingColour);
            resultLabel.setText("Please enter your first guess.");
            guessField.setText("");
            guessField.setEditable(true);
            guessField.requestFocusInWindow();
            return;
        }

        try {
            int guess = Integer.parseInt(guessField.getText().trim());

            if (guess < 1 || guess > 1000) {
                throw new NumberFormatException();
            }

            int distance = Math.abs(number - guess);

            if (previousDistance != -1) {
                if (distance < previousDistance) {
                    setBackground(Color.RED);
                } else if (distance > previousDistance) {
                    setBackground(Color.BLUE);
                }
            }

            previousDistance = distance;

            if (guess > number) {
                resultLabel.setText("Too High");
            } else if (guess < number) {
                resultLabel.setText("Too Low");
            } else {
                resultLabel.setText("Correct!");
                guessField.setEditable(false);
            }

            guessField.selectAll();

        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(this, "Please enter a whole number from 1 to 1000.", "Invalid Guess", JOptionPane.WARNING_MESSAGE);
            guessField.selectAll();
            guessField.requestFocusInWindow();
        }
    }

    public static void main(String[] args) {

        JFrame window = new JFrame("Guess the Number");

        Q3 panel = new Q3();
        window.add(panel);

        window.setSize(520, 180);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
