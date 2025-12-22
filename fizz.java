public class fizz {
    public static void main(String[] args) {
        int n=5;
         for (int i=0;i<=n;i++){
        
        if (n%3==0){
            System.out.print("Fizz");
        }
        else if (n%5==0){
            System.out.print("Buzz");
        }
        else if(n%3==0 && n%5==0){
            System.out.print("FizzBuzz");
        }
    }
}
}
    


