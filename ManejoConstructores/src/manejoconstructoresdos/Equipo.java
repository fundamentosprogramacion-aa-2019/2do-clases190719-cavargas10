package manejoconstructoresdos;

/**
 *
 * @author cavargas10
 */
public class Equipo {

    private String nombre;
    private Ciudad ciudad;

    public Equipo(String n, Ciudad c) {
        establecerNombre(n.toUpperCase());
        establecerCiudad(c);

    }

    public void establecerNombre(String v) {
        nombre = v;
    }

    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    public String toString() {
        String cadena = String.format("Equipo:\n\tNombre:%s\n\tCiudad:%s\n",
                obtenerNombre(), obtenerCiudad().obtenerNombre());

        return cadena;
    }
}
