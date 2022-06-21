/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizkimugi.quiz1;

/**
 *
 * @author lenovo
 */
public class Staff extends Pegawai implements IHitungTotal{
    private int jamKerja;
    private int jamLembur;
    Pegawai pegawai;
    
    
    @Override
    public double totalPendapatan(){
        return pegawai.gaji+(jamKerja*100000)+(jamLembur*50000);
    }
    @Override
    public void showData(){
        pegawai.showData();
        System.out.println("Jam Kerja               : "+jamKerja);
        System.out.println("Jam Lembur              : "+jamLembur);
        System.out.println("Total Pendapatan        : "+totalPendapatan());
    }
}
