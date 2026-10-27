package Memento;

public class TextEditor {

    private String state = "a";

    public TextEditorMemento save(){
        return new TextEditorMemento(state);
    }

    public void restore(TextEditorMemento memento){
        state = memento.getStateM();
    }

    public void cambiaStato(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public class TextEditorMemento{

        private String stateM;

        private TextEditorMemento(String state){
            this.stateM = state;
        }

        private String getStateM(){
            return stateM;
        }

    }

}
