import java.util.Scanner;
public class Percobaan622 {
    
    static int hitungLuas (int pjg, int lb){
            int Luas = pjg*lb;
            return Luas;
        }
    
    static int hitungVolume (int tinggi, int a, int b){
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.print("Masukkan panjang  : ");
        p = sc22.nextInt();
        System.out.print("Masukkan lebar    : ");
        l = sc22.nextInt();
        System.out.print("Masukkan tinggi   : ");
        t = sc22.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah : " +L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah         : " +vol);

       
    }
}
