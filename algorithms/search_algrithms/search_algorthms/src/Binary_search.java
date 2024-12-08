public class Binary_search {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] == target) {
                return middle;
            }

            if (arr[middle] > target) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }

        return -1;

    }
}
