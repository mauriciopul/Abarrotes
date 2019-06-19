package abarrotesnb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class AbarrotesNB {

    public static void main(String[] args) throws ParseException {

        ProdAba pr = new ProdAba();

        for (int i = 0; i < pr.prod().length; i++) {
            System.out.println(pr.prod()[i][0] + ": " + pr.prod()[i][1] + " \t$" + pr.prod()[i][2]);
        }

        fechaHora fh = new fechaHora();

        SimpleDateFormat formFecha = new SimpleDateFormat("dd/MM/yyyy");//Se instancia el formato para Fecha
        SimpleDateFormat formHora = new SimpleDateFormat("HH:mm");//Se instancia el formato para Hora

        Date fechaIngre, horaIngre = null;//Se crean variables para fecha y hora

        String fecha = fh.fecha();
        String hora = fh.hora();

        //Se convierte(parsea) la fecha y hora a formato "SimpleDateFormat""
        fechaIngre = formFecha.parse(fecha);
        horaIngre = formHora.parse(hora);

        String formatoHora = "hh:mm a";//Se crea el formato en el que se mostrará la hora
        String formatoFecha = "dd-MMM-yyyy";//Se crea el formato en el que se mostrará la fecha

        SimpleDateFormat fechaSDF = new SimpleDateFormat(formatoFecha); //Se instancia asignando el formato en el que quedará la fecha
        SimpleDateFormat horaSDF = new SimpleDateFormat(formatoHora);//Se instancia asignando el formato en el que quedará la hora

        System.out.println("Hora formateada:\t" + horaSDF.format(horaIngre));//Se imprime hora formateada
        System.out.println("Fecha formateada:\t" + fechaSDF.format(fechaIngre));//Se imprime fecha formateada

        for (int i = 0; i < pr.imprimFecha().length; i++) {

            System.out.println(pr.imprimFecha()[i]);
        }

    }

}
