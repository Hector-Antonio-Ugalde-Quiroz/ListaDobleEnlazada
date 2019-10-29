/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista.doblemente.circulares;

import java.util.Scanner;

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
        int opcion;
       do {
            System.out.println("Que desea hacer");
            System.out.println("1. Ingresar datos a la lista");
            System.out.println("2. Imprimir lista");
            System.out.println("3. Eliminar datos");
            System.out.println("4. salir");
            opcion = leerentero("Seleccione una opcion");

            switch (opcion) {
                case 1: {
                    int nuevo = leerentero("ingrese el numero");
                    x.agregarAlFinal(nuevo);
                    break;
                }
                case 2: {
                    System.out.println("La lista es: ");
                    x.listar();
                    break;
                }
                case 3: {
                    int valor = leerentero("¿Cual desea eliminar?");
                    x.eliminar();
                    break;
                }
                case 4: {
                    System.out.println("Hasta luego");
                    break;
                }
            }
        } while (opcion != 4);
    }

    public static int leerentero(String texto) {
 Scanner leer = new Scanner(System.in);
        System.out.println(texto);
        int dato = leer.nextInt();
        return dato;
    }
}
