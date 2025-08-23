package es.daw.reto1.model;

import java.util.ArrayList;

public class GestorArmas {
    private ArrayList<Arma> armas;

    public GestorArmas(){
        armas = new ArrayList<>();
    }

    public void addArma(Arma arma){
        armas.add(arma);
    }

    public void removeArma(){
        //if (armas.isEmpty())

        // Si tamaño es > 0 puedo borrar la última arma
        if (armas.size() > 0){
            armas.remove(armas.size()-1);
        }
        else
            System.out.println("No hay armas que borrar!!!");
        
    }

    @Override
    public String toString() {
        return "GestorArmas [armas=" + armas + "]";
    }
  
    
}
