import java.util.*;

public class practice {

    // concatination of Array
    // public static void main(String[] args) {
    // // creating Array
    // int nums[]={1,2,3,4,5};
    // int marks[] = new int[2*nums.length];

    // int n=marks.length;
    // int j=0;
    // for(int i=0;i<marks.length;i++){

    // if(i>=nums.length){
    // marks[i]=nums[j];
    // j++;

    // }
    // else{
    // marks[i]=nums[i];
    // }

    // }

    // for(int i=0;i<marks.length;i++){
    // System.out.println(marks[i]);
    // }
    // System.out.println(marks.length);
    // Scanner sc = new Scanner(System.in);
    // for (int i = 0; i < marks.length; i++) {
    // marks[i] = sc.nextInt();
    // }
    // for(int i=0;i<marks.length;i++){
    // System.out.print(marks[i]);
    // }

    // update an array

    // int marks[]={1,2,3,4,5};
    // update(marks);
    // println(marks);

    // }
    // public static void update(int marks[]){
    // for(int i=0;i<marks.length;i++){
    // marks[i]=marks[i]+1;
    // }
    // }
    // public static void println(int arr[]){
    // for(int i=0;i<arr.length;i++){
    // System.out.print(arr[i]);

    // }

    // Linear Search

    // int key = 66;
    // int index=linear(arr, key);
    // if(index==-1){
    // System.out.print("Not Found");
    // }
    // else{
    // System.out.print("Found"+(index+1));
    // }
    // }

    // public static int linear(int arr[], int key) {
    // for (int i : arr) {
    // if (arr[i] == key) {
    // return i;
    // }
    // }
    // return -1;

    // int arr[] = { 1, 200, 30, 4,40};

    // int largest = Integer.MIN_VALUE;
    // for (int i=0;i<arr.length;i++) {
    // if (arr[i] > largest) {
    // largest = arr[i];
    // }

    // }
    // System.out.print(largest);

    // int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

    // swap(arr);

    // for (int i = 0; i < arr.length; i++) {
    // System.out.println(arr[i]);
    // }
    public static void main(String[] args) {
        // int num1[] = { 1, 2, 3, 4, 5, 6 };
        // int num2[]=new int[num1.length];
        // int i=0;
        // int k=0;
        // int j=num1.length/2;
        // while(k<num1.length){
        // num2[k++]=num1[i++];
        // num2[k++]=num1[j++];
        // }
        // for(int p=0;p<j-1;p++){
        // System.out.print(num2[p]+", ");

        // }

        // System.out.println(k++);
        // System.out.print(k++);
        // int sum=0;
        // int runningsum[]=new int[num1.length];
        // for(int i=0;i<num1.length;i++){
        // sum=sum+num1[i];
        // runningsum[i]=sum;
        // }
        // for(int j=0;j<runningsum.length;j++){
        // System.out.println(runningsum[j]);}
        // }
        boolean n = false;
        int l = 3;
        int num[] = {2,3,5,1,3};
        boolean array[] = new boolean[num.length];
        
       
        for(int i=0;i<num.length;i++){
             boolean flag =true;
            int sum = 0;
            sum=num[i]+l;
            for(int j=0;j<num.length;j++){
                if(sum>=num[j]){
                    array[i]=flag;
                }
                else{
                    flag=false;
                    array[i]=flag;
                    break;
                }


            }


        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);

        }

       
    }
}
