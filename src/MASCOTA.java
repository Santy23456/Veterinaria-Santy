public class MASCOTA {
    private String Nombre;
    private String Especie;
    private int Edad;
    private Boolean Vacunado;

    public MASCOTA () {
    }

    public MASCOTA(String nombre, String especie, int edad ) {
        this.Nombre = nombre;
        this.Especie = especie;
        this.Edad = edad;
        this.Vacunado = false;}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public Boolean getVacunado() {
        return Vacunado;
    }

    public void setVacunado(Boolean vacunado) {
        Vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "MASCOTA{" +
                "Nombre='" + Nombre + '\'' +
                ", Especie='" + Especie + '\'' +
                ", Edad=" + Edad +
                ", Vacunado=" + Vacunado +
                '}';
    }
    public  void Alimentar( Double Nombre){
        return (this.Nombre;
    }
    public  boolean Vacunar() {
        Vacunado = true;
        return true;
    }
}
