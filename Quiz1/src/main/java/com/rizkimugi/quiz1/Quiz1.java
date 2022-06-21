/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.rizkimugi.quiz1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Quiz1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pegawai pegawai = new Pegawai();
        Dosen dosen = new Dosen();
        
        System.out.println("NPP                 : ");
        String a = input.nextLine();
        pegawai.setNpp(a);
        System.out.println("Nama                : ");
        String b = input.nextLine();
        pegawai.setNama(b);
        System.out.println("Gaji Pokok          : ");
        double c = input.nextDouble();
        pegawai.setGaji(c);
        System.out.println("Jumlah Mata Kuliah  : ");
        int x = input.nextInt();
        dosen.setJumlahMatkul(x);
        System.out.println("Jumlah Sertifikasi  : ");
        int y = input.nextInt();
        dosen.setJumlahSertifikasi(y);
        System.out.println();
        System.out.println("========= Data Dosen =============");
        
        dosen.showData();
    }
}
