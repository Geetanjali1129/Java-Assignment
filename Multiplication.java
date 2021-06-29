import java.io.*;
import java.util.*;

public class Multiplication {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();
        
        for(int i = 1; i <= 10; i++)
        {
            int answer = input*i;
            System.out.println(input + " x " + i + " = " + answer);
        }
    }
}