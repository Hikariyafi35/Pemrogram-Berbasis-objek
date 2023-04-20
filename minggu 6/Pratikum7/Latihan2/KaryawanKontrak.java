package Latihan2;

public class KaryawanKontrak extends Karyawan{
   public int upahperhari;
   public int jumlahmasuk;
   public int jumlahgaji;

    public void infokontrak(){
        System.out.println("Upah Perhari : "+upahperhari);
        System.out.println("Jumlah Masuk : "+jumlahmasuk);
    }
   public void totalupah(){
    jumlahgaji = upahperhari*jumlahmasuk+totalanak;
    System.out.println("Total Upah  : "+jumlahgaji);
   }
}
