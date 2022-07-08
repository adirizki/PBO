/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.rizkimugi.relasiasosiasi;

/**
 *
 * @author lenovo
 */
public class RelasiAsosiasi {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Rizki Mugi Setya Adi","20102156");
        
        TugasBesar tb1,tb2;
        tb1 = new TugasBesar("POS untuk Toko Pakan Hewan",85,4);
        tb2 = new TugasBesar("SI Kepegawaian",90,4);
        
        mhs.addTugasBesar(tb1);
        mhs.addTugasBesar(tb2);
        mhs.showMahasiswa();
        
    }
}
