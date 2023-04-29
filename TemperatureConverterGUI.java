
// Import necessary packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Define a class that extends JFrame and implements ActionListener
public class TemperatureConverterGUI extends JFrame implements ActionListener {
    // Declare instance variables
    private JTextField inputField;
    private JButton cToFButton, cToKButton, fToKButton;
    private JLabel resultLabel;

    // Define the constructor for the class
    public TemperatureConverterGUI() {
        // Call the constructor of the JFrame superclass and set the title of the JFrame
        super("Temperature Converter");

        // Set the layout of the JFrame to a grid layout with 4 rows, 2 columns, and 10
        // pixels of horizontal and vertical spacing
        setLayout(new GridLayout(4, 2, 20, 20));

        // Create a label and a text field for the input temperature
        JLabel inputLabel = new JLabel("Enter temperature:");
        inputField = new JTextField(10);

        // Create three buttons for the three temperature conversions
        cToFButton = new JButton("Convert Celsius to Fahrenheit");
        cToKButton = new JButton("Convert Celsius to Kelvin");
        fToKButton = new JButton("Convert Fahrenheit to Kelvin");

        // Add an action listener to each button
        cToFButton.addActionListener(this);
        cToKButton.addActionListener(this);
        fToKButton.addActionListener(this);

        // Create a label for the result of the temperature conversion
        JLabel resultTextLabel = new JLabel("Result:");
        resultLabel = new JLabel("");

        // Add all the components to the JFrame
        add(inputLabel);
        add(inputField);
        add(cToFButton);
        add(cToKButton);
        add(fToKButton);
        add(resultTextLabel);
        add(resultLabel);

        // Set the default close operation and pack the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        // Set the JFrame to be visible
        setVisible(true);
    }

    // Define the actionPerformed method from the ActionListener interface

    public void actionPerformed(ActionEvent e) {
        // Get the input temperature from the text field as a double
        double celsius = Double.parseDouble(inputField.getText());

        // Determine which button was clicked and perform the appropriate temperature
        // conversion
        if (e.getSource() == cToFButton) {
            // Convert Celsius to Fahrenheit using the formula and update the result label
            double fahrenheit = celsius * 9 / 5 + 32;
            resultLabel.setText(String.format("%.2f °F", fahrenheit));
        } else if (e.getSource() == cToKButton) {
            // Convert Celsius to Kelvin using the formula and update the result label
            double kelvin = celsius + 273.15;
            resultLabel.setText(String.format("%.2f K", kelvin));
        } else if (e.getSource() == fToKButton) {
            // Get the input temperature as Fahrenheit and convert Fahrenheit to Kelvin
            // using the formula and update the result label
            double fahrenheit = Double.parseDouble(inputField.getText());
            double kelvin = (fahrenheit + 459.67) * 5 / 9;
            resultLabel.setText(String.format("%.2f K", kelvin));
        }
    }

    // Define the main method of the class
    public static void main(String[] args) {
        // Create an instance of the TemperatureConverterGUI class
        TemperatureConverterGUI gui = new TemperatureConverterGUI();
    }
}
