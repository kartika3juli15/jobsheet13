import java.util.Scanner;

public class MenuMembership1 {
    int membershipPoint = 0;
    String memberEmail; 
    String memberPhone; 
    String memberPIN; 
    boolean isMembershipAktif = false; 

    public static void main(String[] args) {
        MenuMembership1 menuMembership1 = new MenuMembership1();
        menuMembership1.runMenu();
    }

   
 public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu Membership:");
            System.out.println("1. Daftar Membership");
            System.out.println("2. Transaksi (Dapatkan Cashback)");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi (1-3): ");

            System.out.println(" ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    daftarMembership(scanner);
                    break;
                case 2:
                    lakukanTransaksi(scanner);
                    break;
                case 3:
                    System.out.println("Terima kasih. Keluar dari menu membership.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
                    break;
            }

        } while (choice != 3);

        scanner.close();
    }

    public void daftarMembership(Scanner scanner) {

        System.out.print("\nApakah Anda ingin melanjutkan pendaftaran? (ya/tidak): ");
        String jawaban = scanner.next().toLowerCase();

        if (jawaban.equals("ya")) {
            System.out.print("Masukkan email untuk keanggotaan baru: ");
            memberEmail = scanner.next();

            System.out.print("Masukkan nomor telepon untuk keanggotaan baru: ");
            memberPhone = scanner.next();

            System.out.print("Masukkan PIN untuk keanggotaan baru: ");
            memberPIN = scanner.next();

            isMembershipAktif = true;
            System.out.println("Anda berhasil mendaftar sebagai member dengan data: " + memberEmail + "" + memberPhone + " " + memberPIN);
        } else {
            System.out.println("Anda memilih untuk tidak melanjutkan pendaftaran.");
        }
    }

    public void lakukanTransaksi(Scanner scanner) {
        if (isMembershipAktif) {
            System.out.print("Masukkan total transaksi: ");
            double totalTransaksi = scanner.nextDouble();

            double cashback = totalTransaksi * 0.20;
            int cashbackPoint = (int) cashback; // Konversi cashback menjadi point

            membershipPoint += cashbackPoint;

            System.out.println("Anda mendapatkan cashback sebesar " + cashbackPoint + " point.");
            System.out.println("Total Point Anda sekarang: " + membershipPoint);
        } else {
            System.out.println("Anda belum mendaftar sebagai member. Silakan daftar terlebih dahulu.");
        }
    }
}