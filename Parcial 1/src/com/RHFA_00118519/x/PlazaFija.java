package com.RHFA_00118519.x;

public class PlazaFija extends Empleado{
    private int extension;

    public PlazaFija(String nombre, String puesto, double salario, int extension){
        super(nombre, puesto, salario);
        this.extension = extension;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

}
