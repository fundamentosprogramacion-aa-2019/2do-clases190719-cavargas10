package manejoconstructores;

/**
 *
 * @author cavargas10
 */
public class Entrenador {

    private String nombre;
    private int edad;
    private String deporte;

    public Entrenador() {
        setNombre("Luis");
        setEdad(20);
        setDeporte("Futbol");
    }

    public Entrenador(String n, int e, String d) {
        setNombre(n);
        setEdad(e);
        setDeporte(d);
    }

    public void setNombre(String e) {
        nombre = e;
    }

    public void setEdad(int e) {
        edad = e;

    }

    public void setDeporte(String d) {
        deporte = d;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDeporte() {
        return deporte;
    }

    public String toString() {

        String cadena = String.format("Entrenador %s - Edad %d - Deporte %s\n",
                getNombre(), getEdad(), getDeporte());
        return cadena;
    }
}
