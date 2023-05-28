package models;

public class Cliente {
    private final Integer codigo;
    private final String apellidoPaterno;
    private final String apellidoMaterno;
    private final String nombre;
    private final String ciudad;

    public Cliente(Integer codigo, String apellidoPaterno, String apellidoMaterno, String nombres, String ciudad) {
        this.codigo = codigo;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.nombre = nombres;
        this.ciudad = ciudad;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }
}
