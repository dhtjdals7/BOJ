package function;

// BOJ 1596
public class SumOfNInteger {
    public static void main(String[] args){
        System.out.println(sum(new int[]{1,2,3}));
    }

    static public long sum(int[] arr){
        long sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        return sum;
    }
}
