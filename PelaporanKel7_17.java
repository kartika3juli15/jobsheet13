import java.util.Scanner;
public class PelaporanKel7_17{
     static final int nm_Film = 5;
    static final int jum_minggu = 7;

    static int[][] jmlPenjualan = new int[nm_Film][jum_minggu];
    static String[] namaFilm = {"Joker", "Pamali", "Barbie", "Yowis Ben", "Inception"};

    public static void main(String[] args) {
        inputDataPenjualan();
        tampilkanJml();
        jumlahPerminggu();
    }

    static void inputDataPenjualan() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nm_Film; i++) {
            System.out.println("Penjualan untuk Film " + namaFilm[i] + ":");
            for (int j = 0; j < jum_minggu; j++) {
                System.out.print("Minggu ke " + (j + 1) + ": ");
                jmlPenjualan[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilkanJml() {
        System.out.println("\nJumlah:");

        for (int i = 0; i < nm_Film; i++) {
            System.out.print(namaFilm[i] + ": ");
            for (int j = 0; j < jum_minggu; j++) {
                System.out.print(jmlPenjualan[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void jumlahPerminggu(){
        System.out.println("\nJumlah Penjualan Film per Minggu: ");

        for (int j = 0; j < jum_minggu; j++) {
            int totalPerminggu = 0;
            for (int i = 0; i<nm_Film; i++) {
                totalPerminggu += jmlPenjualan[i][j];
            }
            System.out.println("Minggu ke " +(j+1) + ": " + totalPerminggu);

        }
    }
    static void jumlahTotal() {
        System.out.println("\nJumlah Total:");

        int totalPenjualan = 0;
        for (int i = 0; i < nm_Film; i++) {
            for (int j = 0; j < jum_minggu; j++) {
                totalPenjualan += jmlPenjualan[i][j];
            }
        }

        System.out.println("Total Penjualan: " + totalPenjualan);
    }
}