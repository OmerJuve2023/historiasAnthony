package controller;

import models.Alumno;
import models.Matricula;

public class RegistroMatriculas {
    private Alumno[] alumnos;
    private Matricula[] matriculas;
    private int contador;

    public RegistroMatriculas() {
        alumnos = new Alumno[50];
        matriculas = new Matricula[50];
        contador = 0;
    }

    public void registrarMatricula(Alumno alumno, Matricula matricula) {
        if (existeCodigo(matricula.getCodigo())) {
            System.out.println("El código de matrícula ya existe. No se pudo registrar.");
            return;
        }

        alumnos[contador] = alumno;
        matriculas[contador] = matricula;
        contador++;
    }

    public void mostrarMatriculasOrdenadas() {
        ordenarMatriculasPorCodigo();

        for (int i = 0; i < contador; i++) {
            System.out.println("Código: " + matriculas[i].getCodigo());
            System.out.println("Estudiante: " + alumnos[i].getNombreEstudiante());
            System.out.println("Carrera: " + matriculas[i].getCarrera());
            System.out.println("Ciclo: " + matriculas[i].getCiclo());
            System.out.println("Semestre Académico: " + matriculas[i].getSemestreAcademico());
            System.out.println("---------------------------------------");
        }
    }

    private void ordenarMatriculasPorCodigo() {
        int n = contador;
        int intervalo = n / 2;

        while (intervalo > 0) {
            for (int i = intervalo; i < n; i++) {
                Matricula tempMatricula = matriculas[i];
                Alumno tempAlumno = alumnos[i];
                int j = i;

                while (j >= intervalo && matriculas[j - intervalo].getCodigo() > tempMatricula.getCodigo()) {
                    matriculas[j] = matriculas[j - intervalo];
                    alumnos[j] = alumnos[j - intervalo];
                    j -= intervalo;
                }

                matriculas[j] = tempMatricula;
                alumnos[j] = tempAlumno;
            }

            if (intervalo == 2) {
                intervalo = 1;
            } else {
                intervalo /= 2;
            }
        }
    }

    private boolean existeCodigo(int codigo) {
        for (int i = 0; i < contador; i++) {
            if (matriculas[i].getCodigo() == codigo) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        RegistroMatriculas registro = new RegistroMatriculas();

        Alumno alumno1 = new Alumno(1, "Juan Pérez");
        Matricula matricula1 = new Matricula(101, alumno1.getCodigo(), "Informática", "Ciclo 3", "2023-1");

        Alumno alumno2 = new Alumno(4, "María García");
        Matricula matricula2 = new Matricula(104, alumno2.getCodigo(), "Administración", "Ciclo 2", "2023-1");

        Alumno alumno3 = new Alumno(3, "Pedro López");
        Matricula matricula3 = new Matricula(103, alumno3.getCodigo(), "Contabilidad", "Ciclo 4", "2023-1");

        registro.registrarMatricula(alumno1, matricula1);
        registro.registrarMatricula(alumno2, matricula2);
        registro.registrarMatricula(alumno3, matricula3);
        registro.ordenarMatriculasPorCodigo();
        registro.mostrarMatriculasOrdenadas();
    }

}

