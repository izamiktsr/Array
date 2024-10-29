import java.util.Scanner;

public class ArrayRataNilaiModif {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Input nilai mahasiswa
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        // Hitung rata-rata nilai lulus dan tidak lulus
        int totalLulus = 0;
        int totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int nilai : nilaiMahasiswa) {
            if (nilai >= 70) {
                totalLulus += nilai;
                jumlahLulus++;
            } else {
                totalTidakLulus += nilai;
                jumlahTidakLulus++;
            }
        }

        double rataRataLulus = (double) totalLulus / jumlahLulus;
        double rataRataTidakLulus = (double) totalTidakLulus / jumlahTidakLulus;

        // Tampilkan hasil
        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);
    }
}