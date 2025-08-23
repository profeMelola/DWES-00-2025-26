package es.daw.reto1.model;

public class Arco extends Arma {

    private float distancia;

    public Arco(String nombre, int damage, float distancia) {
        super(nombre, damage);
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return super.toString()+"-> Arco [distancia=" + distancia + "]";
    }

    

    
}
