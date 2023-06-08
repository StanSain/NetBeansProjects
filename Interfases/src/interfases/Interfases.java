/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfases;

/**
 *
 * @author John
 */
public class Interfases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase c = new Clase();
        c.metodo();
        System.out.println(c.sumar());
    }

    public interface Inter {

        public void metodo();

        public int sumar();
    }

    public static class Clase implements Inter {

        @Override
        public void metodo() {
            System.out.println("Algo");
        }

        @Override
        public int sumar() {
            int a = 3;
            int b = 6;
            return a+b;

        }
    }

}
