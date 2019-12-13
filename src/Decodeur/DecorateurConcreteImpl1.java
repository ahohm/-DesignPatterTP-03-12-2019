package Decodeur;

public class DecorateurConcreteImpl1 extends DecorateurAbstrait {
    public DecorateurConcreteImpl1(ComposantAbstrait composantAbstrait) {
        super(composantAbstrait);
    }

    @Override
    public void operation() {
        System.out.println("Decorateur 1: avant je fait X");
        composantAbstrait.operation();
        System.out.println("Decorateur 1: apres je fait Y");

    }
}
