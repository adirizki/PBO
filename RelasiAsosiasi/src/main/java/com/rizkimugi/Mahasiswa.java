/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizkimugi.praktikumpbo_rizkimugi.pertemuan3_1;

/**
 *
 * @author lenovo
 */
public class Mahasiswa {
    private String nama;
    private int count;
    private int counter;
    private int total=0;
    private int rata;
    Nilai nilai[];
    
    public Mahasiswa(){
    
    }

    public Mahasiswa(String nama, int count) {
        this.nama = nama;
        this.count = count;
        nilai =  new Nilai[count];
        counter=0;
    }
    
    
    public void addNilai(Nilai ni){
        nilai[counter]=ni;
        counter++;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void show(){
        System.out.println("Nama : "+getNama());
        for(int i=0;i<counter;i++){
            nilai[i].showNilai();
            System.out.println();
        }
    }
}
