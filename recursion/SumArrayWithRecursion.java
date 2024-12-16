

public class SumArrayWithRecursion {
    public static void main(String ... args) {
        Integer[] arr = new Integer[] {1, 8, 2};
        System.out.println(sum(arr));
        show(arr);
    }

    private static Integer sum(Integer[] arr) {
        if (arr.length == 0) return 0;
        return nextSum(arr, 0);
    }

    private static Integer nextSum(Integer[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return arr[index] + nextSum(arr, ++index);
    }

    private static void show(Integer[] arr) {
        for(Integer e : arr) {
            System.out.print(e + " ");
        }
    }
}