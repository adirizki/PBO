/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizkimugi.relasiasosiasi;

/**
 *
 * @author lenovo
 */
public class Mahasiswa {
    private String nama;
    private String npm;
    private int angkatan;
    private int counter;
    TugasBesar tgsBesar[];

    public Mahasiswa() {
    }
    
    public Mahasiswa(String nama, String npm) {
        this.nama =nama;
        this.npm = npm;
        tgsBesar = new TugasBesar[2];
        counter=0;
    }
    
    public void addTugasBesar(TugasBesar tb){
        tgsBesar[counter]=tb;
        counter++;
    }
    
    public void showMahasiswa(){
        System.out.println("Nama    : "+nama);
        System.out.println("NPM     : "+npm);
        System.out.println();
        for(int i=0;i<counter;i++){
            tgsBesar[i].showTugasBesar();
            System.out.println();
        }
    }
    
    
}
