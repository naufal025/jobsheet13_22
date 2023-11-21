import java.util.Scanner;
public class Ucapan_22 {
    public static String PenerimaUcapan(){
        Scanner sc22 = new Scanner(System.in);
        System.out.print("Tuliskan NAMA orang yang ingin anda beri ucapan : ");
        String namaOrang = sc22.nextLine();
        sc22.close();
        return namaOrang;
    }
    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+"\nMay the force be with you.");
    }
}
