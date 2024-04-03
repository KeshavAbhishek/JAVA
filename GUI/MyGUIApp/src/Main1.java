import javax.swing.*;

public class Main1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Input Field Example");
        JTextField textField = new JTextField(20); // 20 is the initial width of the text field

        // Add the text field to the frame
        frame.getContentPane().add(textField);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
