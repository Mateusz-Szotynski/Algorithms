
import javax.naming.directory.InvalidAttributesException;

public class BinarySearch {
    public static void main(String ... args) throws InvalidAttributesException {
        if (args.length != 1) {
            throw new InvalidAttributesException("Usage: ./BinarySearch [keyNumberToSearch]");
        }
        int keyNumber = Integer.parseInt(args[0]);
        Integer[] arr = new Integer[] {1, 2, 3, 4, 5, 6, 10, 11, 18, 20, 21, 28, 32, 64, 128};
        System.out.println(search(arr, keyNumber));
    }

    public static <T extends Comparable<T>> int search(T[] arr, T key) {
        int tries = 0;
        int low = 0;
        int high = arr.length;
        while (low <= high) {
            tries++;
            int middleIndex = (low + high) / 2;
            T middleItem = arr[middleIndex];
            if (less(middleItem, key)) low = middleIndex + 1;
            else if (less(key, middleItem)) high = middleIndex - 1;
            else {
                System.out.println("Number of tries: " + tries);
                return middleIndex;
            }
        }
        return -1;
    }

    private static <T extends Comparable<T>> boolean less(T item1, T item2) {
        return item1.compareTo(item2) < 0;
    }
}