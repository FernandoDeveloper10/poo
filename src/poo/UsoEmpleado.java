package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

    public static void main(String[] args) {

        Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006,9,25);
        jefe_RRHH.setIncentivo(2570);
        Empleado[] misEmpleados = new Empleado[6];
        misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);
        misEmpleados[1] = new Empleado("Ana López", 95000, 1995, 06, 02);
        misEmpleados[2] = new Empleado("Maria Nogueira", 105000, 2002, 03, 15);
        misEmpleados[3] = new Empleado("Antonio Fernández");
        misEmpleados[4] = jefe_RRHH; // Principio de Sustitución Herencia
        misEmpleados[5] = new Jefatura("María", 70000, 1990,05, 26);
        
        Jefatura jefa_RRHH = (Jefatura) misEmpleados[5]; //Refundición o casting de Objetos
        jefa_RRHH.setIncentivo(20000);
        
        for (Empleado empleado : misEmpleados) {

            empleado.subeSueldo(5);
        }

        for (Empleado empleado : misEmpleados) {
            System.out.println("Nombre " + empleado.getNombre()
                    + " Sueldo " + empleado.getSueldo()
                    + " Fecha de Alta " + empleado.getFechaContrato());
        }
    }
}

/*final */ class Empleado {

    public Empleado(String nombre, double sueldo, int agno, int mes, int dia) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes, dia);
        altaContrato = calendario.getTime();
        this.id = idSiguiente;
        idSiguiente++;

    }

    public Empleado(String nombre) {

        this(nombre, 30000, 2000, 01, 01);
    }

    public String getNombre() {

        return nombre;
    }

    /*final */public double getSueldo() {
        return sueldo;
    }

    public Date getFechaContrato() {
        return altaContrato;
    }

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private int id;
    private static int idSiguiente = 1;

}

class Jefatura extends Empleado{
    
    private double incentivo;
    
    public Jefatura(String nombre,double sueldo,int agno,int mes,int dia){
        super(nombre,sueldo,agno,mes,dia);
    }
    
    public void setIncentivo(double incentivo){
        this.incentivo = incentivo;
        
    }
    
    @Override
    public double getSueldo(){
        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
        
    }
    
    
}

/**
 @Notation
 
 * Una clase final  es una clase de la cual no se podra heredar porque no se bloquea la herencia
 * 
 * Es como un padre que hereda a un hijo el cual no tendra decendencia por lo tanto no podra continuar con la herencia
 * Para ello se utiliza la palabra reservada final.
 * 
 * Los metodos final no podran ser sobreescritos ni modificados.
**/

