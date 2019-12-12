package CompositeExercice;

import java.util.List;

public class Element extends Term {

    private List<Term> terms;

    @Override
    public void add(Term comp) {
        terms.add(comp);
    }

    @Override
    public void remove(Term comp) {
        terms.remove(comp);
    }

    @Override
    public List<Term> getChild() {
        return terms;
    }

    @Override
    public void operation() {
        System.out.println(" operation elements");
    }
}
