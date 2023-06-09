package balok;

public class Balok extends PersegiPanjang {
    double t,volume;
    void hitungVolume(){
        volume= luas*t;
    }
    void cetak(){
        super.cetak();
        System.out.println("tinggi\t: "+t);
        System.out.println("volume\t: "+volume);
    }
    void cetak(String nama){
        System.out.println("Balok\t: "+nama);
        cetak();
    }
}
