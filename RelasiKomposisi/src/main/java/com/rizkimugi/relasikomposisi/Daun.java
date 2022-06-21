/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rizkimugi.relasikomposisi;

/**
 *
 * @author lenovo
 */
public class Daun {
    private String warnaDaun;
    private String jenisDaun;

    public Daun(String jenisDaun,String warnaDaun) {
        this.jenisDaun = jenisDaun;
        this.warnaDaun = warnaDaun;
    }
    
    public void showDaun(){
        System.out.println("Jenis Daun : "+jenisDaun+", Warna Daun : "+warnaDaun);
    }
}
