public class Main {
    public static void main(String[] args) {
        Persona perona1 = new Persona();
        perona1.setEdad(18);
        System.out.println(perona1.getEdad());
        perona1.setNombre("Diego");
        System.out.println(perona1.getNombre());
        perona1.setTelefono(953120536);
        System.out.println(perona1.getTelefono());
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }
}
