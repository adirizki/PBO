/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizkimugi.praktikumpbo_rizkimugi.pertemuan3_1;

/**
 *
 * @author lenovo
 */
public class Nilai {
    private int nilai;

    public Nilai(int nilai) {
        this.nilai = nilai;
    }
    
    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
        
    public void showNilai(){
        System.out.println("Nilai : "+getNilai());
    }
}
