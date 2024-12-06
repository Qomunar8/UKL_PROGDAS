import java.util.Arrays;

public class Soal3Frekuensi {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};

        int Angka = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                Angka++;
            } else {
                System.out.println(array[i - 1] + " muncul " + Angka + " kali");
                Angka = 1;
            }
        }
        System.out.println(array[array.length - 1] + " muncul " + Angka + " kali");
    }
}








