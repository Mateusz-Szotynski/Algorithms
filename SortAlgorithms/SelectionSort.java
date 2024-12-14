import java.util.Arrays;

public class SelectionSort {
    public static void main(String ... args) {
        Integer[] arr = new Integer[] {5, 7, 1, 3, 0, -3, 1, 5, 10};
        sort(arr);
        showArray(arr);
    }

    public static <T extends Comparable<T>> void sort(T[] arr) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            int minIndex = i;
            T minValue = arr[minIndex];
            for (int j = i + 1; j < arrLength; j++) {
                if (less(arr[j], minValue)) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
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