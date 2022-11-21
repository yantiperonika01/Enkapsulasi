/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.enkapsulasi;

/**
 *
 * @author wani
 */
public class Enkapsulasi {

    public static void main(String[] args) {
    persegi P = new persegi ();
    P.setPanjang(7);
    P.setLebar(6);
    
    System.out.println("panjang:" + P.getPanjang());
    System.out.println("Lebar:" + P.getLebar());
    System.out.println("Luas Persegi:" + P.getLuas());
    
    }
}
