package manejoconstructoresdos;

/**
 *
 * @author cavargas10
 */
public class Principal {

    public static void main(String[] args) {

        Ciudad c1 = new Ciudad("Cuenca", "Azuay");
        Ciudad c2 = new Ciudad("Quito", "Pichincha");
        Ciudad c3 = new Ciudad("Guayaquil", "Guayas");

        Equipo eq1 = new Equipo("Deportivo Cuenca", c1);
        Equipo eq2 = new Equipo("Aucas", c2);
        Equipo eq3 = new Equipo("Barcelona", c3);
        Equipo eq4 = new Equipo("Guayaquil City", c3);

        Entrenador entrenador1 = new Entrenador("Luis Soler", 59, "Futbol", 9500, eq1);
        Entrenador entrenador2 = new Entrenador("Jose Shurer", 60, "Futbol", 8500, eq2);
        Entrenador entrenador3 = new Entrenador("Leonardo Ramos", 55, "Futbol", 10500, eq3);
        Entrenador entrenador4 = new Entrenador("Paul Gavilanes", 45, "Futbol", 5500, eq4);

        Entrenador[] entrenadores = new Entrenador[4];

        entrenadores[0] = entrenador1;
        entrenadores[1] = entrenador2;
        entrenadores[2] = entrenador3;
        entrenadores[3] = entrenador4;

        OperacionEntrenador operacion = new OperacionEntrenador(entrenadores);
        operacion.establecerPromedioEdades();
        operacion.establecerPromedioSalarios();

        System.out.printf("%s\n", operacion);

        //System.out.printf("%s\n",entrenadores[i]);
    }
}
