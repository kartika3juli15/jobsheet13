import java.util.Scanner;

public class Percobaan617{
    public static void main(String[] args) {
        Scanner sc17 = new Scanner (System.in);

    int p, l, t, L, vol;

    System.out.println("masukkan panjang");
    p = sc17.nextInt();
    System.out.println("masukkan lebar");
    l = sc17.nextInt();
    System.out.println("masukkan tinggi");
    t = sc17.nextInt();

    L = p*l;
    System.out.println("Luas Persegi panjang adalah " + L);

    vol = p*l*t;
    System.out.println("volume balok adalah " + vol);
}
    

}