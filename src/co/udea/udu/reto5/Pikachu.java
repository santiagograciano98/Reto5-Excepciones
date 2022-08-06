package co.udea.udu.reto5;

public class Pikachu extends Pokemon{

    public Pikachu() {
    }

    public Pikachu(String nombre, byte nivel, int puntajeSalud) {
        super(nombre, nivel, puntajeSalud);
    }
    

    @Override
    public Pokemon evolucionar() {
        Pokemon pikachu = new Raichu(nombre,nivel,puntajeSalud);
        return pikachu;
    }

    @Override
    public String gritar() {
        return "pikachu";
    }
    
}
