package Memento;

import java.util.ArrayList;

public class Caretaker {

    private TextEditor originator;
    private ArrayList<TextEditor.TextEditorMemento> history;

    public Caretaker(TextEditor originator){
        this.originator = originator;
        history = new ArrayList<>();
    }

    public void avanti(){
        TextEditor.TextEditorMemento m = originator.save();
        history.add(m);
    }

    public void indietro(){
        TextEditor.TextEditorMemento m = history.remove(history.size()-1);
        originator.restore(m);
    }

    public ArrayList<TextEditor.TextEditorMemento> getHistory(){
        return history;
    }

}
