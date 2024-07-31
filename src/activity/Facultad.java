package activity;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    private int id;
    private String nombre;
    private List<Carrera> carreras = new ArrayList<>();

    public Facultad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }
}
