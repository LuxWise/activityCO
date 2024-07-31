package activity;

import java.util.Date;

public class Matricula {
    private int id;
    private Date fecha;
    private Estudiante estudiante;
    private Grupo grupo;
    private boolean estadoPago;

    public Matricula(int id, Date fecha, Estudiante estudiante, Grupo grupo, boolean estadoPago) {
        this.id = id;
        this.fecha = fecha;
        this.estudiante = estudiante;
        this.grupo = grupo;
        this.estadoPago = estadoPago;
    }

    public void registrarPago() {
        this.estadoPago = true;
    }

}
