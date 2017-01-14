import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {

	private JPanel windowContent;
	private JTextField displayField;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonPoint;
    private JButton buttonEqual;
    private JPanel p1;

    public void setDisplayValue(String val){
        displayField.setText(val);
    }

    public String getDisplayValue() {
        return displayField.getText();
    }

    public Calculator() {
        windowContent= new JPanel();
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
        displayField = new JTextField(30);
        windowContent.add("North", displayField);
        button0=new JButton("0");
        button1=new JButton("1");
        button2=new JButton("2");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        button6=new JButton("6");
        button7=new JButton("7");
        button8=new JButton("8");
        button9=new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual=new JButton("=");
        p1 = new JPanel();
        GridLayout gl =new GridLayout(4,3);
        p1.setLayout(gl);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);
        CalculatorEngine calcEngine = new CalculatorEngine(this);
        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        windowContent.add("Center", p1);
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);
     }

    public static void main(String[] args) {
        new Calculator();
    }
}
