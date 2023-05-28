package models;

public class Alumno {
    private int codigo;
    private String nombre;

    public Alumno(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreEstudiante() {
        return nombre;
    }
}
