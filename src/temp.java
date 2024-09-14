import java.util.*;
public class temp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1,2,3 for celsius,farhenheit or kelvin to the other two:");
        int n=sc.nextInt();
        if(n==1)
        {
            System.out.println("CESLSIUS TO FARHENHEIT AND KELVIN");
            System.out.println("Enter temperature:");
            double t= sc.nextDouble();
            double f=(1.8*t)+32;
            double k=t+273.15;
            System.out.println("CESLSIUS TO FARHENHEIT:"+f);
            System.out.println("CESLSIUS TO KELVIN:"+k);
            
            
        }
        else if(n==2)
        {
            System.out.println("FARHENHEIT TO CELSIUS AND KELVIN");
            System.out.println("Enter temperature:");
            double t1=sc.nextDouble();
            double c=(t1-32)*0.55;
            double k1=((t1-32)*0.55)+273.15;
            System.out.println("FARHENHEIT TO CESLSIUS:"+c);
            System.out.println("FARHENHEIT TO KELVIN:"+k1);
            
            
        }
        else if(n==3)
        {
            System.out.println("KELVIN TO FARHENHEIT AND CELSIUS");
            System.out.println("Enter temperature:");
            double t2=sc.nextDouble();
            double c1=t2-273.5;
            double f1=((t2-273.5)*1.8)+32;
            System.out.println("KELVIN TO CESLSIUS:"+c1);
            System.out.println("KELVIN TO FARHENHEIT:"+f1);
            
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
        
        
        
    
        
    }
    
}