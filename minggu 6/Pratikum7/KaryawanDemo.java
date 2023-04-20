import Latihan2.Karyawan;
import Latihan2.KaryawanTetap;
import Latihan2.KaryawanKontrak;

public class KaryawanDemo {
    public static void main(String [] args){
        //membuat objek
        KaryawanTetap Karywannttp = new KaryawanTetap();
        KaryawanKontrak karyawankntrk = new KaryawanKontrak();
        Karywannttp.nama ="Samsudin";
        karyawankntrk.nama ="Agus";
        Karywannttp.ID = 113;
        karyawankntrk.ID=114;
        Karywannttp.umur = 30;
        karyawankntrk.umur = 25;
        Karywannttp.totalanak = 4;
        karyawankntrk.totalanak= 3;
        Karywannttp.gajipokokk=2000000;
        karyawankntrk.upahperhari=50000;
        karyawankntrk.jumlahmasuk=30;

        //memanggil method
        System.out.println("Karyawan Tetap");
        Karywannttp.DetailKaryawan();
        Karywannttp.tunjanganAnak();
        Karywannttp.gajipokok();
        System.out.println("\nKaryawan Kontrak");
        karyawankntrk.DetailKaryawan();
        karyawankntrk.infokontrak();
        karyawankntrk.tunjanganAnak();
        karyawankntrk.totalupah();
    }
}
