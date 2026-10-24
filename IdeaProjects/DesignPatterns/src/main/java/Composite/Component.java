package Composite;

public interface Component {

    public void operation();
    public void aggiungi(Component c);
    public void rimuovi(Component c);
    public Component getChild(int i);

}
