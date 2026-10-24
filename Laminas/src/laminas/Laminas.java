/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laminas;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author sala3
 */
public class Laminas {

    
    public static void main(String[] args) {
        Deque<String> pila = new ArrayDeque<>();
        pila.push("hola");
        System.out.println("el elemento de la pila es: " +pila.peek());
    }
    
}
