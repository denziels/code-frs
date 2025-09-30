import java.util.ArrayList;

public class FRS {
    private Mahasiswa mahasiswa;
    private ArrayList<MataKuliah> daftarMK;

    public FRS(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarMK = new ArrayList<MataKuliah>();
    }

    public void tambahMataKuliah(MataKuliah mk) {
        daftarMK.add(mk);
    }

    public void tampilkanFRS() {
        System.out.println("=== FRS Mahasiswa ===");
        mahasiswa.tampilkanInfo();
        System.out.println("Mata Kuliah yang diambil:");
        int totalSKS = 0;
        for (MataKuliah mk : daftarMK) {
            mk.tampilkanInfo();
            totalSKS += mk.getSks();
        }
        System.out.println("Total SKS: " + totalSKS);
    }
}
