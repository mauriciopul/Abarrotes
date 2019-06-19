package abarrotesnb;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu {

    String menu;

    public Menu() {
    }

    public int opcionMenu() {
        menu = "COMPRA DE ABARROTES\n\n";
        menu += "1. Mostrar productos\n";
        menu += "2. Comprar\n";
        menu += "3. Buscar\n";
        menu += "4. Ordenar\n";
        menu += "5. Salir\n\n";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }

    public String obtenerNombre() {
        menu = "Ingrese el nombre del producto";
        return JOptionPane.showInputDialog(menu);
    }

    public void mostrarMensaje(String mensaje) {
        JFrame frame = new JFrame("Mensaje");
        JOptionPane.showMessageDialog(frame, mensaje);
    }

}
