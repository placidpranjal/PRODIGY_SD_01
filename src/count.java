import java.util.*;
public class count
{
    void main()
    {char c;int v=0; int cc=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word");
        String s=sc.nextLine();
        String s1=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            c=s1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {v=v+1;
            }
            else if(c>='a'&&c<='z'){
                cc++;
            }
            }
        
                System.out.println("no. of vowels are:"+v);
                System.out.println("no. of consonants are:"+cc);
            }
        } 
        
        
        
    
