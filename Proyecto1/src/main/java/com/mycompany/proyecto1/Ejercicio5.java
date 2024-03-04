/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab4
 */
public class Ejercicio5 {
      public static void main(String[] args) {
    float numero1 , numero2;
    
 numero1 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer número:"));
 numero2 = Float.parseFloat(JOptionPane.showInputDialog("Introduce el primer número:"));
    
    System.out.println("El resulado de la suma es: "+(numero1+numero2));
      }
}
