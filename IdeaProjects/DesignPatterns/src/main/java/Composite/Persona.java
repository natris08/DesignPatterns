package Composite;

public class Persona implements Component{

    private String nome;

    public Persona(String nome){
        this.nome = nome;
    }

    @Override
    public void operation() {
        System.out.println(nome);
    }

    @Override
    public void aggiungi(Component c) {

    }

    @Override
    public void rimuovi(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }
}
