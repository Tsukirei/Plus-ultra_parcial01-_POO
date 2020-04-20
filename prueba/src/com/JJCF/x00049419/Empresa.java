package com.JJCF.x00049419;
import java.util.ArrayList;

public  class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla = new ArrayList<>();

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(Empleado trabajador) {

        planilla.add(trabajador);
    }

    public void quitEmpleado(String despido) {
        for (Empleado prueba : planilla) {
            if (prueba.nombre.equalsIgnoreCase(despido)) {
                planilla.removeIf(m -> m.getNombre().equalsIgnoreCase(despido));
                System.out.println("Se ha hecho el despido exitosamente");
            } else {
                System.out.println("El empleado no se encuentra");
            }

        }
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", planilla=" + planilla +
                '}';
    }
}