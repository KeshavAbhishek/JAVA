import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("MyApp | GUI");
        frame.setSize(400, 300);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setBackground(new Color(0, 255, 255));

        JLabel heading = new JLabel();
        heading.setText("Monthly Expense Calculator");
        heading.setSize(400, 50);
        heading.setFont(new Font("Arial", Font.BOLD, 25));
        heading.setForeground(Color.BLACK);
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setVerticalAlignment(SwingConstants.TOP);

        // Adding padding to the heading
        heading.setBorder(new CompoundBorder(
            new EmptyBorder(10, 0, 10, 0),
            new LineBorder(Color.RED, 2) // Setting line border with red color
        ));

        frame.add(heading);

        // Add a text field
        JTextField debit = new JTextField(20);
        frame.add(debit);

        // Set layout to null to manually position components
        frame.setLayout(null);

        // Set bounds for the text field
        debit.setBounds(100, 100, 200, 30);
    }
}
