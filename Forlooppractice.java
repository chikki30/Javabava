import java.util.Scanner;

import java.util.Scanner;

public class Forlooppractice {
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter a Number");
    int n=sc.nextInt();
    int sum=0;

    for(int i=1;i<=n;i++)
    {
        sum=sum+i;
    }

    System.out.println("Sum of " +n+ " Number is "+sum);
}