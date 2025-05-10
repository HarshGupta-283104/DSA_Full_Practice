public class MaxMinimaSearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        int max = arr[0];
        for (int i = 0; i<arr.length ; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println("The maximum element in the array is: " + max);
        int min = arr[0];   
        for (int i = 0; i<arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("The minimum element in the array is: " + min);


    }
}