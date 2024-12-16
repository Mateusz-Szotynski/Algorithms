import java.util.Arrays;
public class QuickSort2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[] {0, 9, 1, 10, 23, -1, 9, 76, 101, 66, 30, 33, 12};
        quickSort(array, 0, array.length - 1);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    private static <T extends Comparable<T>> void quickSort(T[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) return;
        int pivotIndex = partition(array, lowIndex, highIndex);
        quickSort(array, lowIndex, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, highIndex);
    }

    private static <T extends Comparable<T>> int partition(T[] array, int lowIndex, int highIndex) {
        T pivot = array[highIndex];
        int i = lowIndex - 1;
        for (int j = lowIndex; j < highIndex; j++) {
            if (greater(pivot, array[j])) {
                i++;
                swap(array, i, j);
            }
        }
        i++;
        swap(array, i, highIndex);
        return highIndex;
    }

    private static <T extends Comparable<T>> boolean greater(T value1, T value2) {
        return value1.compareTo(value2) > 0;
    }

    private static <T extends Comparable<T>> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}