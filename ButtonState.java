import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * contains methods that change and set all the button colors when something happens 
 * based on info in Data
 * 
 * Used this to learn how to change button colors: https://community.oracle.com/thread/1142547
 * 
 */
public class ButtonState
{
    Color clickMe = new Color(20,250,219);
    Color dontClick = new Color(169,154,192);
    Color selected = new Color(92,192,250);
    
    SharpAndNext sharpAndNext;
    OctaveChoice octaveChoice;
    ChooseNote chooseNote;
    ChooseNoteVal chooseNoteVal;
    Stop stop;
    FinishMeasure finishMeasure;
    Data data;
    
    
    public ButtonState(SharpAndNext sh, OctaveChoice o, ChooseNote n, ChooseNoteVal v, 
    Stop st, Data d, FinishMeasure f){
        sharpAndNext = sh;
        octaveChoice = o;
        chooseNote = n;
        chooseNoteVal = v;
        stop = st;
        data = d;
        finishMeasure = f; 
    }
    public void state0(){
        sharpAndNext.sharp.setBackground(dontClick);
        sharpAndNext.next.setBackground(dontClick);
        octaveChoice.button1.setBackground(dontClick);
        octaveChoice.button2.setBackground(dontClick);
        octaveChoice.button3.setBackground(dontClick);
        octaveChoice.middleC.setBackground(dontClick);
        octaveChoice.button4.setBackground(dontClick);
        octaveChoice.button5.setBackground(dontClick);
        octaveChoice.button6.setBackground(dontClick);
        chooseNote.a.setBackground(dontClick);
        chooseNote.b.setBackground(dontClick);
        chooseNote.c.setBackground(dontClick);
        chooseNote.d.setBackground(dontClick);
        chooseNote.e.setBackground(dontClick);
        chooseNote.f.setBackground(dontClick);
        chooseNote.g.setBackground(dontClick);
        chooseNoteVal.whole.setBackground(clickMe);
        chooseNoteVal.quarter.setBackground(clickMe);
        chooseNoteVal.half.setBackground(clickMe);
        stop.stop.setBackground(dontClick);
        finishMeasure.done.setBackground(dontClick);
    }
        

