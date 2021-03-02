import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ex1 extends JFrame{
    private JCheckBox oilChangeCheckBox;
    private JCheckBox lubeJob18CheckBox;
    private JCheckBox radiatorFlushCheckBox;
    private JCheckBox transmissionFlushCheckBox;
    private JCheckBox inspectionCheckBox;
    private JCheckBox mufflerReplacementCheckBox;
    private JCheckBox tireRotationCheckBox;
    private JLabel titleJLabel;
    private JPanel ex1Panel;
    private JButton calculateButton;
    private JLabel resultLabel;
    public double amt = 0;

    public ex1(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(ex1Panel);
        this.pack();
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(oilChangeCheckBox.isSelected()){
                    amt += 26;
                }
                if(lubeJob18CheckBox.isSelected()){
                    amt+= 18;
                }
                if(radiatorFlushCheckBox.isSelected()){
                    amt+=30;
                }
                if(transmissionFlushCheckBox.isSelected()){
                    amt+=80;
                }
                if(inspectionCheckBox.isSelected()){
                    amt+=15;
                }
                if(mufflerReplacementCheckBox.isSelected()){
                    amt+=100;
                }
                if(tireRotationCheckBox.isSelected()){
                    amt+=20;
                }

                resultLabel.setText("Your total amt to pay is : " + amt );
                amt = 0;
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new ex1("Exercise 1");
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
