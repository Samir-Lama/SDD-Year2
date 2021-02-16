import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelciusConvertGUI extends JFrame{
    private JPanel mainPanel;
    private JButton calculateButton;
    private JTextField celciusTextField;
    private JLabel resultLabel;
    private JLabel titleLabel;

    public CelciusConvertGUI(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
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
        frame.setSize(800,200);
        frame.setVisible(true);

    }


}
