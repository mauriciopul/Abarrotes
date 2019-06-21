package abarrotesnb;

import java.text.ParseException;
//import java.util.ArrayList;

public class AbarrotesNB {

    public static void main(String[] args) throws ParseException {

        codigo cod = new codigo();
        nombre nom = new nombre();
        valor val = new valor();
        fecha fe = new fecha();
        hora ho = new hora();

        System.out.println("Codigos: ");
        cod.imprimirCodigo();
        System.out.println("Nombres: ");
        nom.imprimirNombre();
        System.out.println("Valor: ");
        val.imprimirValor();
        System.out.println("Fechas: ");
        fe.imprimirFecha();        
        System.out.println("Horas: ");
        ho.imprimirHora();
        
        

    }

}
