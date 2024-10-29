import java.util.Scanner;

public class ArrayNilai18 {
    public static void main(String[] args) {
        // Deklarasi array bertipe integer dengan nama nilaiAkhir dan berkapasitas 10 elemen
        int[] nilaiAkhir = new int[10];

        // Menerima input dan mengisi elemen array nilaiAkhir
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // Menampilkan semua isi elemen dari array nilaiAkhir
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
        }
    }
}