package Latihan2;

public class Karyawan {
    public String nama;
    public int ID;
    public int umur;
    public int totalanak;
    

    public void DetailKaryawan(){
        System.out.println("Nama : "+nama);
        System.out.println("ID : "+ID);
        System.out.println("Umur : "+umur);
    }
    
    public void tunjanganAnak(){
        
        totalanak = totalanak * 100000;
        System.out.println("Tunjangan anak total "+totalanak);
    }
}
