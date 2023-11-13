import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Day of the Week Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();

        JTextField yearField = new JTextField(5);
        JTextField monthField = new JTextField(2);
        JTextField dayField = new JTextField(2);
        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Result: ");

        panel.add(new JLabel("Year: "));
        panel.add(yearField);
        panel.add(new JLabel("Month: "));
        panel.add(monthField);
        panel.add(new JLabel("Day: "));
        panel.add(dayField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        frame.add(panel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String yearText = yearField.getText();
                String monthText = monthField.getText();
                String dayText = dayField.getText();

                try {
                    if (yearText.isEmpty() || monthText.isEmpty() || dayText.isEmpty()) {
                        resultLabel.setText("Result: Please fill in all fields.");
                    } else {
                        int y = Integer.parseInt(yearText);
                        int m = Integer.parseInt(monthText);
                        int d = Integer.parseInt(dayText);

                        if (yearText.length() != 4) {
                            resultLabel.setText("Result: Please enter a 4-digit year.");
                        } else if (m < 1 || m > 12) {
                            resultLabel.setText("Result: Please enter a value between 1 and 12 for the month.");
                        } else if (d < 1 || d > 31) {
                            resultLabel.setText("Result: Please enter a value between 1 and 31 for the day.");
                        } else {
                            boolean isLeapYear = ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0);
                            if ((m == 2 && d == 29 && !isLeapYear) || (m == 2 && d > 29) || (m == 2 && d < 1)) {
                                resultLabel.setText("Result: Invalid date. Leap year requires February 29.");
                            } else {
                                int a1, a2, a3, a4;
                                int[] arr = {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
                                String[] day = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

                                a1 = (y - 1900);
                                if (isLeapYear) {
                                    a2 = (a1 / 4) - 1;
                                } else {
                                    a2 = a1 / 4;
                                }
                                a3 = a1 + a2 + d + arr[m - 1];
                                a4 = a3 % 7;
                                resultLabel.setText("Result: " + day[a4]);
                            }
                        }
                    }
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Result: Please enter valid numeric values for year, month, and day.");
                }
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
