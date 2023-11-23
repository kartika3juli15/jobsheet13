import java.util.Scanner;

public class dataMhs {
    static Scanner sc = new Scanner(System.in);
    static int[][] nilai;
    static String[] namaMhs;

    public static void inputNamaMahasiswa() {
        for (int i = 0; i < namaMhs.length; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMhs[i] = sc.next();
        }
    }
 public static void inputNilai() {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Masukkan nilai untuk " + namaMhs[i] + ":");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Minggu ke-" + (j + 1) + " : ");
                nilai[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilNilai() {
        for (int i = 0; i < namaMhs.length; i++) {
            System.out.print(namaMhs[i] + " : ");
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print(nilai[i][j]);
                if (j < nilai[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }

    public static void mingguTertinggi() {
        int maks = nilaiTertinggi(nilai);
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == maks) {
                    System.out.println("Nilai tertinggi ada pada minggu ke-" + (j + 1));
                }
            }
        }
    }
 public static void mahasiswaTertinggi() {
        int maks = nilaiTertinggi(nilai);
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[0].length; j++) {
                if (nilai[i][j] == maks) {
                    System.out.println("Mahasiswa dengan nilai tertinggi adalah " + namaMhs[i] +
                            " dengan nilai " + maks);
                }
            }
        }
    }

    static int nilaiTertinggi(int[][] array) {
        int maks = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maks) {
                    maks = array[i][j];
                }
            }
        }
        return maks;
    }
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah minggu/tugas: ");
        int jumlahMinggu = sc.nextInt();

        // Inisialisasi array sesuai dengan input pengguna
        nilai = new int[jumlahMahasiswa][jumlahMinggu];
        namaMhs = new String[jumlahMahasiswa];

        inputNamaMahasiswa();
        System.out.println("================================");
        inputNilai();
        System.out.println("================================");
        tampilNilai();
        System.out.println("================================");
        mingguTertinggi();
        System.out.println("================================");
        mahasiswaTertinggi();
    }
}