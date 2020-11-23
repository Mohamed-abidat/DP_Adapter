package adapter;

import old.OldImplimentation;

//Heritage
public class AdapterImpl extends OldImplimentation implements Standard {

    @Override
    public void operation(double nb1, double nb2) {
        afficher(produit(nb1,nb2));
    }
}
