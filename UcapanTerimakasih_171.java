import java.util.Scanner;

public class UcapanTerimakasih_171{
    public static String PenerimaUcapan(){ 
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
    String namaOrang = sc.nextLine();
    sc.close();
    return namaOrang;
}
public static void UcapanTerimakasih(){ 
    String nama = PenerimaUcapan();
    System.out.println("Thank You" + nama + "for being the best teacher in the world. \n" + 
    "you inspired in me a love for learning and made me feel like i could ask you anything");
    }

public static void UcapanTambahan(String UcapanTambahan){
    System.out.println(UcapanTambahan);
    
}
public static void main(String[] args){
    UcapanTerimakasih();
     String ucapan = "Congratulation!!";
        UcapanTambahan(ucapan);
        UcapanTambahan("i wish you the best~");
}
} 