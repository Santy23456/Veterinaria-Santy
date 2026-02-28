import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);

                System.out.println("NOMBRA A TU MASCOTA: ");
                String nombre = teclado.next();

                System.out.println("INGRESE LA ESPECIE DE SU MASCOTA: ");
                String especie = teclado.next();

                System.out.println("INGRESE LA EDAD DE SU MASCOTA: ");
                int edad = teclado.nextInt();

                System.out.println("¿CUAL ES EL PESO DE SU MASCOTA? ");
                double peso = teclado.nextDouble();

                Mascota m1 = new Mascota(nombre, especie, edad, peso);

                int opcion;

                do {
                        System.out.println("- MENÚ -");
                        System.out.println("1. Mostrar información");
                        System.out.println("2. Alimentar");
                        System.out.println("3. Vacunar");
                        System.out.println("4. Cumplir años");
                        System.out.println("5. Salir");
                        System.out.print("Seleccione una opción: ");

                        opcion = teclado.nextInt();

                        switch (opcion) {

                                case 1 -> m1.mostrarInformacion();

                                case 2 -> {
                                        System.out.print("Ingrese cantidad de alimento: ");
                                        double cantidad = teclado.nextDouble();
                                        m1.alimentar(cantidad);
                                }

                                case 3 -> m1.vacunar();

                                case 4 -> m1.cumplirAnios();

                                case 5 -> System.out.println("Saliendo del sistema...");

                                default -> System.out.println("Opción no valida.");
                        }

                } while (opcion != 5);

                System.out.println("ESTADO FINAL DE LA MASCOTA:");
                m1.mostrarInformacion();
        }
}