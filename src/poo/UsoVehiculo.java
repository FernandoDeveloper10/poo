package poo;

public class UsoVehiculo {

    public static void main(String[] args) {
        
        Coche miCoche1 = new Coche();
        miCoche1.setColor("Rojo");
        
        Furgoneta miFurgoneta1 = new Furgoneta(7,580);
        
        miFurgoneta1.setColor("azul");
        miFurgoneta1.setAsientos("si");
        miFurgoneta1.setClimatizador("si");
        
        System.out.println(miCoche1.getDatosGenerales());
        System.out.println(miFurgoneta1.getDatosGenerales());
        System.out.println(miFurgoneta1.getDatosFurgoneta());
    }
}
