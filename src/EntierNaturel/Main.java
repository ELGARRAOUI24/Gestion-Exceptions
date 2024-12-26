package EntierNaturel;

public class Main {
    public static void main(String[] args) {
        //Test 1
        System.out.println("==> Test 1 : Constructeur avec unre valeur négative <==");
        try {
            EntierNaturel E1 = new EntierNaturel(-1);
            System.out.println("Val: " + E1.getVal());
        } catch (NombreNegatifException e) {
            System.out.println("Message d'exception 1 : " + e.getMessage());
            System.out.println("la valeur erronée est : " + e.getValWrong());
        }
        //Test 2
        System.out.println("==> Test 2 : Affectation une valeur nulle via setVal() <==");
        try {
            EntierNaturel E2 = new EntierNaturel(10);
            E2.setVal(-2);
        } catch (NombreNegatifException e) {
            System.out.println("Message d'exception 2 : " + e.getMessage());
            System.out.println("la valeur erronée est : " + e.getValWrong());
        }
        //Test 3
        System.out.println("==>  Test 3 : la méthode décrementation <==");
        try {
            EntierNaturel E3 = new EntierNaturel(4);
            System.out.println("La valeur initale de l'attribut Val est : " + E3.getVal());
            while (true) {
                E3.decrementer();
                System.out.println("La nouvelle valeur après décrementation de l'attribut Val est : " + E3.getVal());
            }
        }catch (NombreNegatifException e) {
            System.out.println("Message d'exception 3 : " + e.getMessage());
        }

    }
}