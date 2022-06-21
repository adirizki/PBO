/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizkimugi.relasikomposisi;

/**
 *
 * @author lenovo
 */
public class Pohon {
    private String jenisPohon;
    private int usiaPohon;
    private int counter;
    Daun daun[];

    public Pohon(String jenisD, String warnaD, String jenisP, int usiaP) {
        jenisPohon=jenisP;
        usiaPohon=usiaP;
        //daun[] = new Daun(jenisD,warnaD);
        counter=0;
    }
    
    
    public void insertDaun(Daun leaf){
        daun[counter]=leaf;
        counter++;
    }
    
    public void showPohon(){
        System.out.println("Jenis Pohon        : "+jenisPohon);
        System.out.println("Usia Pohon         : "+usiaPohon+" Tahun");
        System.out.println();
        for(int i=0; i<counter;i++){
           daun[i].showDaun();
            System.out.println();
        }
    }
}
