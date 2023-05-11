package uts_A11_2021_13217;

public class MahasiswaTransfer extends MahasiswaBaru{
    String asalUniversitas;

    public MahasiswaTransfer(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah) {
        super(nim, nama, semester, usia, krs,asalSekolah);
        this.asalUniversitas = asalSekolah;
    }


    public boolean ikutOspek(){
        return true;
    }
    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("Asal Universitas    : "+this.asalUniversitas);
    }

}
