    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    /// LTPanel is a JPanel containing a JLabel and a JTextField
    public class ChooseNoteVal extends JPanel
    {
        JButton whole, quarter, half;
        private ButtonState buttonState;
        Data data; 
        public ChooseNoteVal() 
        {
            super();
            whole = new JButton("Whole");
            half = new JButton("Half");
            quarter = new JButton("Quarter");

            this.add(whole);
            this.add(half);
            this.add(quarter);
            
            whole.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(whole.getBackground().equals(buttonState.clickMe)){
                    data.currentNoteVal = 'w';
                    buttonState.state1();}
                } 
            });
            half.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(half.getBackground().equals(buttonState.clickMe)){
                    data.currentNoteVal = 'h';
                    buttonState.state1();}
                }
            }); 
            quarter.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(quarter.getBackground().equals(buttonState.clickMe)){
                    data.currentNoteVal = 'q';
                    buttonState.state1();}
                }
            });
            
        }
        public void addButtonState(ButtonState butt){
            this.buttonState = butt;
        }

}