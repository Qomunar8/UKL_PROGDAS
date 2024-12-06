import java.util.Scanner;

public class Soal2KuisMTK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[][] soal = {
                {6, '*', 6},
                {8, '/', 2},
                {15, '%', 4},
                {7, '*' ,3},
                {2, '/' ,5}
        };

        int benar = 0, salah = 0, i = 0;

        while (true) {  

            int bil1 = soal[i][0];
            char operator = (char) soal[i][1];
            int bil2 = soal[i][2];

            System.out.print(bil1 + " " + operator + " " + bil2 + " = ");
            int jawabanBenar = hitung(bil1, bil2, operator);
            int jawabanUser = scanner.nextInt();

            if (jawabanUser == jawabanBenar) {
                System.out.println("Jawabanmu benar");
            } else {
                System.out.println("Jawabanmu salah, Ini jawaban yang benar: " + jawabanBenar);
            }
            System.out.print("Apakah kamu ingin melanjutkan kuis (ya/tidak): ");
            String lanjut = scanner.next();

            if (lanjut.equalsIgnoreCase("tidak")) {
                System.out.println("Terimakasih sudah mengerjakan kuis ini");
                break;
            }
        }  
    }
    static int hitung(int bil1, int bil2, char operator) {
        switch (operator) {
            case '*':
                return bil1 * bil2;
            case '/':
                return bil1 / bil2;
            case '%':
                return bil1 % bil2;
            default:
               return 0;
        }
    }
}
