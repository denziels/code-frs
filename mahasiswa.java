
public class Mahasiswa {
    private String nama;
    private String nrp;

    public Mahasiswa(String nama, String nrp) {
        this.nama = nama;
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nrp;
    }

    public void tampilkanInfo() {
        System.out.println("Mahasiswa: " + nama + " | NRP: " + nrp);
    }
}
