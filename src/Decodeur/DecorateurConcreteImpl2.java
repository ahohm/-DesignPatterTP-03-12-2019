package Decodeur;

public class DecorateurConcreteImpl2 extends DecorateurAbstrait {


    public DecorateurConcreteImpl2(ComposantAbstrait composantAbstrait) {
        super(composantAbstrait);
    }

    @Override
    public void operation() {
        System.out.println("Decorateur 1: avant je fait A");
        composantAbstrait.operation();
        System.out.println("Decorateur 1: apres je fait B");
    }
}
