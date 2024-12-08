public class SelectionSort {
    // 0, 1, 2, 3, 4, 5
    // [30,44,23,54,22,11]
    // minIndex: 0

    public static void selectionSort(int[] a) {
        for (int j = 0; j < a.length; j++) {
            int minimumIndex = j;
            for (int i = j + 1; i < a.length; i++) {
                if (a[i] < a[minimumIndex]) {
                    minimumIndex = i;
                }
            }

            if (minimumIndex != j) {
                int temp = a[j];
                a[j] = a[minimumIndex];
                a[minimumIndex] = temp;
            }
        }

        printArr(a);
    }

    public static void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
