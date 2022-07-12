package Quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author purna
 */
public class Dosen extends Pegawai implements IHitungTotal{
    private int jumlahMatkul, jumlahSertifikasi;
    
    public Dosen(){
        
    }
    
    @Override
    public void showData() throws IOException{
        super.showData();
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.print("NPP                       : ");
        this.npp = br.readLine();
        System.out.print("Nama                      : ");
        this.nama = br.readLine();
        System.out.print("Gaji                      : ");
        double gaji  = Double.parseDouble(br.readLine());
        System.out.print("Jumlah Mata Kuliah        : ");
        this.jumlahMatkul  = Integer.parseInt(br.readLine());
        System.out.print("Jumlah Mata Kuliah        : ");
        this.jumlahSertifikasi  = Integer.parseInt(br.readLine());
        
        
        System.out.println("=============Data Dosen==============");
        System.out.println("NPP                     : " + npp);
        System.out.println("Nama                    : " + nama);
        System.out.println("Gaji                    : " + gaji);
        System.out.println("Jam Mata Kuliah         : " + jumlahMatkul);
        System.out.println("Jam Sertifikasi         : " + jumlahSertifikasi);
        System.out.println("Total Pendapatan        : " + totalPendapatan());
        
        is.close();
        br.close();
    }
    
    @Override
    public double totalPendapatan(){
        return this.gaji + (this.jumlahMatkul*250000) + (this.jumlahSertifikasi * 100000);
    }
    
}