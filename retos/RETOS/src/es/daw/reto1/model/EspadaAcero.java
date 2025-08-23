package es.daw.reto1.model;

public class EspadaAcero extends Espada {

    public EspadaAcero(String nombre, int damage, boolean afilada) {
        super(nombre, damage, afilada);
    }

    @Override
    public void cortar() {
        System.out.println("Soy de acero y corto si estoy afilada");
    }
    
}
