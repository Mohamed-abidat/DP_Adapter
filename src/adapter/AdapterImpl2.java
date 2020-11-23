package adapter;

import old.OldImplimentation;

public class AdapterImpl2 implements Standard {

    //Composition
    OldImplimentation oldImplimentation = new OldImplimentation();

    @Override
    public void operation(double nb1, double nb2) {
        oldImplimentation.afficher(oldImplimentation.produit(nb1,nb2));
    }
}
