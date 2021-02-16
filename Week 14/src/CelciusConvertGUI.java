import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelciusConvertGUI extends JFrame{
    private JPanel mainPanel;
    private JButton calculateButton;
    private JTextField celciusTextField;
    private JLabel titleLabel;
    private JLabel resultLabel;

    public CelciusConvertGUI(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        mainPanel.setLayout(null);
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double celcius = Double.parseDouble(celciusTextField.getText());
                resultLabel.setText("Farenheit of " + celcius + "C is " + (9.0/5.0 * celcius + 32));
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new CelciusConvertGUI("Converter");
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
