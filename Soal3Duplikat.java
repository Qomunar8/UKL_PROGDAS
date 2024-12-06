public class Soal3Duplikat {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 6, 7, 2, 3, 8};

        boolean Duplikat = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Array memiliki elemen duplikat: " + array[i]);
                    Duplikat = true;
                    break;
                }
            }
        
        }
        if (!Duplikat) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }
    }   
}

