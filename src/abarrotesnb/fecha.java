package abarrotesnb;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Date;
import java.util.Random;

public class fecha {

    codigo cod = new codigo();
    int tam = cod.codigo.length;

    public fecha() throws ParseException {
        SimpleDateFormat formFecha = new SimpleDateFormat("dd/MM/yyyy");//Se instancia el formato para Fecha
        Date fechaIngre, horaIngre = null;//Se crean variables para fecha y hora
        String fecha = this.fecha();

        fechaIngre = formFecha.parse(fecha);//Se convierte(parsea) la fecha y hora a formato "SimpleDateFormat""
        String formatoFecha = "dd-MMM-yyyy";//Se crea el formato en el que se mostrará la fecha
        SimpleDateFormat fechaSDF = new SimpleDateFormat(formatoFecha); //Se instancia asignando el formato en el que quedará la fecha
    }

    //Dia aleatorio
    public String dia() {
        Random rnd = new Random();
        String a = Integer.toString(rnd.nextInt(30) + 1);
        if (a.length() == 1) {
            a = "0" + a;
        }
        return (a);
    }

    //Mes Aleatorio
    public String mes() {
        Random rnd = new Random();
        String a = Integer.toString(rnd.nextInt(12) + 1);

        if (a.length() == 1) {
            a = "0" + a;
        }

        return (a);
    }

    //Año Añeatorio
    public String año() {
        Random rnd = new Random();
        String a = Integer.toString(rnd.nextInt(20) + 2000);
        if (a.length() == 1) {
            a = "0" + a;
        }
        return (a);
    }

    //Fecha Completa Aleatoria
    public String fecha() {
        String a = this.dia() + "/" + this.mes() + "/" + this.año();
        return a;
    }

//<editor-fold>
//    
//    Agregar las fechas a un arreglo
    public String[] fechaCom() throws ParseException {
        String[] arrayFec = new String[tam];
        for (int i = 0; i < tam; i++) {
            arrayFec[i] = this.fecha();
        }
        return arrayFec; 
    }
//    Se crea una variable array y se le asigna el arreglo completo con las fechas
   String[] arrayFecha = fechaCom();   
    

//    Imprimir Fechas quemadas
    public void imprimir() throws ParseException {
        System.out.println(asList(arrayFecha));
    }
//  Copiar temporalmente el arreglo creado para operarlo sin que se cambien los datos    

//      public void imprimir() throws ParseException {
//            String temp="";
//        for (int i = 0; i < this.fecha().length(); i++) {
//            String temp2="";
//            temp2 = this.fechaCom()[i];
//            System.out.println(temp2);
//            if(i==2){
//                temp=temp2;
//            }
//        }
//          System.out.println("-----");
//          System.out.println(temp);
//    }
//    
//</editor-fold>
}
