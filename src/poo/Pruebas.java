
package poo;


public class Pruebas {
    public static void main(String[] args) {
        
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");
        trabajador1.setSeccion("RRHH");
        System.out.println(trabajador1.getDatos());
        System.out.println(trabajador2.getDatos());
        System.out.println(Empleados.getIdSiguiente());
        
    }
            
}

class Empleados {
    
    final private String nombre;
    private String seccion;
    private int id;
    private static int idSiguiente = 1;
    
    public Empleados(String nombre){
        this.nombre = nombre;
        this.seccion = "Administración";
        this.id = idSiguiente;
        idSiguiente++;
    }
    
    public void setSeccion(String seccion){
        this.seccion = seccion;
    }
    
    public String getDatos(){
        return "El nombre es " + nombre + " la sección es " + seccion + " y el Id " + id;
    }
    
    public static String getIdSiguiente(){
        return "El Id Siguiente Es " + idSiguiente;
    }
    
}
