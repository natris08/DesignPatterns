package Memento;

import java.util.ArrayList;

public class Client {

    public static void main(String[] args){
        TextEditor t = new TextEditor();
        Caretaker c = new Caretaker(t);
        c.avanti();
        t.cambiaStato("gg");
        c.avanti();
        c.indietro();
        c.indietro();
        /*ArrayList<TextEditor.TextEditorMemento> history = c.getHistory();
        for (TextEditor.TextEditorMemento h : history){
            System.out.println(h.getStateM());
        }*/
        System.out.println(t.getState());
    }

}
