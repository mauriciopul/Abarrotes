package abarrotesnb;

import java.util.Random;

public class ProdAba {

    int codigo[] = {192, 2, 123, 987, 233, 23, 1450, 1120, 123, 442};
    fechaHora fh = new fechaHora();

    public ProdAba() {

//        int valor[] = {1200, 3920, 22340, 33840, 33820, 112900, 3770, 56300, 39980};
//        String nombre[] = {"cocoa", "leche", "maiz", "sal", "azucar", "panela", "cafe", "te", "cerveza", "cheetos"};
        //String fecha[] = {fh.fecha(), fh.fecha(), fh.fecha(), fh.fecha(),fh.fecha(), fh.fecha(),fh.fecha(),fh.fecha(), fh.fecha(), fh.fecha()};
//        String fecha[];
        for (int i = 0; i < codigo.length; i++) {
            String fecha[] = {fh.fecha()};
        }
//        String hora[] = {"11:00", "12:03", "15:16", "19:29", "22:46", "09:18", "16:24", "14:07", "13:53", "16:44"};
    }

    public String[][] prod() {
        String[][] arrayProd = new String[][]{
            {"0001", "cocacola", "2500"},
            {"0002", "arroz", "1250"}
        };
        return arrayProd;
    }

    public String[] imprimFecha() {
//        String[] arrayNombre = new String[]{"Mao", "jose", fh.fecha(),"lina"};
        String[] arrayFec = new String[this.codigo.length];
        for (int i = 0; i < 10; i++) {
            arrayFec[i] = fh.fecha();
        }

        return arrayFec;
    }

}

//int[1,1] arr =  [0][1200, 3920, 22340, 33840, 33820, 112900, 3770, 56300, 39980];
//        String[][] noseque = new String[3][3];
//        noseque[1][0] = "0001";
//        noseque[1][1] = "coca";
//        noseque[1][2] = "2500";
//        noseque[2][0] = "0002";
//        noseque[2][1] = "arroz";
//        noseque[2][2] = "1250";
