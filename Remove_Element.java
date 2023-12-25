public class Remove_Element {
    

    public static void main(String[] args) {
        int arr[]={1,2,2,5,6,7};
        int val=2;
        // Remove_Elnt(arr,val);

        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] != val) {
                arr[count] = arr[i];
                count++;

            }
        }
        System.out.print(count+1);

    }
    public static int Remove_Elnt(int arr[], int val) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            
            if (arr[i] != val) {
                arr[count] = arr[i];
                count++;
                return count;

            }
        }
        return count;

    }
}
