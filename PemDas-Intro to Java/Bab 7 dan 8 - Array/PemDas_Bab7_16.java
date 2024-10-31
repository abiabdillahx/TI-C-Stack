import java.util.Arrays;
import java.util.Random;

public class PemDas_Bab7_16 {

    public static void main(String[] args) {
        int arraySize = 100000;
        int min = 1;
        int max = 1000;
        int[] randomIntegers = new int[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
            randomIntegers[i] = random.nextInt((max - min) + 1) + min;
        }

        int randomKey = random.nextInt((max - min) + 1) + min;

        long startTime = System.nanoTime();
        int linearSearchResult = LinearSearch.linearSearch(randomIntegers, randomKey);
        long endTime = System.nanoTime();
        long linearSearchTime = endTime - startTime;

        if (linearSearchResult != -1) {
            System.out.println("Pencarian Linear: Elemen ditemukan pada indeks: " + linearSearchResult);
        } else {
            System.out.println("Pencarian Linear: Elemen tidak ditemukan.");
        }
        System.out.println("Waktu eksekusi untuk pencarian linear: " + linearSearchTime + " ns");

        startTime = System.nanoTime();
        Arrays.sort(randomIntegers);
        endTime = System.nanoTime();
        long sortTime = endTime - startTime;

        System.out.println("Waktu yang diperlukan untuk mengurutkan array: " + sortTime + " ns");

        startTime = System.nanoTime();
        int binarySearchResult = binarySearch(randomIntegers, randomKey);
        endTime = System.nanoTime();
        long binarySearchTime = endTime - startTime;

        if (binarySearchResult != -1) {
            System.out.println("Pencarian Biner: Elemen ditemukan pada indeks: " + binarySearchResult);
        } else {
            System.out.println("Pencarian Biner: Elemen tidak ditemukan.");
        }
        System.out.println("Waktu eksekusi untuk pencarian biner: " + binarySearchTime + " ns");
    }

    public static class LinearSearch {
        public static int linearSearch(int[] list, int key) {
            for (int i = 0; i < list.length; i++) {
                if (key == list[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}