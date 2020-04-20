package com.RHFA_00118519.x;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner toma = new Scanner(System.in);
        Scanner lect1 = new Scanner(System.in);
        Scanner lect2 = new Scanner(System.in);
        Scanner lect3 = new Scanner(System.in);
        Scanner lect4 = new Scanner(System.in);
        Scanner lect5 = new Scanner(System.in);
        Scanner lect6 = new Scanner(System.in);
        Scanner leave1 = new Scanner(System.in);
        String leaveTrabajo;
        String user;
        String type;
        int law;
        int opc;
        byte opc2;
        String dui;
        int ext;
        double pagoPrimerizo;
        Empresa port;


        do{
            System.out.println("Plus Ultra.inc");
            System.out.println("\nRegistro de empleados");
            System.out.println("1) Agregar empleado" + "\n2) Despedir empleado" + "\n3) Ver lista de empleados"
                    + "\n4) Calcular sueldo" + "\n5) Mostrar totales" + "\n6) Salir");
            System.out.print("Opcion escogida: ");
            opc = toma.nextInt();

            switch (opc) {

                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    user = lect1.nextLine();
                    System.out.print("¿Que puesto maneja el empleado? \n1)Servicio Profesional\n2)Plaza Fija\nOpcion a escoger: ");
                    opc2 = lect2.nextByte();

                    switch (opc2) {
                        case 1:
                            type = "Servicio Profesional";
                            System.out.print("Numero de DUI: ");
                            dui = lect3.nextLine();
                            System.out.print("Salario primerizo del empleado: ");
                            pagoPrimerizo = lect4.nextDouble();
                            System.out.print("Ingrese los meses de su contrato: ");
                            law = lect5.nextInt();
                            port.addEmpleado(new ServicioProfesional(user, type, pagoPrimerizo, law);)
                            new Documento(user, dui);
                            new Empresa(user);
                            break;
                        case 2:
                            type = "Plaza Fija";
                            System.out.print("Numero de DUI: ");
                            dui = lect3.nextLine();
                            System.out.print("Salario primerizo del empleado: ");
                            pagoPrimerizo = lect4.nextDouble();
                            System.out.print("Ingrese la extension del empleado: ");
                            ext = lect6.nextInt();
                            port.addEmpleado(new PlazaFija(user, type, pagoPrimerizo, ext));
                            new Documento(user, dui);
                            new Empresa(user);

                            break;
                        default:
                            System.out.println("Error");
                            break;

                    }
                    break;

                case 2:
                    System.out.println("Nombre del empleado a despedir: ");
                    leaveTrabajo = leave1.nextLine();
                    port.quitEmpleado(leaveTrabajo);

                case 3: port.toString(); break;

                case 3:
                    System.out.println("Mostrando:");
                    System.out.println(port.toString());

                case 4:

                    port.getPlanilla();




                case 5:

                    //System.out.print();

                case 6:
                    opc = 6;

            }
        }while (opc != 6);
    }
}
