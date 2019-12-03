package composite;

import java.util.List;

public class Element extends Composant {

    private List<Composant> composants;

    @Override
    public void add(Composant comp) {
        composants.add(comp);
    }

    @Override
    public void remove(Composant comp) {
        composants.remove(comp);
    }

    @Override
    public List<Composant> getChild() {
        return composants;
    }

    @Override
    public void operation() {
        System.out.println(" operation elements");
    }
}
