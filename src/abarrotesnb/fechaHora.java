package abarrotesnb;

import java.util.Random;

public class fechaHora {

    public String rand60() {
        Random rnd = new Random();
        String a = Integer.toString(rnd.nextInt(60));
        if (a.length() == 1) {
            a = "0" + a;
        }
        return (a);
    }

    public String rand24() {
        Random rnd = new Random();
        String a = Integer.toString(rnd.nextInt(24));
        if (a.length() == 1) {
            a = "0" + a;
        }
        return (a);
    }

//Hora aleatoria
    public String hora() {
        String a = this.rand24() + ":" + this.rand60();
        return a;
    }

    public String dia() {
        Random rnd = new Random();
        String a = Integer.toString(rnd.nextInt(30));
        if (a.length() == 1) {
            a = "0" + a;
        }
        return (a);
    }

    public String mes() {
        Random rnd = new Random();
        String a = Integer.toString(rnd.nextInt(9));
        if (a.length() == 1) {
            a = "0" + a;
        }
        return (a);
    }

    public String año() {
        Random rnd = new Random();
        String a = Integer.toString(rnd.nextInt(20) + 2000);
        if (a.length() == 1) {
            a = "0" + a;
        }
        return (a);
    }

    //Fecha Aleatoria
    public String fecha() {
        String a = this.dia() + "/" + this.mes() + "/" + this.año();
        return a;
    }

}
