package activity;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {
    private int id;
    private String nombre;
    private Carrera carrera;
    private List<Grupo> grupos = new ArrayList<>();

    public Asignatura(int id, String nombre, Carrera carrera) {
        this.id = id;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public void agregarGrupo(Grupo grupo) {
        grupos.add(grupo);
    }
}
