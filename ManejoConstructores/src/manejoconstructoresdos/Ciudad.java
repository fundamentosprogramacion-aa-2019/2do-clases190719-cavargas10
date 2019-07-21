package manejoconstructoresdos;

/**
 *
 * @author carva
 */
public class Ciudad {

    private String nombre;
    private String provincia;

    public Ciudad(String n, String p) {
        establecerNombre(n);
        establecerProvincia(p);

    }

    public void establecerNombre(String m) {
        nombre = m;
    }

    public void establecerProvincia(String m) {
        provincia = m;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }

    public String toString() {
        String cadena = String.format("Ciudad:\n\tNombre:%s\n\tProvincia:%s\n",
                 obtenerNombre(), obtenerProvincia());
        return cadena;
    }
}
