package abarrotesnb;

import java.text.ParseException;
//import java.util.ArrayList;

public class AbarrotesNB {
    
    public static void main(String[] args) throws ParseException {

//        ProdAba pr = new ProdAba();
        codigo cod = new codigo();
        fecha fe = new fecha();

//        fechaHora fh = new fechaHora();
        int a = cod.codigo.length;
        System.out.println("tamaño: " + a);
        System.out.println("Indice: " + cod.codigo[1]);
        System.out.println("Fechas completas");
        
        fe.imprimir();
        System.out.println("-------");
        System.out.println(fe.arrayFecha[2]);
//        System.out.println("---------------");
//        System.out.println(fe.fechaCom()[2]);
        

//<editor-fold>
//        for (int i = 0; i < 100; i++) {
//            String s = fe.mes();
//            String d = "03";
//            int ss = Integer.parseInt(s);
//            int dd = Integer.parseInt(d);
//            String SS = Integer.toString(ss);
//            String DD = Integer.toString(dd);
////            System.out.println(s);
//
//            if (d == s) {
//                System.out.println(s + "------Igual-->");
//            } 
//        }
//</editor-fold>
//<editor-fold>
//        fh.imprimir();
//System.out.println(fh.fecha());
//System.out.println(fh.dia());
//        ArrayList<ProdAba> listaProductos = new ArrayList<>();
//
//        listaProductos.
//        for (int i = 0; i < 3; i++) {
//            System.out.println(pr.prod()[i][0]+"\t"+pr.prod()[i][1]+"\t"+pr.prod()[i][2]);
////            System.out.println(pr.prod()[i][1]);
////            System.out.println(pr.prod()[i][2]);
////            System.out.println("tam: "+pr.codigo.length+i);
//        }
//</editor-fold>
    }
    
}
