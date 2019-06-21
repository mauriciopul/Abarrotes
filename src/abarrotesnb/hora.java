package abarrotesnb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class hora {

    codigo cod = new codigo();
    int tam = cod.codigo.length;

    public hora() throws ParseException {
        SimpleDateFormat formHora = new SimpleDateFormat("HH:mm");//Se instancia el formato para Hora
        Date horaIngre = null;//Se crea variable hora
        String hora = this.hora();

        horaIngre = formHora.parse(hora);//Se convierte(parsea) la hora a formato "SimpleDateFormat""
        String formatoHora = "hh:mm a";//Se crea el formato en el que se mostrará la hora
        SimpleDateFormat horaSDF = new SimpleDateFormat(formatoHora);//Se instancia asignando el formato en el que quedará la hora
    }

//    Minutos Aleatorios
    public String rand60() {
        Random rnd = new Random();
        String a = Integer.toString(rnd.nextInt(60));
        if (a.length() == 1) {
            a = "0" + a;
        }
        return (a);
    }

//    Horas Aleatorias
    public String rand24() {
        Random rnd = new Random();
        String a = Integer.toString(rnd.nextInt(24));
        if (a.length() == 1) {
            a = "0" + a;
        }
        return (a);
    }

//  Hora completa aleatoria
    public String hora() {
        String a = this.rand24() + ":" + this.rand60();
        return a;
    }

//    Agregar las Horas a un arreglo
    public String[] horaCom() throws ParseException {
        String[] arrayHor = new String[tam];
        for (int i = 0; i < tam; i++) {
            arrayHor[i] = this.hora();
        }
        return arrayHor;
    }
    
    String[] arrayHora = horaCom();
    
    public void imprimirHora(){
        System.out.println(Arrays.asList(arrayHora));
    }

}
