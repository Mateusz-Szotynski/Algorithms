import java.util.Arrays;

public class InsertionSort {
    public static void main(String ... args) {
        Integer[] arr = new Integer[] {6, 9, 1, 2, 3, 10, 11, -2, 0};
        showArray(arr);
        sort(arr);
        showArray(arr);
    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        int arrSize = arr.length;
        for (int i = 1; i < arrSize; i++) {
            for (int j = i; j > 0 && less(arr[j], arr[j - 1]); j--) swap(arr, j - 1, j);
        }
    }

    private static <T extends Comparable<T>> boolean less(T item1, T item2) {
        return item1.compareTo(item2) < 0;
    }

    private static <T extends Comparable<T>> void swap(T[] arr, int index1, int index2) {
        T temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static <T extends Comparable<T>> void showArray(T[] arr) {
        Arrays.stream(arr).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }
}