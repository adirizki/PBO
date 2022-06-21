/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizkimugi.quiz1;

/**
 *
 * @author lenovo
 */
public class Dosen extends Pegawai implements IHitungTotal{
    private int jumlahMatkul;
    private int jumlahSertifikasi;
    Pegawai pegawai;

    public Dosen() {
    }

    
    public int getJumlahMatkul() {
        return jumlahMatkul;
    }

    public int getJumlahSertifikasi() {
        return jumlahSertifikasi;
    }

    public void setJumlahMatkul(int jumlahMatkul) {
        this.jumlahMatkul = jumlahMatkul;
    }

    public void setJumlahSertifikasi(int jumlahSertifikasi) {
        this.jumlahSertifikasi = jumlahSertifikasi;
    }
    
    public Dosen(float jmlSertifikasi) {
        this.jumlahSertifikasi = (int) jmlSertifikasi;
    }
    
    @Override
    public double totalPendapatan(){
        return pegawai.gaji + (jumlahMatkul*250000) + (jumlahSertifikasi*100000);
    }
    
    @Override
    public void showData(){
        pegawai.showData();
        System.out.println("Jumlah Mata Kuliah      : "+getJumlahMatkul());
        System.out.println("Jumlah Sertifikasi      : "+getJumlahSertifikasi());
        System.out.println("Total Pendapatan        : "+totalPendapatan());
    }
}
