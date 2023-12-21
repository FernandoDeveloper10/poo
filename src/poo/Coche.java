package poo;

public class Coche {

    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
    }

    public String getDatosGenerales() {

        return "La plataforma tiene: " + ruedas + " ruedas, mide " + largo / 1000 + " metros con un ancho de "
                + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg.";
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return "El color del coche es: " + color;
    }

    public void setAsientos(String asientos_cuero) {

        if (asientos_cuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public String getAsientos() {

        if (this.asientos_cuero) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientos de serie";
        }
    }

    public void setClimatizador(String climatizador) {

        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    public String getClimatizador() {

        if (this.climatizador) {
            return "El coche tiene climatizador";
        } else {
            return "El coche tiene aire acondicionado";
        }
    }

    public String getPesoCoche() {

        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;

        if (this.asientos_cuero) {
            peso_total += 50;
        }

        if (this.climatizador) {
            peso_total += 20;
        }

        return "El peso del coche es " + peso_total;
    }

    public int getPrecioCoche() {
        int precio_final = 10000;

        if (this.asientos_cuero) {
            precio_final += 2000;

        }

        if (this.climatizador) {
            precio_final += 1500;
        }

        return precio_final;
    }
}
