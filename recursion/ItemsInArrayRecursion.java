public class ItemsInArrayRecursion {
    public static void main(String ... args) {
        Integer[] arr = new Integer[] {1, 4, 5, 6};
        System.out.println(numberOfItems(arr, 0));
    }

    private static int numberOfItems(Object[] arr, int index) {
        try {
            Object o = arr[index];
            return numberOfItems(arr, ++index);
        } catch (ArrayIndexOutOfBoundsException e) {
            return index;
        }
    }
}