public class rough {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int result=0;
        for(int i=0;i<arr.length;i++){
            result*=10;
            result+=arr[i];
        }
        // Here is the method to find length of the Array 
        int length = (int)Math.log10(Math.abs(result)) + 1;
        result=result+1;
        System.out.print(result);

        // for(int i=0;i<5;i++){
        //     n=result%10;
        //     result=result/10;
        //     System.out.println(n);
        // }
        
    }
    
}
