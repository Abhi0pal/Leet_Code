public class Two_Sum {
    // 1. brute force: O(n^2) time, O(1) space
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int target=9;
        System.out.print(two_sum(arr, target));

        
    }
    public static int[] two_sum(int arr[],int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;i<arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    return new int[] {i,j};

                }
            }
        }
        return null;
    }
    
}
