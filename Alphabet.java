import java.util.*;
class Alphabet
{
public static void main(String args[])
{
boolean isVowel=false;
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
switch(ch)
{
case 'a' :
case 'e' :
case 'i' :
case 'o' :
case 'u' :
case 'A' :
case 'E' :
case 'I' :
case 'O' :
case 'U' : isVowel = true;
}
if(isVowel == true)
{
  System.out.println(ch+ "is a vowel");
}
else
 {
	   if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println(ch+" is a Consonant");
	   else
		System.out.println("Input is not an alphabet");		
        }
}
}
