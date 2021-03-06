package aplicacion;

import java.util.Scanner;

public class Aplicacion {
    public static void main( String[] args) {
        int opcion;

        do {
            opcion = opcionMenuPrincipal();
            switch (opcion) {
                case 1:
                    menuCliente();
                    break;
                case 2:
                    menuLlamadas();
                    break;
                case 3:
                    menuFacturas();
                    break;
                case 0:
                    break;
            }
        }while(opcion!=0);
    }

    private static int opcionMenuPrincipal() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            mostrarOpcionesMenuPrincipal();
            opcion = sc.nextInt();
            if(opcion<0 || opcion>3)
                System.out.println("Opción incorrecta. Por favor, vuelva a escoger opción.");
        } while(opcion<0 || opcion>3);
        return opcion;
    }

    private static void mostrarOpcionesMenuPrincipal() {
        System.out.println("0. Salir.");
        System.out.println("1. Clientes.");
        System.out.println("2. Llamadas.");
        System.out.println("3. Facturas.");
        System.out.println("Seleccione una opción.");
    }

    private static void menuFacturas() {
    }

    private static void menuLlamadas() {
    }

    private static void menuCliente() {
    }
}
