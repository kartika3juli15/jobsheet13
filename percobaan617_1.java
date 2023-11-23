import java.util.Scanner;

public class percobaan617_1{
    static int hitungLuas (int pjg, int lb){
        int Luas = pjg*lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b) {
        int Volume = hitungLuas(a, b)*tinggi;
        return Volume;
    }
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);
        int p,l,t,L, vol;
        System.out.println("Masukkan panjang: ");
        p = sc17.nextInt();
        System.out.println("Masukkan lebar: ");
        l = sc17.nextInt();
        System.out.println("Masukkan Tinggi: ");
        t = sc17.nextInt();

        L = hitungLuas(p,l);
        System.out.println("Luas persegi panjang adalah "+ L);
        vol = hitungVolume(t,p,l);
        System.out.println("Volume Balok adalah "+vol);

    }
}