package Implementasi.HP;

public class Contact extends Cellphone{
    static String nama;
    static String nomor;

    public Contact(String merk, String type) {
        super(merk, type);
    }

    public void tambahkontak(String nama, String nomor){
        if(status == 1){
            daftarkontak.put(nama, nomor);
            System.out.println("Kontak berhasil ditambah!");
        }else{
            System.out.println("ponsel sedang mati");
        }
    }
    public void lihatSemuaKontak() {
        if (status == 1) {
            if (daftarkontak.isEmpty()) {
                System.out.println("Tidak ada kontak yang tersimpan");
            } else {
                System.out.println("Daftar Kontak:");
                for (String nama : daftarkontak.keySet()) {
                    String nomor = daftarkontak.get(nama);
                    System.out.println("Nama: " + nama + ", Nomor: " + nomor);
                }
            }
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi lihat semua kontak.");
        }
    }
    public void cariKontak(String nama) {
        if (status == 1) {
            if (daftarkontak.containsKey(nama)) {
                String nomor = daftarkontak.get(nama);
                System.out.println("Nama: " + nama + ", Nomor: " + nomor);
            } else {
                System.out.println("Kontak dengan nama " + nama + " tidak ditemukan");
            }
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi cari kontak.");
        }
    }
}
