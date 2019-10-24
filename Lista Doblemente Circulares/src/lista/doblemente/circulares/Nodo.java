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
public class Nodo {

    int dato;
    Nodo next;
    Nodo ant;

    Nodo(int a) {
        dato = a;
        ant = null;
        next = null;
    }
}
