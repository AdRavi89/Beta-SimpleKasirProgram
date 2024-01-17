import java.util.HashMap;
import java.util.Scanner;

public class KasirProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> menuItems = new HashMap<>();
        HashMap<Integer, Integer> menuPrices = new HashMap<>();

        menuItems.put(1, "Nasi Goreng");
        menuPrices.put(1, 15000);

        menuItems.put(2, "Mie Ayam");
        menuPrices.put(2, 10000);

        menuItems.put(3, "Bakso");
        menuPrices.put(3, 13000);

        String namaPemesan = "";
        char pesanLagi;

        do {
            System.out.print("Masukan Nama : ");
            namaPemesan = scanner.nextLine();

            System.out.println("Pilihan : ");
            for (int i = 1; i <= menuItems.size(); i++) {
                System.out.println(i + ". " + menuItems.get(i) + " (Rp. " + menuPrices.get(i) + ")");
            }

            System.out.print("Masukan Pilihan (pisahkan dengan spasi): ");
            String[] pilihan = scanner.nextLine().split(" ");
            System.out.print("Jumlah Pesan (pisahkan dengan spasi): ");
            String[] jumlahPesan = scanner.nextLine().split(" ");

            int totalBayar = 0;

            System.out.println("=======================");
            System.out.println("Nama Pemesan : " + namaPemesan);
            System.out.print("Pesanan : ");

            for (int i = 0; i < pilihan.length; i++) {
                int index = Integer.parseInt(pilihan[i]);
                int jumlah = Integer.parseInt(jumlahPesan[i]);

                System.out.print(menuItems.get(index));
                System.out.print(" (" + menuPrices.get(index) + " x " + jumlah + ")");
                totalBayar += menuPrices.get(index) * jumlah;

                if (i < pilihan.length - 1) {
                    System.out.print(" & ");
                }
            }

            System.out.println();
            System.out.println("Total Bayar : Rp. " + totalBayar);
            System.out.println("========================");

            System.out.print("Pesan Lagi ? (y/n) : ");
            pesanLagi = scanner.nextLine().charAt(0);
            System.out.println("========================");

        } while (pesanLagi == 'y' || pesanLagi == 'Y');

        System.out.println("Terima Kasih");
        System.out.println("========================");
    }
}
