/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.rizkimugi.relasikomposisi;

/**
 *
 * @author lenovo
 */
public class RelasiKomposisi {

    public static void main(String[] args) {
        Daun daun1,daun2;         
        daun1= new Daun("Menjari","Hijau Muda");
        daun2= new Daun("Menjari","Coklat Muda");
        
        Pohon tree = new Pohon("Menjari","Hijau Muda","Mangga",5);
        tree.insertDaun(daun1);
        tree.insertDaun(daun2);
        tree.showPohon();
        
        
    }
}
