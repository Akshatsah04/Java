public class third {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3, 6, 8, 10};
        int m = arr1.length, n = arr2.length;
        int[] merge = new int[m + n];

        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }
        while (i < m) {
            merge[k++] = arr1[i++];
        }
        while (j < n) {
            merge[k++] = arr2[j++];
        }
        for (int a = 0; a < merge.length; a++) {
            System.out.print(merge[a] + " ");
        }
    }
}
