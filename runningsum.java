import java.util.ArrayList;
class runningsum {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        int[] arr ={1,2,3,4};
        int sum=0;
        for (int i=0;i<arr.length;i++){
             sum=sum+arr[i];
             a.add(sum);
        }

        System.out.println(a);
    }
}