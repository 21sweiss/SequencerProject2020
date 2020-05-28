import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class PythagorasGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainClass
{
    //utility classes
    Data data;
    ButtonState buttonState;
     
    //JFrames
    JFrame frame;
    SystemMessage systemMessage;
    OctaveChoice octaveChoice;
    ChooseNote chooseNote;
    SharpAndNext sharpAndNext;
    ChooseNoteVal chooseNoteVal;
    Stop stop; 
    FinishMeasure finishMeasure;
    

    public MainClass()
    {
        frame = new JFrame("Sydney's Marvelous MIDI Masterpeice");
        frame.setLayout(new BoxLayout(frame.getContentPane(), 
        BoxLayout.PAGE_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        systemMessage = new SystemMessage();
        chooseNoteVal = new ChooseNoteVal();
        sharpAndNext = new SharpAndNext();        
        chooseNote = new ChooseNote();               
        octaveChoice = new OctaveChoice();   
        stop = new Stop();
        finishMeasure = new FinishMeasure(); 
        
        data = new Data();
        buttonState = new ButtonState(sharpAndNext, octaveChoice, 
        chooseNote, chooseNoteVal,stop,data,finishMeasure); 
        
        stop.addButtonState(buttonState);
        sharpAndNext.addButtonState(buttonState); 
        octaveChoice.addButtonState(buttonState);
        chooseNote.addButtonState(buttonState);
        chooseNoteVal.addButtonState(buttonState);
        finishMeasure.addButtonState(buttonState); 
        sharpAndNext.data = data; 
        octaveChoice.data = data;
        chooseNote.data = data;
        chooseNoteVal.data = data;
        stop.data = data;
        finishMeasure.data = data;  
        data.addPreNote(); 
       
        
        buttonState.state0();
       
        frame.add(systemMessage);
        frame.add(chooseNoteVal);
        frame.add(octaveChoice);
        frame.add(sharpAndNext);
        frame.add(chooseNote);
        frame.add(finishMeasure); 
        frame.add(stop); 
        
        frame.pack();
        frame.setVisible(true);        
    }
    public static void main(String[] args)
    {
        MainClass x = new MainClass();
    }
}