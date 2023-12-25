public class Practice_Two_Sum {

    public static void main(String[] args) {
        int array[] = { 4, 7, 2, 15 };
        int arr[] = new int[2];
        int target = 9;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] + array[j] == 9 & i != j) {
                    arr[0] = i;
                    arr[1] = j;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);

        }

    }

}
