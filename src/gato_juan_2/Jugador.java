package gato_juan_2;
public class Jugador {
    private String nombre;
    private String simbolo;

    public Jugador() {
    }

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public Jugador(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return "Jugador:"+ nombre + ", simbolo=" + simbolo;
    }
    
    
}
