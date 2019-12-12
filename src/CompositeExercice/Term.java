package CompositeExercice;

import java.util.List;

public abstract class Term {
    public abstract void add(Term comp);
    public abstract void remove(Term comp);
    public abstract List<Term> getChild();

    public abstract  void  operation();
}
