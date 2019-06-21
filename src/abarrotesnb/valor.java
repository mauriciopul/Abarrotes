package abarrotesnb;

public class valor {

    int valor[] = {1200, 3920, 22340, 33840, 33820, 112900, 3770, 56300, 39980};

    public int[] getValor() {
        return valor;
    }

    public void setValor(int[] valor) {
        this.valor = valor;
    }

    public valor() {
    }

    public void imprimirValor() {
        for (int v : valor) {
            System.out.print(v + ", ");
        }
        System.out.println("\n__________________________________________________________________________________");
        System.out.println("");
    }
}
