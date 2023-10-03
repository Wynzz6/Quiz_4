package estudiante;


import java.util.Date;
import java.time.LocalDate;


public class Estudiante {
    private String nombre;
    private Date fechaNacimiento;
    private double notadeMateria1;
    private double notadeMateria2;
    private double notadeMateria3;


    public Estudiante(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.notadeMateria1 = 0.0;
        this.notadeMateria2 = 0.0;
        this.notadeMateria3 = 0.0;

    }


    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getNotadeMateria1() {
        return notadeMateria1;
    }

    public double getNotadeMateria2() {
        return notadeMateria2;
    }

    public double getNotadeMateria3() {
        return notadeMateria3;
    }

    public void setNotadeMateria1(double notadeMateria1) {
        this.notadeMateria1 = notadeMateria1;
    }

    public void setNotadeMateria2(double notadeMateria2) {
        this.notadeMateria2 = notadeMateria2;
    }

    public void setNotadeMateria3(double notadeMateria3) {
        this.notadeMateria3 = notadeMateria3;
    }
}