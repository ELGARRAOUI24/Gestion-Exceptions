package EntierNaturel;

public class EntierNaturel {
    private int val;

    public EntierNaturel(int val) throws NombreNegatifException {
        if(val < 0) throw new NombreNegatifException(val, "La valeur donnée pour initialiser le constructeur est négative !!!");
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if(val < 0) throw new NombreNegatifException(val, "La valeur affectée au Val est négative !!!");
        this.val = val;
    }

    public void decrementer() throws NombreNegatifException {
        if(val == 0) throw new NombreNegatifException("Impossible de décrementer l'attribut val car il est est nul");
        this.val--;
    }
}
