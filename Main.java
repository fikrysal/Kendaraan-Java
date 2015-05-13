/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportasi;


/**
 *
 * @author STUDENT
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Kendaraan kendaraan1 = new Kendaraan();
        Mobil mobil1 = new Mobil();
        Pesawat pesawat1 = new Pesawat();
        
        mobil1.mbl();
        mobil1.bergerak();
        mobil1.mengerem();
        mobil1.mundur();
        
        pesawat1.pswt();
        pesawat1.mengerem();
        pesawat1.terbang();
    }
}
