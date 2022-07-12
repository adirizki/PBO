package Quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author purna
 */
public class Staff extends Pegawai implements IHitungTotal {
    private int jamKerja, jamLembur;
    
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
        this.gaji  = Double.parseDouble(br.readLine());
        System.out.print("Jam Kerja                 : ");
        this.jamKerja  = Integer.parseInt(br.readLine());
        System.out.print("Jam Lembur                : ");
        this.jamLembur  = Integer.parseInt(br.readLine());
        
        
        System.out.println("=============Data Staff==============");
        System.out.println("NPP                      : " + this.npp);
        System.out.println("Nama                     : " + this.nama);
        System.out.println("Gaji                     : " + this.gaji);
        System.out.println("Jam Kerja                : " + this.jamKerja);
        System.out.println("Jam Lembur               : " + this.jamLembur);
        System.out.println("Total Pendapatan         : " + totalPendapatan());
        is.close();
        br.close();
    }
    
    @Override
    public double totalPendapatan(){
        return this.gaji + (this.jamKerja*100000) + (this.jamLembur * 50000);
    }
}