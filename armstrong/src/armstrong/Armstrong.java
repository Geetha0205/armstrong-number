package armstrong;

import java.util.*;

public class Armstrong {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter a number:");
            int n=sc.nextInt();
            int r;
            int m=n;
            int sum=0;
            
            while(n>0)
            {
                r=n%10;
                sum=sum+r*r*r;
                n=n/10;
            }
            if(m==sum)
            {
                System.out.println(m+" is an Armstrong Number");
            }
            else
            {
                System.out.println( m+" is not an Armstrong Number");
            }
        
        }
    
}
