import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class CalculatorEngine implements ActionListener {

    private Calculator parent;
    public CalculatorEngine(Calculator parent){
   this.parent = parent;
 }

    public void actionPerformed(ActionEvent e){
        JButton clickedButton =  (JButton) e.getSource();
        String dispFieldText = parent.getDisplayValue();
        String clickedButtonLabel = clickedButton.getText();
        parent.setDisplayValue(dispFieldText + clickedButtonLabel);
    }
}