/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Carro;
import entidades.Cliente;
import entidades.Poliza;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class SerPoliza {

    public ArrayList<Poliza> iniciaPoliza(ArrayList<Cliente> ac, ArrayList<Carro> c) {

        Scanner leer = new Scanner(System.in);
        ArrayList<Poliza> arrp = new ArrayList<Poliza>();
        Poliza p = new Poliza();
        p.setNumero(1);
        p.setCuotas(12);
        p.setMonto(125325.50);
        Date fechaIni = new Date(123, 0, 1);
        Date fechaFi = new Date(123, 11, 31);
        p.setFechaInicio(fechaIni);
        p.setFechaFin(fechaFi);
        for (int i = 0; i < ac.size(); i++) {
            System.out.println("cliente " + ac.get(i).getNombre() + " " + ac.get(i).getApellido());
        }
        int elijoCliente = leer.nextInt();
        p.setCli(ac.get(elijoCliente));

        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i).getMarca() + " " + c.get(i).getTipo());
        }
        int elijoCarro = leer.nextInt();
        p.setCar(c.get(elijoCarro));
//        System.out.println(p.toString());
        arrp.add(p);
        return arrp;
    }

}
