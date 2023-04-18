public class kendaraanberaksi {
    public static void main(String[] args) 
    {
     // membuat objek
     
     kendaraan mobil =  new kendaraan();
     kendaraan motor =  new kendaraan();
     kendaraan sepeda = new kendaraan();
     motor.warna = "Hitam";
     motor.merek = "Yamaha mio";
     motor.roda = 2;
     motor.infoKendaraan();
     mobil.warna = "pink";
     mobil.merek = "Tayo";
     mobil.roda = 4;
     mobil.infoKendaraan();
     mobil.berjalan("Depan");
     mobil.berhenti();
     mobil.kecepatan = 20;
     sepeda.kecepatan = 5;
     System.out.println("kecepatan awal "+mobil.kecepatan);
     int kecepatan = mobil.kecepatansekarang(10, "lambat");
     System.out.println("kecepatan kendaraan aadalah "+kecepatan);
     mobil.mundur();
     System.out.println("kecepatan sekarang etelah mundur "+mobil.kecepatan);

    }    
} 
