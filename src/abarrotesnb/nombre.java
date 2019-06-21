package abarrotesnb;

public class nombre {

    String nombre[] = {"cocoa", "leche", "maiz", "sal", "azucar", "panela", "cafe", "te", "cerveza", "cheetos"};

    public nombre() {
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public nombre(String[] nombre) {
        this.nombre = nombre;
    }

    public void imprimirNombre() {
        for (String n : nombre) {
            System.out.print(n+": ");
        }
        System.out.println("\n__________________________________________________________________________________");
        System.out.println("");
    }
}
