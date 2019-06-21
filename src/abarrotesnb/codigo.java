package abarrotesnb;

import static java.util.Arrays.asList;

public class codigo {

    int codigo[] = {192, 2, 123, 987, 233, 23, 1450, 1120, 123, 442};

    public codigo() {

    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
//    String[] arrayCodigo = codigo();

    public void imprimirCodigo() {

        for (int i = 0; i < codigo.length; i++) {
            String c = "";
            if (i != codigo.length - 1) {
                c = "; ";
                System.out.print(codigo[i] + c);
            } else {
                System.out.println(codigo[i] + c);
            }
        }System.out.println("__________________________________________________________________________________");
        System.out.println("");
    }
}
