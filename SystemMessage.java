import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/// LTPanel is a JPanel containing a JLabel and a JTextField
public class SystemMessage extends JPanel
{
    private JLabel label;
    private JTextField textField;
    public SystemMessage() 
    {
        super();
        this.label = new JLabel("System Messages:");
        this.textField = new JTextField(20);
        this.add(label);
        this.add(textField);
    }
    public void setText(String str)
    {
        this.textField.setText(str);
    }
    public String getText()
    {
        return this.textField.getText();
    }
}