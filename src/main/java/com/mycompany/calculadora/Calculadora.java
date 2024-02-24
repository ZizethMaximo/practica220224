/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author DELL 7490
 */
public class Calculadora {

    public static void main(String[] args) {
        Operaciones op=new Operaciones();
        op.leerNumeros();
        op.sumar();
        op.multiplicacion();
        op.resta();
        op.division();
        op.mostrarResultados();
        
    }
}
