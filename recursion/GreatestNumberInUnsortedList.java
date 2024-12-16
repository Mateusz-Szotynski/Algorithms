public class GreatestNumberInUnsortedList {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {4, 6, 1, 0, -3, 10, 11, 90, 6};
        System.out.println(getGreatestNumberInList(arr));
    }

    private static <T extends Comparable<T>> T getGreatestNumberInList(T[] arr) {
        return greatestNumber(arr, 0, arr[0]);
    }

    private static <T extends Comparable<T>> T greatestNumber(T[] arr, int index, T max) {
        if (index == arr.length - 1) {
            return less(arr[index], max) ? max : arr[index];
        }
        max = less(arr[index], max) ? max : arr[index];
        return greatestNumber(arr, ++index, max);
    }

    private static <T extends Comparable<T>> boolean less(T val1, T val2) {
        return val1.compareTo(val2) < 0;
    }
}