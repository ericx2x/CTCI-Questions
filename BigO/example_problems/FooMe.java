public class FooMe{
    static String foo(int[] array){
        int sum = 0;
        int product = 1;
        for (int i = 0 ; i < array.length ; i++){
            sum += array[i];
        }
        for (int i = 0; i < array.length ; i++){
            product *= array[i];
        }
        return(sum + ", " + product);
    }
    
    public static void main(String []args){
        int[] myArr = new int[]{1,2,2};
        System.out.println(FooMe.foo(myArr));
    }
}
