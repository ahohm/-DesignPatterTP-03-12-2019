package Decodeur;

public abstract class DecorateurAbstrait {

    protected ComposantAbstrait composantAbstrait;

    public DecorateurAbstrait(ComposantAbstrait composantAbstrait) {
        this.composantAbstrait = composantAbstrait;
    }

    public abstract void operation();
}
