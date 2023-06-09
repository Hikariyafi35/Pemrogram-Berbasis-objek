package Pesawat;

public class Pesawattempur extends Pesawat {
    public Pesawattempur() {
        System.out.println("...F16...");
    }

    public void manuver() {
        System.out.println("Manuver........");
    }

    @Override
    public void terbang() {
        System.out.println("Terbang ala tempur........");
    }
}
