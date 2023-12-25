/**
 * Practice_Duplicate_elemnt_Array
 */
public class Practice_Duplicate_elemnt_Array {
    public static void main(String[] args) {
        int array[]={1,1,2,2,3,3};
        int i=0;
        // int num[]=new int[array.length];
        for(int j=1;j<array.length;j++){
            if(array[i]!=array[j]){
                i++;
                array[i]=array[j];
                
            }
        }
        System.out.print(i+1);
        

        
    }

    
}