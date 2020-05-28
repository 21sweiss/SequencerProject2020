    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    /// LTPanel is a JPanel containing a JLabel and a JTextField
    public class Stop extends JPanel
    {
        JButton stop;
        ButtonState buttonState;
        Data data;
        public Stop() 
        {
            super();
            stop = new JButton("Stop");
 
            this.add(stop);
            
            stop.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(stop.getBackground().equals(buttonState.clickMe)){
                    buttonState.state0();}
                }
            });
            
        }
        public void addButtonState(ButtonState butt){
            this.buttonState = butt;
        }


            

}