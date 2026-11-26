
import java.util.Scanner;

public class Kafe15 {

    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("0. Selesai memesan");
    }

    public static int hitungTotalHarga15(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu("Andi", true);

        int totalBayar = 0;
        int pilihanMenu;
        int banyakItem;

        do {
            System.out.print("\nMasukkan nomor menu yang ingin dipesan: ");
            pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
            } else {
                System.out.print("Masukkan jumlah item yang ingin dipesan: ");
                banyakItem = sc.nextInt();

                int harga = hitungTotalHarga15(pilihanMenu, banyakItem);

                totalBayar = totalBayar + harga;

                System.out.println("Total harga pesanan: Rp " + harga);
            }

        } while (true);

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp " + totalBayar);

        sc.close();
    }
}
