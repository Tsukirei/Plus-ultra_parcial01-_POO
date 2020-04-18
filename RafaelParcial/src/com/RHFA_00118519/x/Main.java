package com.RHFA_00118519.x;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner toma = new Scanner(System.in);
        Scanner lect1 = new Scanner(System.in);
        Scanner lect2 = new Scanner(System.in);
        Scanner lect3 = new Scanner(System.in);
        Scanner lect4 = new Scanner(System.in);
        Scanner leave1 = new Scanner(System.in);
        String leaveTrabajo;
        String user;
        String type;
        int opc;
        byte opc2;
        int dui;
        double pagoPrimerizo;


        System.out.println("Plus Ultra.inc");
        System.out.println("\nRegistro de empleados");
        System.out.println("1) Agregar empleado" + "\n2) Despedir empleado" + "\n3) Ver lista de empleados"
        + "\n4) Calcular sueldo" + "\n5) Mostrar totales" + "Opcion escogida: ");
        opc = toma.nextInt();

        switch(opc) {

            case 1:
                System.out.println("Ingrese el nombre del empleado: ");
                user = lect1.nextLine();
                System.out.println("¿Que puesto maneja el empleado? \n1)Servicio Profesional\n2)Plaza Fija\nOpcion a escoger: ");
                opc2 = lect2.nextByte();

                switch (opc2) {
                    case 1:
                        type = "Servicio Profesional";
                        break;
                    case 2:
                        type = "Plaza Fija";
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }

                System.out.println("Numero de DUI: ");
                dui = lect3.nextInt();
                System.out.println("Salario primerizo del empleado: ");
                pagoPrimerizo = lect4.nextDouble(); break;


            case 2:
                System.out.println("Nombre del empleado a despedir: ");
                leaveTrabajo = leave1.nextLine();

                Empresa PlusUltra = new Empresa(leaveTrabajo); break;



        }


    }
}
