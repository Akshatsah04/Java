public class third {
    public static void main(String[] args){
        int[] arr1 = {1 , 2 , 3 , 4 , 5};
        int[] arr2 = {2 , 3 , 6 , 8 , 10};
        int[] merge = new int[10];

        int i=0 , j=0 , k=0 , m = arr1.length , n = arr2.length;
        while(i<m || j<n){
            if (i<m && j<n && arr1[i]>arr2[j] ){
                merge[k]=arr2[j];
                j++;
                k++;
            }else if (i<m && j<n && arr1[i]<=arr2[j]){
                merge[k]=arr1[i];
                i++;
                k++;
            } else if (i==m && j<n) {
                while(j<n){
                    merge[k]=arr2[j];
                    j++;
                    k++;
                }
            }else {
                while(i<m){
                    merge[k]=arr1[i];
                    i++;
                    k++;
                }
            }
        }

        for (int a = 0 ; a<10 ; a++){
            System.out.print(merge[a] + " ");
        }


    }
}
