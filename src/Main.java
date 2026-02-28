import java.util.*;

public class Main {

        public static void main(String[] args) {

                Scanner teclado = new Scanner(System.in);
                List<Mascota> lstMascotas = new ArrayList<>();

                int op;

                do {
                        ;               System.out.println("""  
                1. CREAR OBJETO");
                2. MOSTRAR TODO");
                3. BUSCAR POR NOMBRE
                """);
                        op= teclado.nextInt();

                        switch (op) {
                                case 1 -> {
                                        System.out.println("NOMBRA A TU MASCOTA: ");
                                        String nombre = teclado.next();
                                        System.out.println("INGRESE LA ESPECIE DE SU MASCOTA: ");
                                        String especie = teclado.next();
                                        System.out.println("INGRESE LA EDAD DE SU MASCOTA: ");
                                        int edad = teclado.nextInt();
                                        System.out.println("¿CUAL ES EL PESO DE SU MASCOTA? ");
                                        double peso = teclado.nextDouble();
                                        Mascota m1 = new Mascota(nombre, especie, edad, peso);
                                        lstMascotas.add(m1);
                                }
                                case 2 -> for (Mascota m : Mascota )
                                        System.out.println(m);

                                case 3:
                                        String NombreMascota;
                                        System.out.println("INGRESE EL NOMBRE DE LA MASCOTA");
                                        NombreMascota = teclado.next();

                                        Mascota m1 = null;

                                        while (op != 4);

                                        for (Mascota m : lstMascotas) {
                                                if (m.getnombre().equalsIgnoreCase(NombreMascota)){
                                                        m1 = m;
                                                }
                                        }
                                        int opcion;
                                        do {
                                                System.out.println("----- MENÚ -----")
                                                System.out.println("1. Alimentar");
                                                System.out.println("3. Vacunar");
                                                System.out.println("4. Cumplir años");
                                                System.out.print("Seleccione una opción: ");

                                                opcion = teclado.nextInt();

                                                switch (opcion) {

                                                        case 1 ->  System.out.print("Ingrese cantidad de alimento: ");
                                                        double cantidad = teclado.nextDouble();
                                                        m1.alimentar(cantidad);

                                                        case 2 -> m1.vacunar();

                                                        case 3 -> m1.cumplirAños();

                                                        default -> System.out.println("Opción no valida.");
                                                }

                                        } while (opcion != 4);
                        }
                }
        }
}