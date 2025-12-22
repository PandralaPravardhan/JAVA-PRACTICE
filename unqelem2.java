public class unqelem2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,9,9,9,0};
        for (int i=0;i<nums.length;i++){
            boolean repeat=false;
            for (int j=0;j<i;j++){
                if (nums[i]==nums[j]){
                     repeat=true;
                    break;

                }
            }
            if (!repeat){
                System.out.println(nums[i]+ " ");
            }
            

        }


    }
    
}
