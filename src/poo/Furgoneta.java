package poo;

public class Furgoneta extends Coche { //Herencia reutilización de código

    private int capacidad_carga;
    private int plazas_extra;

    public Furgoneta(int plazas_extra, int capacidad_carga) {
        super(); // Llama al constructor de la clase Padre(Super Clase);
        this.plazas_extra = plazas_extra;
        this.capacidad_carga = capacidad_carga;

    }

    public String getDatosFurgoneta() {
        return "La capacidad de carga es "
                + capacidad_carga
                + " y las plazas son "
                + plazas_extra;
    }
}
