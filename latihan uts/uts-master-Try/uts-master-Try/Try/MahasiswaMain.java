package Try;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class MahasiswaMain {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> listMahasiswa = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Input data Mahasiswa
        System.out.println("=== Input Data Mahasiswa ===");
        System.out.print("Jumlah Mahasiswa : ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("NIM         : ");
            String nim = scanner.nextLine();
            System.out.print("Nama        : ");
            String nama = scanner.nextLine();
            System.out.print("Semester    : ");
            int semester = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            System.out.print("Usia        : ");
            int usia = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            // Input KRS
            System.out.print("Jumlah Mata Kuliah : ");
            int jumlahMataKuliah = scanner.nextInt();
            scanner.nextLine(); // consume newline character
            float[] nilai = new float[jumlahMataKuliah];
            String[] krs = new String[jumlahMataKuliah];
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("KRS ke-" + (j + 1) + " : ");
                krs[j] = scanner.nextLine();
                System.out.print("Nilai Mata Kuliah " + krs[j] + " : ");
                nilai[j] = scanner.nextFloat();
                scanner.nextLine(); // consume newline character
            }

            // Pilihan jenis Mahasiswa
            System.out.println("Jenis Mahasiswa :");
            System.out.println("1. Mahasiswa Baru");
            System.out.println("2. Mahasiswa Transfer");
            System.out.println("3. Mahasiswa Lulus");
            System.out.println("4. Mahasiswa Aktif");
            System.out.print("Pilihan : ");
            int jenisMahasiswa = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            // Input data sesuai jenis Mahasiswa
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, semester, usia, krs);
            mahasiswa.nilai = nilai;
            // listMahasiswa.add(mahasiswa);
            switch (jenisMahasiswa) {
                case 1:
                    System.out.print("Asal Sekolah : ");
                    String asalSekolah = scanner.nextLine();
                    mahasiswa = new MahasiswaBaru(nim, nama, semester, usia, krs, asalSekolah);
                    mahasiswa.nilai = nilai;
                    break;
                case 2:
                    System.out.print("Asal Universitas : ");
                    String asalUniversitas = scanner.nextLine();
                    mahasiswa = new MahasiswaTransfer(nim, nama, semester, usia, krs, asalUniversitas);
                    mahasiswa.nilai = nilai;
                    break;
                case 3:
                    System.out.print("Tahun Wisuda : ");
                    int tahunWisuda = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("IPK : ");
                    float ipk = scanner.nextFloat();
                    scanner.nextLine();
                    mahasiswa = new MahasiswaLulus(nim, nama, semester, usia, krs, tahunWisuda, ipk);
                    mahasiswa.nilai = nilai;
                    break;
                default:
                    mahasiswa = new Mahasiswa(nim, nama, semester, usia, krs);
                    mahasiswa.nilai = nilai;
                    break;
            }
            listMahasiswa.add(mahasiswa);
            System.out.println("Data Mahasiswa berhasil ditambahkan!\n");
        }

        Iterator<Mahasiswa> iterator = listMahasiswa.iterator();
        while (iterator.hasNext()) {
            Mahasiswa mhs = iterator.next();
            mhs.infoMahasiswa();
            if (mhs instanceof MahasiswaBaru) {
                System.out.println("Mengikuti OSPEK : " + ((MahasiswaBaru) mhs).ikutOspek());
            } else if (mhs instanceof MahasiswaTransfer) {
                System.out.println("Mengikuti OSPEK : " + ((MahasiswaTransfer) mhs).ikutOspek());
            }
            System.out.println("=====================");
        }

        System.out.println("=== Rata-rata Nilai Mahasiswa ===");

        HashSet<String> setNama = new HashSet<String>();
        for (Mahasiswa mhs : listMahasiswa) {
            if (!setNama.contains(mhs.nama)) {
                setNama.add(mhs.nama);
                float rataNilai = mhs.hitungRataNilai(mhs.nilai);
                System.out.println(mhs.nama + ": " + rataNilai);
            }
        }
        System.out.println("=== KRS Mahasiswa ===");
            for (Mahasiswa mhs : listMahasiswa) {
                mhs.infoKrsMahasiswa();
                System.out.println("=====================");
            }
        scanner.close();
    }
}