import java.util.Scanner;
public class kubus17 {
    public static void main(String[] args) {
        Scanner sc17 = new Scanner(System.in);

        System.out.println("Masukkan sisi kubus: ");
        int sisi = sc17.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume kubus adalah " + volume);
        System.out.println("Luas permukaan kubus adalah " + luasPermukaan);
    }
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi*sisi;
    }

}