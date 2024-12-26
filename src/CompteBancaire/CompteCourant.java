package CompteBancaire;

public class CompteCourant extends CompteBancaire{
    private double decouvert;

    public CompteCourant(int numero, double solde, String nom, double decouvert) {
        super(numero, solde, nom);
        this.decouvert = decouvert;
    }

    @Override
    public void retrait(double montant) throws FondsInsuffisantsException {
        if(getSolde() - montant < decouvert) throw new FondsInsuffisantsException("Le solde est insuffisant avec le découvert pour retirer le montant "+montant);
        super.retrait(montant);
    }
}
