package co.udea.udu.reto5;

public class NoEvolucionaException extends Exception{
    public NoEvolucionaException(){
        super("Este pokemon no puede evolucionar mas");
    }
}
