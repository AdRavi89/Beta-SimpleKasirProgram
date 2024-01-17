import java.util.Scanner;

public class KasirProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nama;
        String pesanan = "";
        int totalBayar = 0;

        do {
            // Input nama pemesan
            System.out.print("Masukan Nama : ");
            nama = scanner.nextLine();

            // Menampilkan menu
            System.out.println("Pilihan :");
            System.out.println("1. Nasi Goreng (Rp. 15.000.00)");
            System.out.println("2. Mie Ayam (Rp. 10.000.00)");
            System.out.println("3. Bakso (Rp. 13.000.00)");

            // Input pilihan menu dan jumlah pesanan
            System.out.print("Masukan Pilihan : ");
            String[] pilihan = scanner.nextLine().split(" ");
            System.out.print("Jumlah Pesan : ");
            String[] jumlahPesan = scanner.nextLine().split(" ");

            System.out.println("======================");
            System.out.println("Nama Pemesan : " + nama);

            // Looping untuk setiap pilihan menu
            for (int i = 0; i < pilihan.length; i++) {
                // Mendapatkan nama menu dan harga
                String menu = getMenu(Integer.parseInt(pilihan[i]));
                int harga = getHarga(Integer.parseInt(pilihan[i]));

                // Membuat string pesanan dan menghitung total bayar
                pesanan += jumlahPesan[i] + " Porsi " + menu + " & ";
                totalBayar += Integer.parseInt(jumlahPesan[i]) * harga;

                // Menampilkan detail pesanan
                System.out.println("Pesanan : " + menu);
                System.out.println("Harga : Rp. " + harga);
                System.out.println("Jumlah Pesanan : " + jumlahPesan[i] + " Porsi " + menu);
            }

            // Menampilkan total bayar
            System.out.println("Total Bayar : Rp. " + totalBayar);
            System.out.println("========================");

            // Meminta input untuk pesan lagi atau tidak
            System.out.print("Pesan Lagi ? (y/n) : ");
        } while (scanner.nextLine().equalsIgnoreCase("y"));

        // Menampilkan pesan terima kasih jika tidak pesan lagi
        System.out.println("========================");
        System.out.println("Terima Kasih");
        System.out.println("========================");

        scanner.close();
    }

    // Mendapatkan nama menu berdasarkan pilihan
    private static String getMenu(int pilihan) {
        switch (pilihan) {
            case 1:
                return "Nasi Goreng";
            case 2:
                return "Mie Ayam";
            case 3:
                return "Bakso";
            default:
                return "Menu Tidak Valid";
        }
    }

    // Mendapatkan harga menu berdasarkan pilihan
    private static int getHarga(int pilihan) {
        switch (pilihan) {
            case 1:
                return 15000;
            case 2:
                return 10000;
            case 3:
                return 13000;
            default:
                return 0;
        }
    }
}
