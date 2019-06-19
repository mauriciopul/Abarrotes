package abarrotesnb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class fechaHora {
    
    public fechaHora() throws ParseException{
        SimpleDateFormat formFecha = new SimpleDateFormat("dd/MM/yyyy");//Se instancia el formato para Fecha
        SimpleDateFormat formHora = new SimpleDateFormat("HH:mm");//Se instancia el formato para Hora

        Date fechaIngre, horaIngre = null;//Se crean variables para fecha y hora

        String fecha = this.fecha();
        String hora = this.hora();

        //Se convierte(parsea) la fecha y hora a formato "SimpleDateFormat""
        fechaIngre = formFecha.parse(fecha);
        horaIngre = formHora.parse(hora);

        String formatoHora = "hh:mm a";//Se crea el formato en el que se mostrará la hora
        String formatoFecha = "dd-MMM-yyyy";//Se crea el formato en el que se mostrará la fecha

        SimpleDateFormat fechaSDF = new SimpleDateFormat(formatoFecha); //Se instancia asignando el formato en el que quedará la fecha
        SimpleDateFormat horaSDF = new SimpleDateFormat(formatoHora);//Se instancia asignando el formato en el que quedará la hora

//        System.out.println("Hora formateada:\t" + horaSDF.format(horaIngre));//Se imprime hora formateada
//        System.out.println("Fecha formateada:\t" + fechaSDF.format(fechaIngre));//Se imprime fecha formateada
    }

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
