package manejoconstructores;

/**
 *
 * @author cavargas10
 */
public class Principal {

    public static void main(String[] args) {

        Entrenador entrenador1 = new Entrenador("Rene", 35, "Futbol");
        Entrenador entrenador2 = new Entrenador();
        Entrenador entrenador3 = new Entrenador();
        /*
        entrenador1.setNombre("Rene");
        entrenador1.setEdad(35);
         */
        System.out.printf("entrenador 1 :"
                + "Nombre %s - Edad %d \n", entrenador1.getNombre(), entrenador1.getEdad());

        System.out.printf("entrenador2 :"
                + "Nombre %s - Edad %d \n", entrenador2.getNombre(), entrenador2.getEdad());

        entrenador1.setNombre("Rolando");

        System.out.printf("entrenador1 :"
                + "Nombre %s - Edad %d \n", entrenador1.getNombre(), entrenador1.getEdad());
    }
}

}
