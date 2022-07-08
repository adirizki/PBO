/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizkimugi.relasiasosiasi;

/**
 *
 * @author lenovo
 */
public class TugasBesar {
    private String judulTugas;
    private int jumlahAnggotaKelompok;
    private int nilai;

    public TugasBesar(String judulTugas, int nilai, int jumlahAnggotaKelompok) {
        this.judulTugas = judulTugas;
        this.nilai = nilai;
        this.jumlahAnggotaKelompok = jumlahAnggotaKelompok;
    }
    
    public void showTugasBesar(){
        System.out.println("Tugas Besar :");
        System.out.println("Judul Tugas Besar           : "+judulTugas);
        System.out.println("Nilai                       : "+nilai);
        System.out.println("Jumlah ANggota              : "+jumlahAnggotaKelompok);
    }
}
