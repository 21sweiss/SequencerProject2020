    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    /// LTPanel is a JPanel containing a JLabel and a JTextField
    public class OctaveChoice extends JPanel
    {
        JButton button1, button2, button3, middleC, button4, button5, button6;
        private ButtonState buttonState; 
        Data data;
        public OctaveChoice() 
        {
            super();
            
            
            button1 = new JButton(" ");
            button2 = new JButton(" ");
            button3 = new JButton(" ");
            middleC = new JButton("Mid. C");
            button4 = new JButton(" ");
            button5 = new JButton(" ");
            button6 = new JButton(" ");


            this.add(button1);
            this.add(button2);
            this.add(button3);
            this.add(middleC);
            this.add(button4);
            this.add(button5);
            this.add(button6);
            
            button1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(button1.getBackground().equals(buttonState.clickMe)){
                    data.currentOctave = 1;
                    buttonState.state3();}
                }
            });
            button2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(button2.getBackground().equals(buttonState.clickMe)){
                    data.currentOctave = 2;
                    buttonState.state3();}
                }
            });
            button3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(button3.getBackground().equals(buttonState.clickMe)){
                    data.currentOctave = 3;
                    buttonState.state3();}
                }
            });
            middleC.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(middleC.getBackground().equals(buttonState.clickMe)){
                    data.currentOctave = 0;
                    buttonState.state3();}
                }
            });
            button4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(button4.getBackground().equals(buttonState.clickMe)){
                    data.currentOctave =4;
                    buttonState.state3();}
                }
            });
            button5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(button5.getBackground().equals(buttonState.clickMe)){
                    data.currentOctave = 5;
                    buttonState.state3();}
                }
            });
            button6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(button6.getBackground().equals(buttonState.clickMe)){
                    data.currentOctave = 6; 
                    buttonState.state3();}
                }
            });

        }
        public void addButtonState(ButtonState butt){
            this.buttonState = butt; 
        }

}
