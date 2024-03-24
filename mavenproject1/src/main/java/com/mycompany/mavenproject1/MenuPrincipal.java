package com.mycompany.pack;

import java.util.Scanner;


public class MenuPrincipal {

    public static boolean torre = true;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Vehiculo vehiculo = null;

            while (true) {
                System.out.println("\nMenú Principal:");
                System.out.println("1: Fase 1 Objetos y recursividad");
                System.out.println("2: Fase 2");
                System.out.println("3: Fase 3");
                System.out.println("4: Salir del programa\n");
                System.out.print("Seleccione una opción: ");
                String opcionPrincipal = scanner.nextLine();
                switch (opcionPrincipal) {
                    case "1":

                        while (true) {
                            System.out.println("\nSub Menu - Fase 1:");
                            System.out.println("a: Ingresar datos de vehículos");
                            System.out.println("b: Mostrar datos del vehículo");
                            System.out.println("c: Crear una torre de Hanoi");
                            System.out.println("d: Regresar al menú principal\n");
                            System.out.print("Seleccione una opción:\n ");
                            String opcionSubMenu = scanner.nextLine();

                            switch (opcionSubMenu) {
                                case "a":
                                    vehiculo = ingresarDatosVehiculo(scanner);
                                    System.out.println("Datos de vehículo ingresados correctamente.");
                                    break;
                                case "b":
                                    mostrarDatosVehiculo(vehiculo);
                                    break;
                                case "c":
                                    torreHanoi(scanner);
                                    break;
                                case "d":
                                    RegresarAMenuPrinc();
                                    break;
                                default:
                                    System.out.println("\nOpción no válida. Intente de nuevo.");
                                    break;
                            }
                        }

                    case "2":
                        System.out.println("\nFase 2 aún sin desarrollar.");
                        break;
                    case "3":
                        System.out.println("\nFase 3 aún sin desarrollar.");
                        break;
                    case "4":
                        System.out.println("\n ¡Hasta luego!");
                        return;
                    default:
                        System.out.println("\nOpción no válida. Intente de nuevo.\n");
                        break;
                }
            }
        }
    }

    private static Vehiculo ingresarDatosVehiculo(Scanner scanner) {
        System.out.print("Ingrese el tipo de vehículo (carro/balsa/avión): ");
        String tipoVehiculo = scanner.nextLine().toLowerCase();

        switch (tipoVehiculo) {
            case "carro":
                Carro.carro();
            case "balsa":
                Balsa.balsa();
            case "avión":
                Avion.avion();
            default:
                System.out.println("Tipo de vehículo no válido.");
                return null;
        }
    }

    private static void mostrarDatosVehiculo(Vehiculo vehiculo) {
        if (vehiculo != null) {
        } else {
            System.out.println("No hay datos de vehículo para mostrar.");
        }
    }

    private static void torreHanoi(Scanner scanner) {
        int n;
        do {
            System.out.print("\nIngrese el número de discos: ");
            n = scanner.nextInt();
            if (n < 3) {
                System.out.println("\nDebe ingresar al menos 3 discos para realizar la torre.");
                torre = true;
            } else {
                torre = false;

            }
        } while (torre);

        Hanoi(n, 1, 2, 3);
    }

    public static void Hanoi(int n, int origen, int auxiliar, int destino) {
        if (n == 1) {
            System.out.println(+origen + "-->" + destino);
        } else {
            Hanoi(n - 1, origen, destino, auxiliar);
            System.out.println(+origen + "-->" + destino);
            Hanoi(n - 1, auxiliar, origen, destino);

        }
    }
    
   private static void RegresarAMenuPrinc() {
    System.out.println("Regresando al menú principal...");
            try (Scanner scanner = new Scanner(System.in)) {
            Vehiculo vehiculo = null;

            while (true) {
                System.out.println("\nMenú Principal:");
                System.out.println("1: Fase 1 Objetos y recursividad");
                System.out.println("2: Fase 2");
                System.out.println("3: Fase 3");
                System.out.println("4: Salir del programa\n");
                System.out.print("Seleccione una opción: ");
                String opcionPrincipal = scanner.nextLine();
                switch (opcionPrincipal) {
                    case "1":

                        while (true) {
                            System.out.println("\nSub Menu - Fase 1:");
                            System.out.println("a: Ingresar datos de vehículos");
                            System.out.println("b: Mostrar datos del vehículo");
                            System.out.println("c: Crear una torre de Hanoi");
                            System.out.println("d: Regresar al menú principal\n");
                            System.out.print("Seleccione una opción:\n ");
                            String opcionSubMenu = scanner.nextLine();

                            switch (opcionSubMenu) {
                                case "a":
                                    vehiculo = ingresarDatosVehiculo(scanner);
                                    System.out.println("Datos de vehículo ingresados correctamente.");
                                    break;
                                case "b":
                                    mostrarDatosVehiculo(vehiculo);
                                    break;
                                case "c":
                                    torreHanoi(scanner);
                                    break;
                                case "d":
                                    RegresarAMenuPrinc();
                                    break;
                                default:
                                    System.out.println("\nOpción no válida. Intente de nuevo.");
                                    break;
                            }
                        }

                    case "2":
                        System.out.println("\nFase 2 aún sin desarrollar.");
                        break;
                    case "3":
                        System.out.println("\nFase 3 aún sin desarrollar.");
                        break;
                    case "4":
                        System.out.println("\n ¡Hasta luego!");
                        return;
                    default:
                        System.out.println("\nOpción no válida. Intente de nuevo.\n");
                        break;
                }
            }
        }
    }
}
