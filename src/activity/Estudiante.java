package activity;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private List<Matricula> matriculas = new ArrayList<>();

    public Estudiante(int id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public void matricular(Grupo grupo) {
        Matricula matricula = new Matricula(this, grupo, new Date(), false);
        matriculas.add(matricula);
        grupo.agregarEstudiante(this);
    }

    public void pagar(Matricula matricula) {
        matricula.registrarPago();
    }
}
