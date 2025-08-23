# 1. Repaso POO

## Gestor de armas de Minecraft

![image](https://github.com/user-attachments/assets/6439facf-0f2d-46b6-850a-efd11b812e11)

![image](https://github.com/user-attachments/assets/f0b14dd0-0c83-470f-8767-15af7f3cd574)


### Clase GestorArmas:

- Compuesto por una lista dinámica de armas.
- Una vez creado el gestor, no se podrá modificar dicha lista, salvo por los siguientes métodos:
    - **addArma:** para añadir armas a su lista. Recibirá como argumento el arma.
    - **removeLastArma:** para borrar la última arma de la lista.

### Clase Arma:

- Toda arma se caracteriza por:
    - nombre: cadena de texto.
    - damage: valor entero que indica el daño que causa.

- Para crear un arma es necesario especificar esas dos características.
- Una vez creada el arma, no se podrá modificar su nombre pero sí el daño que causa.
- Además ten en cuenta que es necesario llevar en cuenta el número de armas que se crean. Para ello es necesario controlar dicho contador en esta clase para poder consultarse en cualquier momento.

### Tipos de armas:

Habrá dos tipos de armas diferentes:

#### Espada:
- La espada se caracteriza además por si está afilada o no (afilada): valor booleano.
- Para crear una espada se necesita especificar todas sus características.
- Todas las espadas cortan, pero dependiendo del tipo de espada la forma de cortar es diferente. 
    - Acorde a las recomendaciones de POO, implementa el método cortar() teniendo en cuenta que dicho método solo muestra un mensaje por consola. 
    - Existen dos clases de Espada y el mensaje al cortar será:
        - En la clase **EspadaAcero:** “Soy de acero y corto si estoy afilada”.
        - En la clase **EspadaHielo:** “Soy de hielo y solo corto en invierno”;

#### Arco
- Esta arma se caracteriza además por la distancia de alcance (distancia): valor decimal (float).


#### **Añade el siguiente código en la clase principal de tu proyecto**
```
        GestorArmas gestor = new GestorArmas();

        gestor.addArma(new EspadaAcero("Espada de acero inoxidable", 100, true));
        gestor.addArma(new EspadaHielo("Espada de hielo polar", 50, false));
        gestor.addArma(new Arco("Arco olímpico", 75, 125.5f));

        System.out.println("* Número de armas creadas:"+Arma.getContador());

        System.out.println("\n* Listado de armas:");
        System.out.println(gestor);

        gestor.removeArma();

        System.out.println("\n* Listado después de borrar todas las armas:");
        System.out.println(gestor);

```

Si has hecho todo en base a las especificaciones, los errores de código habrán desaparecido y al ejecutar el ejercicio, se mostrará lo siguiente por consola:

![image](https://github.com/user-attachments/assets/79374539-64dc-40e2-8327-c83b901a721b)

# 2. Anagrama

Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra. 

Ejemplos de anagramas son la palabra amor, ramo o mora.

Implementa un método llamado **esAnagrama**. Dicho método recibe dos palabras y devuelve si son anagramas la una de la otra.

Ejemplo de salida por consola:

```
La palabra <Amor> y la palabra <ROMA> son anagramas
La palabra <Amor> y la palabra <rima> no anagramas
```
