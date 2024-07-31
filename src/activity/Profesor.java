package activity;

public class Profesor {
    private int id;
    private String nombre;
    private String apellido;
    private String email;

    public Profesor(int id, String nombre, String apellido, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public void asignarNota(Estudiante estudiante, Asignatura asignatura, int nota) {}
}
