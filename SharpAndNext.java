    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    /// LTPanel is a JPanel containing a JLabel and a JTextField
    public class SharpAndNext extends JPanel
    {
        JButton sharp, next;
        private ButtonState buttonState;
        Data data;
        public SharpAndNext() 
        {
            super();
            sharp = new JButton("Sharp This Note");
            next = new JButton("Next Notes -->");

            this.add(sharp);
            this.add(next);
            
            sharp.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(sharp.getBackground().equals(buttonState.clickMe)){
                    buttonState.state3a();}
                }
            });
            next.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                   if(next.getBackground().equals(buttonState.clickMe)){
                    data.noteYet = true;
                    buttonState.state0();
                }
                }
            });
        }
        public void addButtonState(ButtonState butt){
            this.buttonState = butt;
        }

}