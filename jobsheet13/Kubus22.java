
import java.util.Scanner;

public class Kubus22 {
    public static double volumeKubus(double sisi){
        double volume = sisi * sisi * sisi;
        return volume;
      }
      
      public static double luasPermukaanKubus(double a){
          double luas = 6 * a;
          return luas;	
      }
      
      public static void main(String[] args) {
        Scanner sc22 = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus : ");
        double s = sc22.nextDouble();

        double V = volumeKubus(s);
        System.out.println("Volume kubus dengan sisi "+s+" cm adalah: " + V + " cm3"); 
        double L = luasPermukaanKubus(s);
        System.out.println("Luas Permukaan kubus dengan "+s+" adalah: " + L + " cm2");
      }
}
