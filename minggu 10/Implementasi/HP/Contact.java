package Implementasi.HP;

public class Contact extends Cellphone{
    static String nama;
    static String nomor;

    public Contact(String merk, String type) {
        super(merk, type);//membuat variabel merk dan type 
    }

    public void tambahkontak(String nama, String nomor){
        if(status == 1){
            //membuat antrian baru untuk daftarkontak
            daftarkontak.put(nama, nomor);
            System.out.println("Kontak berhasil ditambah!");
        }else{
            System.out.println("ponsel sedang mati");
        }
    }
    public void lihatSemuaKontak() {
        if (status == 1) {
            if (daftarkontak.isEmpty()) { //jika daftarkontak kosong maka akan mengeluarkan output seperti dibawah
                System.out.println("Tidak ada kontak yang tersimpan");
            } else {
                /* Loop for yang diberikan digunakan untuk mengiterasi melalui setiap kunci (nama) dalam daftarkontak (objek dari kelas HashMap<String, String>) dan mencetak nama dan nomor kontak yang terkait. */
                System.out.println("Daftar Kontak:");//
                for (String nama : daftarkontak.keySet()) {
                    String nomor = daftarkontak.get(nama);
                    System.out.println("Nama: " + nama + ", Nomor: " + nomor);
                }
            }
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi lihat semua kontak.");
        }
    }
    public void cariKontak(String nama) { /*digunakan untuk mencari kontak berdasarkan nama yang diberikan. Berikut adalah langkah-langkah dalam metode tersebut secara ringkas: */
        if (status == 1) {
            if (daftarkontak.containsKey(nama)) {
                String nomor = daftarkontak.get(nama); /*Jika daftarkontak mengandung kunci yang sesuai:
a. Dapatkan nilai (nomor) yang terkait dengan kunci (nama) tersebut menggunakan daftarkontak.get(nama).
b. Cetak informasi kontak yang ditemukan dengan format "Nama: [nama], Nomor: [nomor]" menggunakan System.out.println("Nama: " + nama + ", Nomor: " + nomor). */
                System.out.println("Nama: " + nama + ", Nomor: " + nomor);
            } else {
                /*Jika daftarkontak tidak mengandung kunci yang sesuai, cetak pesan bahwa kontak dengan nama yang dicari tidak ditemukan. */
                System.out.println("Kontak dengan nama " + nama + " tidak ditemukan");
            }
        } else {
            System.out.println("Ponsel mati. Tidak dapat melakukan operasi cari kontak.");
        }
    }
}
