import java.util.*;
public class game
{
public static void main(String[] args)
{
    
    int c=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("***GUESS GAME***");
    System.out.println("Guess a number between 1 and 10:");
    int n=sc.nextInt();
    
    while(n<0 || n>10)
    {
        System.out.println("Invalid input. Choose a number between 1 to 10.");
        n=sc.nextInt();
    }
        
    Random rand=new Random();
    int r=rand.nextInt(11);
    while(n!=r)
    {
         System.out.println("GUESS");
         n=sc.nextInt();
         
         if(n==r)
    {
    System.out.println("WON!");
    System.out.println("NUMBER OF ATTEMPTS:"+c);
    
    }
    else if(n>r)
    {
    c+=1;
    System.out.println("too high.");
    

    }
    else if(n<r)
    {
        c++;
        System.out.println("too low.");
    }
        
    }
    
    
    
   
    
    

}}
