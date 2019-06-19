package abarrotesnb;

import java.util.Random;

public class ProdAba {

    fechaHora fh = new fechaHora();

    int codigo[] = {192, 2, 123, 987, 233, 23, 1450, 1120, 123, 442};
    int valor[] = {1200, 3920, 22340, 33840, 33820, 112900, 3770, 56300, 39980};
    String nombre[] = {"cocoa", "leche", "maiz", "sal", "azucar", "panela", "cafe", "te", "cerveza", "cheetos"};
    String hora[] = {"11:00", "12:03", "15:16", "19:29", "22:46", "09:18", "16:24", "14:07", "13:53", "16:44"};

    public ProdAba() {

    }

    public String[][] prod() {
        String[][] arrayProd = new String[][]{
            {"0001", "cocacola", "2500"},
            {"0002", "arroz", "1250"}
        };
        return arrayProd;
    }

    public String[] fecha() {
        String[] arrayFec = new String[this.codigo.length];
        for (int i = 0; i < 10; i++) {
            arrayFec[i] = fh.fecha();
        }
        return arrayFec;
    }
    public String[] hora() {
        String[] arrayHor = new String[this.codigo.length];
        for (int i = 0; i < 10; i++) {
            arrayHor[i] = fh.hora();
        }
        return arrayHor;
    }

}

//    String fecha[] = {fh.fecha(), fh.fecha(), fh.fecha(), fh.fecha(), fh.fecha(), fh.fecha(), fh.fecha(), fh.fecha(), fh.fecha(), fh.fecha()};
