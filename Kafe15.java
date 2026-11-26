import java.util.Scanner;

public class Kafe15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int totalBayar = 0;
        char ulang;

        do {
            System.out.println("\n===== MENU RESTO KAFE =====");
            System.out.println("1. Kopi Hitam - Rp 15,000");
            System.out.println("2. Cappuccino - Rp 20,000");
            System.out.println("3. Latte - Rp 22,000");
            System.out.println("4. Teh Tarik - Rp 12,000");
            System.out.println("5. Roti Bakar - Rp 10,000");
            System.out.println("6. Mie Goreng - Rp 18,000");

            System.out.print("Masukkan nomor menu: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia");
            } else {
                System.out.print("Masukkan jumlah item: ");
                int banyakItem = sc.nextInt();

                if (banyakItem > 0) {
                    int subtotal = hargaItems[pilihanMenu - 1] * banyakItem;
                    totalBayar += subtotal;

                    System.out.println("Subtotal: Rp " + subtotal);
                } else {
                    System.out.println("Jumlah item harus lebih dari 0");
                }
            }

            System.out.print("Apakah ingin memesan menu lain? (y/n): ");
            ulang = sc.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("\nTotal seluruh pesanan: Rp " + totalBayar);

        sc.close();
    }
}
