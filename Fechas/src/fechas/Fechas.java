/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author John
 */
public class Fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fecha = new Date();
        int di = fecha.getDay();
        String diaS = "";
        switch (di) {
            case 1:
                diaS = "lunes";
                break;
            case 2:
                diaS = "martes";
                break;
            case 3:
                diaS = "miercoles";
                break;
            case 4:
                diaS = "jueves";
                break;
            case 5:
                diaS = "viernes";
                break;
            case 6:
                diaS = "sabado";
                break;
            case 7:
                diaS = "domingo";
                break;
        }
//        System.out.println(diaS);
        int d = fecha.getMonth();
        String mes = "";
        switch (d) {
            case 0:
                mes = "enero";
                break;
            case 1:
                mes = "febrero";
                break;
            case 2:
                mes = "marzo";
                break;
            case 3:
                mes = "abril";
                break;
            case 4:
                mes = "mayo";
                break;
            case 5:
                mes = "junio";
                break;
            case 6:
                mes = "julio";
                break;
            case 7:
                mes = "agosto";
                break;
            case 8:
                mes = "setiembre";
                break;
            case 9:
                mes = "octubre";
                break;
            case 10:
                mes = "noviembre";
                break;
            case 11:
                mes = "diciembre";
                break;
        }
//        System.out.println(mes);
        LocalDateTime lc = LocalDateTime.now();
//        System.out.println(lc);
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd-MM-yyyy ");
        String fechaDeHoy = lc.format(dt);
        System.out.println(fechaDeHoy);
    }

}
