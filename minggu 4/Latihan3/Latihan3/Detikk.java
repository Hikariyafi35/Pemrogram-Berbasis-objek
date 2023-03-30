package Latihan3;

import java.util.Scanner;

public class Detikk {
    int hari, jam, menit, detik;
    Scanner inp = new Scanner(System.in);

    void setWaktu(int detik) {
        this.detik = detik;
    }

    public int kvsMenit(int detik) {
        menit = detik / 60;
        return menit;
    }

    public int kvsJam(int detik) {
        jam = detik / 3600;
        return jam;
    }

    public int kvsHari(int detik) {
        hari = detik / 86400;
        return hari;
    }

    void cetakData() {
        System.out.println("Detik           : " + detik);
        System.out.println("Menit           : " + menit);
        System.out.println("Jam             : " + jam);
        System.out.println("Hari            : " + hari);
    }

  
}