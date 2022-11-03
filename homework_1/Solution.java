
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] big = new int[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < big.length; i++)
        {
            String str = reader.readLine();
            big[i] = Integer.parseInt(str);
        }
        
        int[] small1 = new int[10];
        int[] small2 = new int[10];
        
        for (int j = 0; j < big.length; j++)
        {
            if (j < big.length/2) 
            {
                small1[j] = big [j];
            }else{
                small2[j - (small2.length)] = big[j];
                
            }
        }
        
        for (int k = 0; k < small2.length; k++)
        {
            System.out.println(small2[k]);
        }
        
        
    }
}
