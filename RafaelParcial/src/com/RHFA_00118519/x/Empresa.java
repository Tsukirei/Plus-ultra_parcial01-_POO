package com.RHFA_00118519.x;

import java.util.ArrayList;

public  class Empresa {
    private String nombre;
    private ArrayList<Empleado> planilla;

    public Empresa(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(Empleado trabajador){

        planilla.add(trabajador);
    }
    public void quitEmpleado(String despido) {
        for(Empleado prueba: planilla) {
            if (prueba.nombre.equalsIgnoreCase(despido)) {
                planilla.removeIf(m->m.getNombre().equalsIgnoreCase(despido));
                System.out.println("Se ha hecho el despido exitosamente");
            }
            else{
                System.out.println("El empleado no se encuentra");
        }

        }
    }

    @Override
    public String toString() {
        for(int i = 0; i < planilla; i++){

            return String.valueOf(i);
        }

        return String.valueOf(i)
    }
