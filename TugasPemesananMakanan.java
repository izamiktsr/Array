import java.util.Scanner;

public class TugasPemesananMakanan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah pesanan
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Deklarasi array untuk menyimpan nama pesanan dan harga
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        // Input nama dan harga masing-masing pesanan
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i + 1) + ": ");
            namaPesanan[i] = scanner.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i + 1) + ": ");
            hargaPesanan[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
        }

        // Hitung total biaya
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }

        // Tampilkan daftar pesanan dan total biaya
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp" + hargaPesanan[i]);
        }
        System.out.println("Total Biaya: Rp" + totalBiaya);

        scanner.close();
    }
}