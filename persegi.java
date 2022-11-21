/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enkapsulasi;

/**
 *
 * @author wani
 */
class persegi {
    private int Panjang;
    private int Lebar;
  
    public int getLebar(){
        return Lebar;
    }
    public void setLebar (int Lebar){
        this.Lebar = Lebar;
    }     
     public int getPanjang() {
         return Panjang;
     }
     public void setPanjang( int Panjang) {
         this.Panjang = Panjang;
    }
    
     public persegi (){
         int P = 0;
         int L = 0;
     }
     
     public int Luas (int P, int L) {
         return P*L;
     }    
    public int getLuas() {
        return Luas (Panjang, Lebar);
    }
}
         
     
         
     
     
  
