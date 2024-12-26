package EntierNaturel;

public class NombreNegatifException extends Exception{
    private int valWrong = 0;

    public NombreNegatifException(String msg){
        super(msg);
    }
    public NombreNegatifException(int val, String msg){
        super(msg);
        this.valWrong = val;
    }

    public int getValWrong() {
        return valWrong;
    }
}
