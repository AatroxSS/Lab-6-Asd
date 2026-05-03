class MergeSorter {

    public static void sortDescending(int[] array) {
        if (array == null || array.length <= 1) return;
        int[] auxiliary = new int[array.length];
        sortDescending(array, auxiliary, 0, array.length - 1);
    }

    private static void sortDescending(int[] array, int[] auxiliary, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        sortDescending(array, auxiliary, left, mid);
        sortDescending(array, auxiliary, mid + 1, right);
        mergeDescending(array, auxiliary, left, mid, right);
    }

    private static void mergeDescending(int[] array, int[] auxiliary, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            auxiliary[i] = array[i];
        }

        int i = left;
        int j = mid + 1;
        int k = left;
        
        while (i <= mid && j <= right) {
            if (auxiliary[i] >= auxiliary[j]) {
                array[k++] = auxiliary[i++];
            } else {
                array[k++] = auxiliary[j++];
            }
        }
        
        while (i <= mid) {
            array[k++] = auxiliary[i++];
        }
        while (j <= right) {
            array[k++] = auxiliary[j++];
        }
    }
}
