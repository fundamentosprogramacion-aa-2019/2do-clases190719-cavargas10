package manejoconstructoresdos;

/**
 *
 * @author cavargas10
 */
public class OperacionEntrenador {

    private Entrenador[] losEntrenadores;
    double promedioEdades;
    double promedioSalarios;

    public OperacionEntrenador(Entrenador[] entrenadores) {
        losEntrenadores = entrenadores;
    }

    public void establecerLosEntrenadores(Entrenador[] ents) {
        losEntrenadores = ents;
    }

    public void establecerPromedioEdades() {
        int suma = 0;
        for (int i = 0; i < losEntrenadores.length; i++) {
            suma = losEntrenadores[i].obtenerEdad() + suma;
        }

        promedioEdades = (double) suma / losEntrenadores.length;
    }

    public void establecerPromedioSalarios() {
        double suma = 0;
        for (int i = 0; i < losEntrenadores.length; i++) {

            suma = losEntrenadores[i].obtenerSalario() + suma;
        }

        promedioSalarios = suma / losEntrenadores.length;
    }

    public Entrenador[] obtenerLosEntrenadores() {
        return losEntrenadores;
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public double obtenerPromedioSalarios() {
        return promedioSalarios;
    }

    public String toString() {
        String cadena = String.format("Promedio Edades: %.2f\nPromedio Salarios:"
                + " %.2f\n", obtenerPromedioEdades(), obtenerPromedioSalarios());

        return cadena;
    }
}
