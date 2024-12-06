import java.util.Scanner;

public class Soal1GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int Nilai = input.nextInt();

        if (Nilai % 2 == 1) {
            System.out.println(Nilai + " = Bilangan ganjil");  
        } else {
            System.out.println(Nilai + " = Bilangan genap");
        }
    }
}
