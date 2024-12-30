public class App {
    public static void main(String[] args) throws Exception {

        // // Selection Sort
        // System.out.println("*********** Selection Sort ***********");
        // int[] arr = { 64, 25, 12, 22, 11 };
        // SelectionSort.selectionSort(arr);

        // System.out.println("\n");

        // Selection Sort
        System.out.println("*********** Burble Sort ***********");
        int[] arr2 = { 64, 25, 12, 22, 11 };
        Burble_sort.sort_burble(arr2);
        Burble_sort.printArr(arr2);

    }

}
