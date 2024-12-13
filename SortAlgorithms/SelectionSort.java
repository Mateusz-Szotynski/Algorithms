import java.util.Arrays;

public class SelectionSort {
    public static void main(String ... args) {
        Integer[] arr = new Integer[] {6, 0, 10, 11, 2, 1, -3, -1, 0};
        showArray(arr);
        sort(arr);
        showArray(arr);
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            int minimumIndex = i;
            for (int j = i; j < arrayLength; j++) {
                if (less(array[j], array[minimumIndex])) minimumIndex = j;
            }
            swap(array, i, minimumIndex);
        }
    }

    private static <T extends Comparable<T>> boolean less(T item1, T item2) {
        return item1.compareTo(item2) < 0;
    }

    private static <T extends Comparable<T>> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static <T extends Comparable<T>> void showArray(T[] array) {
        System.out.print("[");
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        System.out.println("]");
    }
}