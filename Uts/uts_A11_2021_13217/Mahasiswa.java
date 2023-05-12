package uts_A11_2021_13217;

import java.util.HashSet;
import java.util.Set;

public class Mahasiswa {
    public String nim;
    public String nama;
    public int semester;
    public int usia;
    public String krs[];
    public float[] nilai;

    public Mahasiswa(String nim, String nama, int semester, int usia, String[] krs) {
        this.nim = nim;
        this.nama = nama;
        this.semester = semester;
        this.usia = usia;
        this.krs = krs;
        this.nilai = new float[0];
    }

    public float[] getNilai(){
        return nilai;
    }
    public void setNilai(float[] nilai){
        this.nilai = nilai;
    }
    public float hitungRatanilai(float[] nilai){
        float total=0;
        for (float n : nilai){
            total += n;
        }
        return total / nilai.length;
    }

    public void infoMahasiswa(){
        System.out.println("NIM     : "+ this.nim);
        System.out.println("Nama     : "+ this.nama);
        System.out.println("Semester     : "+ this.semester);
        System.out.println("Usia     : "+ this.usia);
    }

    public void infokrsMahasiswa(){
        System.out.println(this.nama+" "+ "KRS  : ");
        Set<String> krss = new HashSet<String>();
        for (int i = 0; i < this.krs.length; i++) {
            krss.add(this.krs[i]);
        }
        for (String mataKuliah : krss) {
            System.out.println("- " + mataKuliah);
        }

    }

    

}