    public void state1(){        
        stop.stop.setBackground(clickMe);
        
        if(data.currentNoteVal == 'w'){
            chooseNoteVal.whole.setBackground(selected);
            chooseNoteVal.half.setBackground(dontClick);
            chooseNoteVal.quarter.setBackground(dontClick);
        }
        else if(data.currentNoteVal == 'h'){
            chooseNoteVal.half.setBackground(selected);
            chooseNoteVal.quarter.setBackground(dontClick);
            chooseNoteVal.whole.setBackground(dontClick);
        }
        else if(data.currentNoteVal == 'q'){
            chooseNoteVal.quarter.setBackground(selected);
            chooseNoteVal.half.setBackground(dontClick);
            chooseNoteVal.whole.setBackground(dontClick);
        }
        octaveChoice.button1.setBackground(clickMe);
        octaveChoice.button2.setBackground(clickMe);
        octaveChoice.button3.setBackground(clickMe);
        octaveChoice.middleC.setBackground(clickMe);
        octaveChoice.button4.setBackground(clickMe);
        octaveChoice.button5.setBackground(clickMe);
        octaveChoice.button6.setBackground(clickMe);
    }
    public void state3(){
        sharpAndNext.sharp.setBackground(clickMe);
        sharpAndNext.next.setBackground(clickMe);

        if(data.currentOctave ==0){
            octaveChoice.button1.setBackground(dontClick);
            octaveChoice.button2.setBackground(dontClick);
            octaveChoice.button3.setBackground(dontClick);
            octaveChoice.button4.setBackground(dontClick);
            octaveChoice.button5.setBackground(dontClick);
            octaveChoice.button6.setBackground(dontClick);
            octaveChoice.middleC.setBackground(selected);
        }
        else if(data.currentOctave ==1){
            octaveChoice.button2.setBackground(dontClick);
            octaveChoice.button3.setBackground(dontClick);
            octaveChoice.middleC.setBackground(dontClick);
            octaveChoice.button4.setBackground(dontClick);
            octaveChoice.button5.setBackground(dontClick);
            octaveChoice.button6.setBackground(dontClick);
            octaveChoice.button1.setBackground(selected);
        }
        else if(data.currentOctave ==2){
            octaveChoice.button1.setBackground(dontClick);
            octaveChoice.button3.setBackground(dontClick);
            octaveChoice.middleC.setBackground(dontClick);
            octaveChoice.button4.setBackground(dontClick);
            octaveChoice.button5.setBackground(dontClick);
            octaveChoice.button6.setBackground(dontClick);
            octaveChoice.button2.setBackground(selected);
        }
        else if(data.currentOctave ==3){
            octaveChoice.button1.setBackground(dontClick);
            octaveChoice.button2.setBackground(dontClick);
            octaveChoice.middleC.setBackground(dontClick);
            octaveChoice.button4.setBackground(dontClick);
            octaveChoice.button5.setBackground(dontClick);
            octaveChoice.button6.setBackground(dontClick);
            octaveChoice.button3.setBackground(selected);
        }
        else if(data.currentOctave ==4){
            octaveChoice.button1.setBackground(dontClick);
            octaveChoice.button2.setBackground(dontClick);
            octaveChoice.button3.setBackground(dontClick);
            octaveChoice.middleC.setBackground(dontClick);
            octaveChoice.button5.setBackground(dontClick);
            octaveChoice.button6.setBackground(dontClick);
            octaveChoice.button4.setBackground(selected);
        }
        else if(data.currentOctave ==5){
            octaveChoice.button1.setBackground(dontClick);
            octaveChoice.button2.setBackground(dontClick);
            octaveChoice.button3.setBackground(dontClick);
            octaveChoice.middleC.setBackground(dontClick);
            octaveChoice.button4.setBackground(dontClick);
            octaveChoice.button6.setBackground(dontClick);
            octaveChoice.button5.setBackground(selected);
        }
        else if(data.currentOctave ==6){
            octaveChoice.button1.setBackground(dontClick);
            octaveChoice.button2.setBackground(dontClick);
            octaveChoice.button3.setBackground(dontClick);
            octaveChoice.middleC.setBackground(dontClick);
            octaveChoice.button4.setBackground(dontClick);
            octaveChoice.button5.setBackground(dontClick);
            octaveChoice.button6.setBackground(selected);
        }
        
        chooseNote.a.setBackground(clickMe);
        chooseNote.b.setBackground(clickMe);
        chooseNote.c.setBackground(clickMe);
        chooseNote.d.setBackground(clickMe);
        chooseNote.e.setBackground(clickMe);
        chooseNote.f.setBackground(clickMe);
        chooseNote.g.setBackground(clickMe);

    }
    public void state3a(){
        sharpAndNext.sharp.setBackground(selected); 
    }
    public void noteState(char note){
        if(note == 'a'){
            chooseNote.a.setBackground(selected);
        }
        else if(note =='b'){
            chooseNote.b.setBackground(selected);
        }
        else if (note =='c'){
            chooseNote.c.setBackground(selected);
        }
        else if(note == 'd'){
            chooseNote.d.setBackground(selected);
        }
        else if(note == 'e'){
            chooseNote.e.setBackground(selected); 
        }
        else if(note == 'f'){
            chooseNote.f.setBackground(selected);
        }
        else if(note == 'g'){
            chooseNote.g.setBackground(selected); 
        }
        sharpAndNext.sharp.setBackground(clickMe); 
        octaveChoice.button1.setBackground(clickMe);
        octaveChoice.button2.setBackground(clickMe);
        octaveChoice.button3.setBackground(clickMe);
        octaveChoice.middleC.setBackground(clickMe);
        octaveChoice.button4.setBackground(clickMe);
        octaveChoice.button5.setBackground(clickMe);
        octaveChoice.button6.setBackground(clickMe);
        
    }

        
    
}
