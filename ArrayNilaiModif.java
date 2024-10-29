import java.util.Scanner;

public class ArrayNilaiModif {
    public static void main(String[] args) {
        // Deklarasi array bertipe integer dengan nama nilaiAkhir dan berkapasitas 10 elemen
        int[] nilaiAkhir = new int[10];

        // Menerima input dan mengisi elemen array nilaiAkhir
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        // Menampilkan semua isi elemen dari array nilaiAkhir
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
            System.out.println("Mahasiswa ke-" + i + " lulus! " + nilaiAkhir[i]);
        }
    }
}
}