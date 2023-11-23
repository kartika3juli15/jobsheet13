import java.util.Scanner;

public class FungsiKel {
    public static String namaFilm(){
        Scanner sc =new Scanner(System.in);
        String judulFilm;
        
        System.out.print("Masukkan judul film yang ingin ditambahkan: ");
        judulFilm = sc.nextLine();
        sc.close();
        return judulFilm;
        
    }
    public static void updateFilm(){
        String judulFilm = namaFilm();
        System.out.print("Selamat judul film " +judulFilm+ " berhasil ditambahkan");
    }
    public static void main(String[] args) {
        updateFilm();
    }
}
