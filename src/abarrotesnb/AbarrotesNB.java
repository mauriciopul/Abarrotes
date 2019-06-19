package abarrotesnb;

import java.text.ParseException;

public class AbarrotesNB {

    public static void main(String[] args) throws ParseException {

        ProdAba pr = new ProdAba();

        for (int i = 0; i < pr.prod().length; i++) {
            System.out.println(pr.prod()[i][0] + ": " + pr.prod()[i][1] + " \t$" + pr.prod()[i][2]);
        }

        pr.imprimir();

    }

}
