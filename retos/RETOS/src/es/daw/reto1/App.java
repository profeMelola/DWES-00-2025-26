/*
 * Examen en convocatoria ordinaria
 * 
 */
package es.daw.reto1;



import es.daw.reto1.model.Arco;
import es.daw.reto1.model.Arma;
import es.daw.reto1.model.EspadaAcero;
import es.daw.reto1.model.EspadaHielo;
import es.daw.reto1.model.GestorArmas;


/**
 *
 * @author melola
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GestorArmas gestor = new GestorArmas();

        gestor.addArma(new EspadaAcero("Espada de acero inoxidable", 100, true));
        gestor.addArma(new EspadaHielo("Espada de hielo polar", 50, false));
        gestor.addArma(new Arco("Arco olímpico", 75, 125.5f));

        System.out.println("* Número de armas creadas:"+Arma.getContador());

        System.out.println("\n* Listado de armas:");
        System.out.println(gestor);

        gestor.removeArma(); //borra el último

        System.out.println("\n* Listado después de borrar la última arma:");
        System.out.println(gestor);

        gestor.removeArma();
        gestor.removeArma();

        System.out.println("Ya no hay armas... voy a intentar borrar...");
        gestor.removeArma();

        

    }

}
