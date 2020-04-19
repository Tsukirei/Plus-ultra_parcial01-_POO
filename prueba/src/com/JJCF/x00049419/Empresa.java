package com.JJCF.x00049419;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla;

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return " planilla=" + planilla +
                '}';
    }



    public void addEmpleado(Empleado trabajador){

    }
    public void quitEmpleado(String name){

    }
}