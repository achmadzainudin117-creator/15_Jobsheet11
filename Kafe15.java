import java.util.Scanner;

public class Kafe15 {

    public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
        int diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            diskon = total * 50 / 100;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            diskon = total * 30 / 100;
        } else {
            System.out.println("Kode promo invalid");
        }

        if (isMember) {
            diskon += total * 10 / 100;
        }

        return diskon;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan total harga: Rp ");
        int total = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();

        System.out.print("Apakah pelanggan member? (y/n): ");
        char status = sc.next().charAt(0);

        boolean isMember = (status == 'y' || status == 'Y');

        int diskon = hitungDiskon(total, kodePromo, isMember);
        int totalBayar = total - diskon;

        System.out.println("\n===== RINCIAN PEMBAYARAN =====");
        System.out.println("Total harga : Rp " + total);
        System.out.println("Besar diskon: Rp " + diskon);
        System.out.println("Total bayar : Rp " + totalBayar);

        sc.close();
    }
}