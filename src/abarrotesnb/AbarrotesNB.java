package abarrotesnb;

import java.text.ParseException;
//import java.util.ArrayList;

public class AbarrotesNB {

    public static void main(String[] args) throws ParseException {

//        ProdAba pr = new ProdAba();
        codigo cod = new codigo();
        fecha fe = new fecha();
        hora ho = new hora();

//        fechaHora fh = new fechaHora();
        int a = cod.codigo.length;
        System.out.println("tamaño: " + a);
        System.out.println("Indice: " + cod.codigo[1]);
        System.out.println("Fechas completas");

        fe.imprimirFecha();
        System.out.println("-------");
        System.out.println(fe.arrayFecha[2]);
        System.out.println("-------");
        ho.imprimirHora();
        

    }

}
