package com.RHFA_00118519.x;

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

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }
    public void addEmpleado(Empleado trabajador){

    }
    public void quitEmpleado(String name){

    }
}
