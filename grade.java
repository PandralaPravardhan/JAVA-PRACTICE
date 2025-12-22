import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int sum=a+b+c+d+e;
    
    if(sum>=450){
        System.out.println("Your grade is O");
    }

    else if (sum <450 && sum>400){
        System.out.println("Your grade is A");
    }
    else if (sum < 400 && sum > 350){
        System.out.println("Your grade is B");
    }
    else if(sum < 350 && sum > 300)
        {System.out.println("Your grade is C");
    
    }
    else if (sum < 300 && sum < 250)
    {
        System.out.println("Your Grade is F😭😭");
    }
}
}