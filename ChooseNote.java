    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    /// LTPanel is a JPanel containing a JLabel and a JTextField
    public class ChooseNote extends JPanel
    {
        JButton a, b, c, d, e, f,g;
        ButtonState buttonState;
        Data data;
        public ChooseNote() 
        {
            super();
            a = new JButton("A");
            b = new JButton("B");
            c = new JButton("C");
            d = new JButton("D");
            e = new JButton("E");
            f = new JButton("F");
            g = new JButton("G");

            this.add(a);
            this.add(b);
            this.add(c);
            this.add(d);
            this.add(e);
            this.add(f);
            this.add(g);
            
            a.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(a.getBackground().equals(buttonState.clickMe)){
                   buttonState.noteState('a');}
                }
            });
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(b.getBackground().equals(buttonState.clickMe)){
                    buttonState.noteState('b');}
                }
            });
            c.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(c.getBackground().equals(buttonState.clickMe)){
                    buttonState.noteState('c');}
                }
            });
            d.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(d.getBackground().equals(buttonState.clickMe)){
                    buttonState.noteState('d');}
                }
            });
            e.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(e.getBackground().equals(buttonState.clickMe)){
                    buttonState.noteState('e');}
                }
            });
            f.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(f.getBackground().equals(buttonState.clickMe)){
                    buttonState.noteState('f');}
                }
            });
            g.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae)
                {
                    if(g.getBackground().equals(buttonState.clickMe)){
                    buttonState.noteState('g');}
                }
            });

        }
        public void addButtonState(ButtonState butt){
            this.buttonState = butt;
        }

}