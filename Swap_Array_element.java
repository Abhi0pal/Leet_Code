public class Swap_Array_element {
    public static void swap(int arr[]) {
        int temp = arr[0];

        for (int i = 0; i < arr.length - 2; i = i + 2) {
            // int j=i+1;
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        
        swap(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

        
    
}
