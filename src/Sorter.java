import java.util.Random;

public class Sorter {


    public int[] generateRandomArray(int size) {
        Random r = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt(1000);
        }

        return arr;
    }


    public void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }


    public void basicSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }


    public void advancedSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int m = (l + r) / 2;

        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        merge(arr, l, m, r);
    }

    private void merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];

        int i = l;
        int j = m + 1;
        int k = 0;

        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++) {
            arr[l + x] = temp[x];
        }
    }
}