import Transportasi.Mobil;
import Transportasi.Bicycle;

public class TransportasiDemo {
    public static void main(String[] args) {
        //membuat objek
        System.out.println("Mobil");
        Mobil detail = new Mobil();
        

        detail.warna = "merah";
        detail.merek = "rubicon";
        detail.roda = 4;
        detail.infokendaraan();
        detail.berjalan("depan");
        detail.berhenti();
        detail.kecepatan = 20;
        

		//mengakses atribut dan method
		
        System.out.println("kecepatan awal "+detail.kecepatan);
        int kecepatan = detail.kecepatansekarang(10, "lambat");
		System.out.println("kecepatan kendaraan adalah "+kecepatan);
        detail.mundur();
        System.out.println("kecepatan sekarang setelah mundur "+detail.kecepatan);

        System.out.println("Bicycle");
        Bicycle sepedadetail = new Bicycle(2, "Sepeda BMX", "Wimcycle");
		int gearSepedaBmx = sepedadetail.gear + 3;
        System.out.println("Gear sepeda gunung = " + gearSepedaBmx);
    }
}
