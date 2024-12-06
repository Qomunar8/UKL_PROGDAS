import java.util.Scanner;

public class Soal2VTabung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jari-jari: ");
        double jariJari = input.nextDouble();
        System.out.println("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        double volume = volumetabung(jariJari, tinggi);
        System.out.println("volume tabung: " +volume); 
        double luas = luaslingkaran(jariJari);
        System.out.println("luas lingkaran: " +luas);

        
    }
            public static double volumetabung(double r, double t) {
            double phi = 3.14;
            double volume = phi* r *r * t;
            return volume;
            }

            public static double luaslingkaran(double r){
            double phi = 3.14;
            double luas = phi* r* r;
            return luas;
            }
            
}
