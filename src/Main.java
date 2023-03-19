public class Main {
    public static void main(String[] args) {
       Persona Usuario = new Persona();
       Usuario.setEdad(25);
       Usuario.setNombre("Boot");
       Usuario.setNumTelPersona(6455_2846);
        System.out.println("Edad: "+ Usuario.getEdad());
        System.out.println("Nombre: "+Usuario.getNombre());
        System.out.println("Contacto: "+Usuario.getNumTelPersona());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int numTelPersona;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;

    }
    public String getNombre(){
        return nombre;
    }
    public void setNumTelPersona(int numTelPersona){
        this.numTelPersona = numTelPersona;
    }

    public int getNumTelPersona() {
        return numTelPersona;
    }
}