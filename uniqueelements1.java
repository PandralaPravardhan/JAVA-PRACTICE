import java.util.HashSet;
public class uniqueelements1 {
    public static void main(String[] args) {
        HashSet<Integer> nums=new HashSet<>();
        int[] arr={1,2,3,4,5,6,6,6,7,7,8,9,0,0};
        int a=arr.length;
        for(int i=0; i<a; i++)
        {
            System.out.println(arr[i]);
            nums.add(arr[i]);
        }
        System.out.println(a);
        System.out.println(nums);


    }
} 