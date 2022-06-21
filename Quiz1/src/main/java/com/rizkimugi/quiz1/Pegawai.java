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

    public String getNpp() {
        return npp;
    }

    public String getNama() {
        return nama;
    }

    public double getGaji() {
        return gaji;
    }

    public void setNpp(String npp) {
        this.npp = npp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public void showData(){
        System.out.println("NPP                     : "+getNpp());
        System.out.println("Nama                    : "+getNama());
        System.out.println("Gaji Pokok              : "+getGaji());
    }
}
