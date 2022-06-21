/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizkimugi.quiz1;

/**
 *
 * @author lenovo
 */
public class Pegawai {
    protected String npp;
    protected String nama;
    protected double gaji;

    public Pegawai() {
    }
        
    public void showData(){
        System.out.println("NPP                     : "+npp);
        System.out.println("Nama                    : "+nama);
        System.out.println("Gaji Pokok              : "+gaji);
    }
}
