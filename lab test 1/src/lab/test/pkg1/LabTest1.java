/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.test.pkg1;

import java.util.Scanner;

public class LabTest1 {

   
    public static void main(String[] args) 
    {   
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=sc.nextInt();
       pairqual(n);
    }
    
        
        public static void pairqual(int n)
        {
        int i,c=0,f=0,j=0,x,k,p,c1,c2;
        for(i=n;i>0;i/=10)
        {
            c++;
        }
        if(c%2!=0)
          System.out.println("Not a Valid number");
        else
        {
            for(i=(int)Math.pow(10,c/2-1);i<(int)Math.pow(10,c/2);i++)
            {
                if(n%i==0)  
                {
                   j=n/i;   
                   if(!(j>=Math.pow(10,c/2-1)&&j<Math.pow(10,c/2)))
                   
                        f=1;
                   
                   x=i*(int)Math.pow(10,c/2)+j; 
                   if(i%10==0 && j%10==0)
                   {
                      f=1;
                      break; 
                   }
                   else
                   {
                       f=0;
                       for(k=n;k>0;k/=10)
                       {
                           c1=c2=0;
                           for(p=n;p>0;p/=10)
                           {
                               if(k%10==p%10)
                                    c1++;
                           }
                           for(p=x;p>0;p/=10)
                           {
                               if(k%10==p%10)
                                    c2++;
                           }
                           if(c1!=c2)
                           {
                               f=1;
                               break;
                            }
                       }
                       if(f==0)
                           break;
                   }
                }
            }
            if(f==1)
                System.out.println("PAIR MULTIPLICATION IS NOT EQUAL TO VALUE"); 
            else
                System.out.println("PAIR MULTIPLICATION EQUAL TO VALUE "); 
        }
    }
}

