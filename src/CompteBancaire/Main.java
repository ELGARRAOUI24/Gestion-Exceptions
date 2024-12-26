package CompteBancaire;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CompteBancaire> comptes = new ArrayList();

        CompteCourant CC1 = new CompteCourant(215412, 15000, "Amine", 5000);
        comptes.add(CC1);
        CompteEpargne CE1 = new CompteEpargne(548596, 10000, "Saad", 10);
        comptes.add(CE1);

        try {
            CC1.deposer(1000);
            CC1.retrait(2500);
            CC1.transfert(3500, CE1);
            CC1.transfert(3500, null);
            CE1.addInteret();
        } catch (FondsInsuffisantsException | CompteInexistantException e) {
            System.out.println(e.getMessage());
        }
        try {
            CE1.deposer(-4000);
        } catch (FondsInsuffisantsException e) {
            System.out.println(e.getMessage());
        }
        try {
            CC1.retrait(12000);
        } catch (FondsInsuffisantsException e) {
            System.out.println(e.getMessage());
        }
        try {
            CE1.addInteret();
        } catch (FondsInsuffisantsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Le solde du contant courant 1 est :" +CC1.getSolde());
        System.out.println("Le solde du contant epargne 1 est :" +CE1.getSolde());

        comptes.remove(CC1);
        comptes.remove(CE1);
        System.out.println("La liste des comptes après la suppression est:" +comptes);
    }
}
