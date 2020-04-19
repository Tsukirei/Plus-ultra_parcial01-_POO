package com.RHFA_00118519.x;

public class CalculadorImpuestos {
    private static double totalRenta;
    private static double totalISSS;
    private static double totalAFP;
    private static double pagoReal;

    private void CalcularImpuestos() {

    }

    public static void CalcularPago(Empleado mop) {
        double AFP;
        double ISSS;
        double restan;
        double rentame;

        if (mop instanceof PlazaFija) {

            AFP = ((PlazaFija) mop).salario * 0.0625;

            ISSS = ((PlazaFija) mop).salario * 0.03;

            restan = ((PlazaFija) mop).salario - AFP - ISSS;
            if (((PlazaFija) mop).salario >= 0.01 && ((PlazaFija) mop).salario <= 472) {
                rentame = 0;
                pagoReal = restan - rentame;
                totalAFP = AFP;
                totalRenta = rentame;
                totalISSS = ISSS;
            } else if (((PlazaFija) mop).salario >= 472.01 && ((PlazaFija) mop).salario <= 895.24) {
                rentame = 0.1 * (restan - 472) + 17.67;
                pagoReal = restan - rentame;
                totalAFP = AFP;
                totalRenta = rentame;
                totalISSS = ISSS;
            } else if (((PlazaFija) mop).salario >= 895.25 && ((PlazaFija) mop).salario <= 2038.10) {
                rentame = 0.2 * (restan - 895.24) + 60;
                pagoReal = restan - rentame;
                totalAFP = AFP;
                totalRenta = rentame;
                totalISSS = ISSS;
            } else if (((PlazaFija) mop).salario >= 2038.11) {
                rentame = 0.1 * (restan - 2038.10) + 288.57;
                pagoReal = restan - rentame;
                totalAFP = AFP;
                totalRenta = rentame;
                totalISSS = ISSS;

            } else if (mop instanceof ServicioProfesional) {
                double renta2;
                renta2 = ((ServicioProfesional) mop).salario * 0.1;
                pagoReal = ((ServicioProfesional) mop).salario - renta2;
            }
        }



   /* public String mostrarTotales() {
        return "Total ISSS: "+ totalISSS
                +"Total Renta: "+ totalRenta
                +"Total AFP: "+ totalAFP;
    }*/

    }
}

