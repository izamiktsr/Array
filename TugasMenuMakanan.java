import java.util.Scanner;

public class TugasMenuMakanan {

    public static void main(String[] args) {
        // Daftar menu makanan
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        // Input makanan yang ingin dicari
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = scanner.nextLine();

        // Melakukan pencarian linear
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }

        // Menampilkan hasil pencarian
        if (ditemukan) {
            System.out.println("Makanan " + makananDicari + " tersedia di menu.");
        } else {
            System.out.println("Makanan " + makananDicari + " tidak tersedia di menu.");
        }
    }
}