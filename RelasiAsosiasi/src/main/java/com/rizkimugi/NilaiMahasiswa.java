/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizkimugi.praktikumpbo_rizkimugi.pertemuan3_1;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author lenovo
 */
public class NilaiMahasiswa {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        Mahasiswa mhs = new Mahasiswa();
        System.out.print("Masukkan Nama : ");
        String name = in.nextLine();
        mhs.setNama(name);
        System.out.print("Masukkan Banyaknya nilai yang diinput: ");
        int x = in.nextInt();
        Nilai[] n = new Nilai[x];
        for (Nilai n1 : n) {
            System.out.println("Masukkan nilai: ");
            int a = in.nextInt();
            n1.setNilai(a);
        }
        in.close();
        int total=0;
        for(int i=0; i<n.length; i++){	
            total = total + n[i];
        }
        int rata;
        rata = total / n.length;
        
        System.out.println("rata-rata nilai : "+rata);
    }
}
