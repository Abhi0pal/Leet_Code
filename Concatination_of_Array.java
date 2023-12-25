import java.util.*;

public class Concatination_of_Array {
    public static void main(String[] args) {
        // creating Array
        int nums[]={1,2,3,4,5};
        int marks[] = new int[2*nums.length];
        
        int n=marks.length;
        int j=0;
        for(int i=0;i<marks.length;i++){
            
            if(i>=nums.length){
                marks[i]=nums[j];
                j++;

            }
            else{
                marks[i]=nums[i];
            }

        }


        
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}