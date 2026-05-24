public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {5, 3, 1, 4, 2};

        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // find smallest element
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}