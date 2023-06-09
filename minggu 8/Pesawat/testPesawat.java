package Pesawat;

public class testPesawat {
    public static void main(String[] args) {
        Pesawat p = new Pesawat();
        p.sayap = 10;
        p.ekor = 10;
        p.terbang();
        p.mendarat();

        Pesawattempur pt = new Pesawattempur();
        pt.manuver();
        pt.terbang();
    }
}
