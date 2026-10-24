package Composite;

import java.util.ArrayList;

public class Registro implements Component{

    private ArrayList<Component> registro = new ArrayList<>();

    @Override
    public void operation() {
        for(Component c:registro)
            c.operation();
    }

    @Override
    public void aggiungi(Component c) {
        registro.add(c);
    }

    @Override
    public void rimuovi(Component c) {
        registro.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return registro.get(i);
    }
}
