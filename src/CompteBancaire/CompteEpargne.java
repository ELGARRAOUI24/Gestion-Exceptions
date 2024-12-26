package CompteBancaire;

public class CompteEpargne extends CompteBancaire{
    private double interet;

    public CompteEpargne(int numero, double solde, String nom, double interet) {
        super(numero, solde, nom);
        this.interet = interet;
    }

    public void addInteret() throws FondsInsuffisantsException {
        double montantInteret = getSolde() * interet / 100;
        deposer(montantInteret);
        System.out.println("Le montant de " + montantInteret + " a été ajouté au compte.");
    }
}
