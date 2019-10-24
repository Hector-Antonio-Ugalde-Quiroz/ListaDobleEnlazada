/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.doblemente.circulares;

/**
 *
 * @author heuga
 */
public class ListaDoblementeCirculares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ListaCircular x = new ListaCircular();
        int a = 5;
        int b = 10;
        int c = 15;
        int d = 20;
        int e = 25;
        int f = 30;
        x.alta(a);
        x.alta(b);
        x.alta(c);
        x.alta(d);
        x.alta(e);
        x.alta(f);
        System.out.println("Valores iniciales:\n");
        x.imprimir();
        x.bajaxposicion(0);
        System.out.println("\nSe acaba de borrar un numero\n");
        x.imprimir();
    }
}
