package activity;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private int id;
    private int numero;
    private Profesor profesor;
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Grupo(int id, int numero, Profesor profesor) {
        this.id = id;
        this.numero = numero;
        this.profesor = profesor;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }
}
