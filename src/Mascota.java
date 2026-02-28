public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean vacunado;

    // CONTRUCTOR
    public Mascota(String nombre, String especie, int edad, double peso) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = false;
    }

    //VACUNAR
    public void vacunar() {
        vacunado = true;
        System.out.println("La mascota ha sido vacunada.");
    }

    // METODO ALIMENTAR
    public void alimentar(double cantidad) {
        if (cantidad > 0) {
            peso += cantidad;
            System.out.println("La mascota fue alimentada.");
        } else {
            System.out.println("No se permiten cantidades negativas.");
        }
    }

    // CUMPLIR AÑOS
    public void cumplirAnios() {
        edad++;
        System.out.println("La mascota ha cumplido un año.");
    }

    // MOSTRAR
    public void mostrarInformacion() {
        System.out.println("\n----- INFORMACIÓN DE LA MASCOTA -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Vacunado: " + vacunado);
    }
}