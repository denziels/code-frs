
public class MataKuliah {
    private String kode;
    private String namaMK;
    private int sks;
    private Dosen dosenPengampu;

    public MataKuliah(String kode, String namaMK, int sks, Dosen dosenPengampu) {
        this.kode = kode;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = dosenPengampu;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public int getSks() {
        return sks;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }

    public void tampilkanInfo() {
        System.out.println(kode + " - " + namaMK + " (" + sks + " SKS) | Dosen: " + dosenPengampu.getNama());
    }
}
