package CompteBancaire;

public class CompteBancaire {
    private int numero;
    private double solde;
    private String nom;

    public CompteBancaire(int numero, double solde, String nom) {
        this.numero = numero;
        this.solde = solde;
        this.nom = nom;
    }

    public void deposer(double montant) throws FondsInsuffisantsException {
        if(montant <= 0) throw new FondsInsuffisantsException("Le montant de dépot est invalide : " + montant);
        solde += montant;
        System.out.println("Compte du " + this.nom + " : Le montant de " + montant + " a été déposé avec succès.");
    }

    public void retrait(double montant) throws FondsInsuffisantsException {
        if(montant > solde) throw new FondsInsuffisantsException("Le solde est insuffisant pour retirer le montant de "+montant);
        solde -= montant;
        System.out.println("Compte du " + this.nom + " : Le montant de " + montant + " a été retiré avec succès.");
    }

    public double getSolde() {
        return solde;
    }

    public void transfert(double montant, CompteBancaire CD) throws CompteInexistantException, FondsInsuffisantsException {
        if(CD == null) throw new CompteInexistantException("Le compte destinataire n'existe pas.");
        retrait(montant);
        CD.deposer(montant);
        System.out.println("Le montant a été transféré vers le compte du "+ CD.nom + " avec succès.");
    }
}
