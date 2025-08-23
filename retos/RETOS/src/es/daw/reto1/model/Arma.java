package es.daw.reto1.model;

public class Arma {
    private String nombre;
    private int damage;
    
    private static int contador;
    
    public Arma(String nombre, int damage) {
        this.nombre = nombre;
        this.damage = damage;
        contador++;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {
        return "\nArma [nombre=" + nombre + ", damage=" + damage + "]";
    }

    
    
}
