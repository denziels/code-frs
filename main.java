import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Dosen d1 = new Dosen("Prof. Fajar Baskoro", "12345");
        Dosen d2 = new Dosen("Prof. Baskoro Adi", "67890");
        Dosen d3 = new Dosen("Prof. Victor Hariadi", "67890");

        ArrayList<MataKuliah> daftarMK = new ArrayList<MataKuliah>();
        daftarMK.add(new MataKuliah("IF101", "Teori Graf", 3, d3));
        daftarMK.add(new MataKuliah("IF102", "Pemrograman Web", 4, d1));
        daftarMK.add(new MataKuliah("IF103", "PBO", 3, d1));
        daftarMK.add(new MataKuliah("IF104", "Jaringan Komputer", 3, d2));

        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NRP: ");
        String nrp = sc.nextLine();
        Mahasiswa mhs = new Mahasiswa(nama, nrp);

        FRS frsMhs = new FRS(mhs);

        int pilihan;
        do {
            System.out.println("\n=== MENU FRS ===");
            System.out.println("1. Lihat Daftar Mata Kuliah");
            System.out.println("2. Pilih Mata Kuliah");
            System.out.println("3. Lihat FRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.println("\n=== Daftar Mata Kuliah ===");
                    for (int i = 0; i < daftarMK.size(); i++) {
                        System.out.print((i+1) + ". ");
                        daftarMK.get(i).tampilkanInfo();
                    }
                    break;

                case 2:
                    System.out.print("Masukkan nomor mata kuliah yang ingin diambil: ");
                    int noMK = sc.nextInt();
                    sc.nextLine();
                    if (noMK > 0 && noMK <= daftarMK.size()) {
                        MataKuliah mkDipilih = daftarMK.get(noMK-1);
                        frsMhs.tambahMataKuliah(mkDipilih);
                        System.out.println("✅ " + mkDipilih.getNamaMK() + " berhasil ditambahkan ke FRS.");
                    } else {
                        System.out.println("Nomor tidak valid!");
                    }
                    break;

                case 3:
                    frsMhs.tampilkanFRS();
                    break;

                case 0:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
