public class App {
    public static void main(String[] args) throws Exception {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 32;

        int index = Binary_search.search(arr, target);
        System.out.println(index);
    }
}
