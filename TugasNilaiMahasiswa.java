import java.util.ArrayList;
import java.util.Scanner;

public class TugasNilaiMahasiswa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> nilaiMahasiswa = new ArrayList<>();

        // Memasukkan banyaknya nilai mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Memasukkan setiap nilai mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            int nilai = scanner.nextInt();
            nilaiMahasiswa.add(nilai);
        }

        // Menghitung nilai rata-rata
        int totalNilai = 0;
        for (int nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }
        double rataRata = (double) totalNilai / jumlahMahasiswa;

        // Menampilkan nilai tertinggi dan terendah
        int nilaiTertinggi = nilaiMahasiswa.get(0);
        int nilaiTerendah = nilaiMahasiswa.get(0);
        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        // Menampilkan semua nilai yang telah dimasukkan
        System.out.println("Semua nilai yang telah dimasukkan:");
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }

        // Menampilkan hasil
        System.out.println("\n");
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}