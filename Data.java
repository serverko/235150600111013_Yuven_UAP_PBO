package UAP;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    public static ArrayList<Tanaman> tanamans = new ArrayList<>();
    public static ArrayList<Integer> lokasi = new ArrayList<>();
    public static Scanner in = new Scanner(System.in);

    public static void mulai() {
        System.out.print("Masukkan masa tanam (dalam bulan): ");
        int masaTanamBulan = in.nextInt();
        int masaTanamHari = masaTanamBulan * 30;

        System.out.println("Menanam 3 tanaman di awal.");
        menanam();
        menanam();
        menanam();

        for (int hari = 1; hari <= masaTanamHari; hari++) {
            for (int i = 0; i < tanamans.size(); i++) {
                Tanaman tanaman = tanamans.get(i);
                if (tanaman.status().equals("Hidup")) {
                    tanaman.berkembang();
                } else {
                    if (!lokasi.contains(i)) {
                        lokasi.add(i);
                        menanam();
                    }
                }
            }

            if (hari % 90 == 0) {
                for (int i = 0; i < tanamans.size(); i++) {
                    if (!lokasi.contains(i)) {
                        tanamans.get(i).treatment();
                    }
                }
            }
        }

    }

    public static void menanam() {
        System.out.println("Pilih tanaman yang ingin ditanam:");
        System.out.println("1. Tomat");
        System.out.println("2. Stroberi");
        System.out.println("3. Persik");
        System.out.print("Pilihan: ");
        int pilihan = in.nextInt();

        Tanaman tanaman = null;
        switch (pilihan) {
            case 1:
                tanaman = new Tomat();
                break;
            case 2:
                tanaman = new Stroberi();
                break;
            case 3:
                tanaman = new Persik();
                break;
            default:
                System.out.println("Pilihan tidak valid");
                return;
        }

        if (tanaman != null) {
            tanamans.add(tanaman);
            System.out.println("Berhasil ditanam!");
        }
    }

    public static void info() {
        for (int i = 0; i < tanamans.size(); i++) {
            Tanaman tanaman = tanamans.get(i);
            System.out.println("Tanaman ke-" + (i + 1));
            System.out.println(tanaman.toString());
            System.out.println();
        }
    }
}


/*
 * for (int hari = 1; hari <= masaTanamHari; hari++) {
            for (int i = 0; i < tanamans.size(); i++) {
                Tanaman tanaman = tanamans.get(i);
                if (tanaman.status().equals("Hidup")) {
                    tanaman.berkembang();
                } else {
                    if (!lokasi.contains(i)) {
                        lokasi.add(i);
                        menanam();
                    }
                }
            }

            if (hari % 90 == 0) {
                for (int i = 0; i < tanamans.size(); i++) {
                    if (!lokasi.contains(i)) {
                        tanamans.get(i).treatment();
                    }
                }
            }
        }
    }
*/