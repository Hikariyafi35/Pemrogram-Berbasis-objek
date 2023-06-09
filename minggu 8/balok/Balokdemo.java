package balok;
import balok.Balok;
import balok.PersegiPanjang;

public class Balokdemo {
    public static void main(String[] args) {
        //todo code application logic here
        Balok a=new Balok();
        a.p=10;
        a.l=5;
        a.t=5;
        a.hitungLuas();
        a.hitungVolume();
        a.cetak();
        System.out.println("");
        a.l=7;
        a.hitungLuas();
        a.hitungVolume();
        a.cetak("Balokku");
    }
}
