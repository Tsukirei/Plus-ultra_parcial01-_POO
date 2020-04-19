package com.RHFA_00118519.x;

public class CalculadorImpuestos {
    private static double totalRenta;
    private static double totalISSS;
    private static double totalAFP;



    private void CalcularImpuestos(){
    }
    public double CalcularPago(Empleado){
double Restante;
double AFP;
double ISSS;
double renta;
double restan;
double rentame;



        if(Empleado instanceof PlazaFija){



          AFP=((PlazaFija) Empleado).salario*0.0625;

           ISSS=((PlazaFija) Empleado).salario*0.03;

           restan=((PlazaFija) Empleado).salario-AFP-ISSS;
            if( ((PlazaFija) Empleado).salario>=0.01 && ((PlazaFija) Empleado).salario<=472){
                rentame=0;
            }
            if( ((PlazaFija) Empleado).salario>=472.01 && ((PlazaFija) Empleado).salario<=895.24) {
                rentame=0.1*(restan-472)+17.67;

            }
            if( ((PlazaFija) Empleado).salario>=895.25 && ((PlazaFija) Empleado).salario<=2038.10) {
                rentame=0.2*(restan-895.24)+60;
            }
            if( ((PlazaFija) Empleado).salario>=2038.11) {
                rentame=0.1*(restan-2038.10)+288.57;
            }
            totalAFP=totalAFP+AFP;
            totalRenta=totalRenta+rentame;
            totalISSS=totalISSS+ISSS;

            Restante=restan-rentame;
            return Restante;

        }
        else if(Empleado instanceof ServicioProfesional){
            double renta2;
            renta2=((ServicioProfesional) Empleado).salario*0.1;
            Restante=((ServicioProfesional) Empleado).salario-renta2;
            totalRenta=totalRenta+renta2;
            return Restante;
        }

    }

    @Override
    public String mostrarTotales() {
        return "Total ISSS:"+totalISSS
                +"Total Renta:"+totalRenta
                +"Total AFP:"+totalAFP;
    }
}

