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

/**
 *
 * @author John
 */
public class SerPoliza {
        public void iniciaPoliza(Cliente c) {
        Poliza p = new Poliza();
        p.setNumero(1);
        p.setCuotas(12);
        p.setMonto(125325.50);
        Date fechaIni = new Date(123,0,1);
        Date fechaFi = new Date(123,11,31);
        p.setFechaInicio(fechaIni);
        p.setFechaFin(fechaFi);
        Carro cr = new Carro();
        SerCarro sc = new SerCarro();
        cr=sc.creaCarro();
        p.setCar(cr);
        
        
     
    }
    
}
