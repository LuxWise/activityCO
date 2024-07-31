package activity;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private int id;
    private String nombre;
    private Facultad facultad;
    private List<Asignatura> asignaturas = new ArrayList<>();

    public Carrera(int id, String nombre, Facultad facultad) {
        this.id = id;
        this.nombre = nombre;
        this.facultad = facultad;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }
}
