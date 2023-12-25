public class merge_sorted_array {
    public static void main(String[] args) {
        int num1[] = { 1, 2, 3 };
        int num2[] = { 2, 5, 6, 4 };
        int m = num1.length;
        int n = num2.length;
        int num3[] = new int[m + n];
        int j = 0;
        for (int i = 0; i < num3.length; i++) {
            if (i >= m) {
                num3[i] = num2[j];
                j++;
            } else {
                num3[i] = num1[i];
            }
        }
        for (int i = 0; i < num3.length; i++) {
            for(int k=i+1;j<num3.length;k++){
                 if (num3[i] >= num3[k]) {
                    num3[i] = num3[k];
                }
            }
        }
            

            // for(int i=0;i<num3.length;i++){
            // if(num3[i]==0){
            // continue;
            // }
            // else{
            // System.out.print(num3[i]);

            // }

            // }
        

    }
}
