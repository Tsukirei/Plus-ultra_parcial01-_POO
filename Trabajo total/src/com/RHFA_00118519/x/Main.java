package com.RHFA_00118519.x;

import java.util.ArrayList;
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
        Scanner Nombre = new Scanner(System.in);
        Scanner Nombre2 = new Scanner(System.in);
        ArrayList<PlazaFija> listageneral = new ArrayList<>();
        ArrayList<ServicioProfesional>  listageneral2 = new ArrayList<>();
        String leaveTrabajo;
        String user;
        String type;
        String Inc = "Plus Ultra.inc";
        int law;
        int opc;
        byte opc2;
        String dui;
        int ext;
        double pagoPrimerizo;
        Empresa port = new Empresa(Inc);
        double salariado;
        String sunombre;
        String f="juguete";
        int opc3;
        ServicioProfesional userq1;
        PlazaFija user2q;
        CalculadorImpuestos mostrar = new CalculadorImpuestos();

        do{
            System.out.println(Inc);
            System.out.println("\nRegistro de empleados");
            System.out.println("1) Agregar empleado" + "\n2) Despedir empleado" + "\n3) Ver lista de empleados"
                    + "\n4) Calcular sueldo" + "\n5) Mostrar totales" + "\n6) Salir");
            System.out.print("Opcion escogida: ");
            opc = toma.nextInt();
            LetterBadException.validar(opc);

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
                            Documento registroDoc = new Documento(user, dui);
                            ServicioProfesional empleadoSP = new ServicioProfesional(user, type, pagoPrimerizo, law);
                            empleadoSP.addDocumento(registroDoc);
                            port.addEmpleado(empleadoSP);
                            break;
                        case 2:
                            type = "Plaza Fija";
                            System.out.print("Numero de DUI: ");
                            dui = lect3.nextLine();
                            System.out.print("Salario primerizo del empleado: ");
                            pagoPrimerizo = lect4.nextDouble();
                            System.out.print("Ingrese la extension del empleado: ");
                            ext = lect6.nextInt();
                            PlazaFija empleadoPF = new PlazaFija(user, type, pagoPrimerizo, ext);
                            Documento registroDoc2 = new Documento(user, dui);
                            port.addEmpleado(empleadoPF);
                            break;
                        default:
                            System.out.println("Error");
                            break;

                    }
                    break;

                case 2:
                    System.out.println("Nombre del empleado a despedir: ");
                    leaveTrabajo = leave1.nextLine();
                    port.quitEmpleado(leaveTrabajo); break;

                case 3:
                    System.out.println("Mostrando:");
                    System.out.println(port.toString()); break;

                case 4:

                    System.out.println("Ingrese 1 si desea buscar al empleado en plaza fija, 2 si es servicio " +
                            "profesional:");
                    opc3=Nombre2.nextInt();
                    NumberBadforException.comprobando(opc3);
                    switch(opc3) {
                        case 1:
                            for(PlazaFija e: listageneral){
                                System.out.println("nombre:");
                                System.out.println(e.getNombre());
                                System.out.println("sueldo:");
                                System.out.println(CalculadorImpuestos.CalcularPago(e));

                            }



                            break;
                        case 2:
                            for(ServicioProfesional e: listageneral2){
                                System.out.println("nombre:");
                                System.out.println(e.getNombre());
                                System.out.println("sueldo:");
                                System.out.println(mostrar.CalcularPago(e));
                                break;

                            }



                            break;
                    }
                    break;

                case 5: break;

                case 6:
                    opc = 6; break;

                default:
                    System.out.println("Error"); break;

            }
        }while (opc != 6);
    }
}
