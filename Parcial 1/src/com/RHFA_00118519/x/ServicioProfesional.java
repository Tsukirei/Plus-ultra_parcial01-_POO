package com.RHFA_00118519.x;

public class ServicioProfesional extends Empleado{

    private int mesesContrato;

    public ServicioProfesional(String nombre, String puesto, double salario, int mesesContrato){
        super(nombre, puesto, salario);
        this.mesesContrato = mesesContrato;
    }


}

