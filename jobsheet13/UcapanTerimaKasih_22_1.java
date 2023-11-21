import java.util.Scanner;

public class UcapanTerimaKasih_22_1 {
     public static String PenerimaUcapan(){
        Scanner sc22 = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc22.nextLine();
        sc22.close();
        return namaOrang;
    }
    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like i could ask you anything.");
    }
    public static void UcapanTambahan(String ucapan){
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih(); 
        String ucapan = "Terima kasih atas segalanya, semoga sejahtera";
        UcapanTambahan(ucapan);   
    } 
}
