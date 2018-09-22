import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinarySolution {
    public static boolean binarySearchIterative(int[] array, int x){
        int left = 0;
        int right = array.length - 1;
        while( left <= right ){
            int mid = left + ((right - left) / 2);
            if(array[mid] == x){
                return true;
            } else if (x < array[mid]){
                return binarySearchRecursive(array, x, left, mid - 1);
            } else {
                return binarySearchRecursive(array, x, mid +1, right);
            }
        }
        return false;
    }

     public static void main(String args[]) 
    { 
        BinarySolution ob = new BinarySolution(); 
        int[] myArr = new int[]{1,2,2};

        ob.binarySearchIterative();
    }
}