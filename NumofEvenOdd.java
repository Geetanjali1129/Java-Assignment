import java.util.*;
class NumofEvenOdd
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int even_count=0;
int odd_count=0;
while(n>0)
{
int rem=n%10;
if(rem%2==0)
   even_count++;
else
   odd_count++;
n/=10;
}
System.out.println("Even count:" +even_count);
System.out.println("Odd count:" +odd_count);
}
}
