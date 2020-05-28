    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    /// LTPanel is a JPanel containing a JLabel and a JTextField
    public class FinishMeasure extends JPanel
    {
        JButton done;
        ButtonState buttonState;
        Data data;
        public FinishMeasure() 
        {
            super();
            done = new JButton("Finish Measure and Play!");
 
            this.add(done);
            
            done.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                   if(done.getBackground().equals(buttonState.clickMe)){
                       
                    }
                }
            });
            
        }
        public void addButtonState(ButtonState butt){
            this.buttonState = butt;
        }


            

}