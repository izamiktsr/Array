import java.util.Scanner;

public class SearchNilaiModif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input banyaknya nilai
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlahNilai = scanner.nextInt();

        // 2. Deklarasi array untuk menyimpan nilai
        int[] nilaiMahasiswa = new int[jumlahNilai];

        // 3. Input nilai mahasiswa
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        // 4. Input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int nilaiDicari = scanner.nextInt();

        // 5. Cari nilai yang dicari di dalam array
        int indeks = -1; // Inisialisasi indeks dengan -1 untuk menandakan nilai tidak ditemukan
        for (int i = 0; i < jumlahNilai; i++) {
            if (nilaiMahasiswa[i] == nilaiDicari) {
                indeks = i;
                break; // Keluar dari loop jika nilai ditemukan
            }
        }

        // 6. Cetak hasil
        if (indeks != -1) {
            System.out.println("Nilai " + nilaiDicari + " ketemu, merupakan nilai mahasiswa ke-" + (indeks + 1));
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}