package Try;
class MahasiswaTransfer extends MahasiswaBaru {
    String asalUniversitas;

    public MahasiswaTransfer(String nim, String nama, int semester, int usia, String[] krs, String asalSekolah) {
        super(nim, nama, semester, usia, krs, asalSekolah);
        this.asalUniversitas = asalSekolah;
    }

    public boolean ikutOspek() {
        return false;
    }

    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Asal Universitas : " + this.asalUniversitas);
    }
}