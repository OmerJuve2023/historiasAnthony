package models;

public class Matricula {
    private int codigo;
    private int codigoEstudiante;
    private String carrera;
    private String ciclo;
    private String semestreAcademico;

    public Matricula(int codigo, int codigoEstudiante, String carrera, String ciclo, String semestreAcademico) {
        this.codigo = codigo;
        this.codigoEstudiante = codigoEstudiante;
        this.carrera = carrera;
        this.ciclo = ciclo;
        this.semestreAcademico = semestreAcademico;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getCiclo() {
        return ciclo;
    }

    public String getSemestreAcademico() {
        return semestreAcademico;
    }
}
