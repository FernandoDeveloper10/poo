package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

    public static void main(String[] args) {

        Persona [] personas = new Persona[2];
        
        personas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
        personas[1] = new Alumno("Ana López", "Bilógicas");
        
        for (Persona p : personas) {
            
            System.out.println(p.getNombre() + ", " + p.getDescripcion());
            
        }
                
    }
}

abstract class Persona {

    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getDescripcion();

}

class Empleado2 extends Persona {

    public Empleado2(String nombre, double sueldo, int agno, int mes, int dia) {

        super(nombre);
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
        altaContrato = calendario.getTime();
        this.id = idSiguiente;
        idSiguiente++;

    }

    public String getDescripcion() {
        return "Este empleado tiene un Id= " + id
                + " con un sueldo igual= " + sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechaContrato() {
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idSiguiente = 1;

}

class Alumno extends Persona {
    
    private String carrera;
    
    public Alumno(String nombre,String carrera){
        super(nombre);
        this.carrera = carrera;
    }
    
    
    public String getDescripcion(){
        return "Este alumno esta estudiando la carrera de " + carrera;
    }
}
