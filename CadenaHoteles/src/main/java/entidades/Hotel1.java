/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author John
 */
public class Hotel1 extends Hotel {
    protected  boolean banioPr = true;
    protected boolean ascensor = true;
    protected boolean aireAcond = true;
    protected double precio;
    protected double area;

    public Hotel1(double precio, double area, Integer cantHab) {
        super(cantHab);
        this.precio = precio;
        this.area = area;
    }



}
