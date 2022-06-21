/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.rizkimugi.quiz1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Quiz1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        float y;
        Pegawai pegawai = new Pegawai();
        Dosen dosen = new Dosen();
        
        System.out.println("NPP                 : ");
        pegawai.npp = input.nextLine();
        System.out.println("Nama                : ");
        pegawai.nama = input.nextLine();
        System.out.println("Gaji Pokok          : ");
        pegawai.gaji = input.nextDouble();
        System.out.println("Jumlah Mata Kuliah  : ");
        x = input.nextInt();
        Dosen dosen1 = new Dosen(x);
        System.out.println("Jumlah Sertifikasi  : ");
        y = input.nextFloat();
        Dosen dosen2 = new Dosen(y);        
        System.out.println();
        System.out.println("========= Data Dosen =============");
        dosen.showData();
    }
}
