/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_grades;

import java.util.Scanner;

class Courserade
{
   double lab,assignment,project,attendance,finalproject,attend;
   double assign[]=new double[4];
   Courserade(double assign[])
   {
       int i;
       for(i=0;i<assign.length;i++)
        {
            switch(i)
            {
                case 0:
                {
                    lab=assign[i];
                    break;
                }
                case 1:
                {
                    assignment=assign[i];
                    break;
                }   
                case 2:
                {
                    project=assign[i];
                    break;
                }   
                case 3:
                {
                    attendance=assign[i];
                    break;
                }   
                    
            }
            }
       
        
   }
   
  void setlab()
   {
       lab=(lab*10)/100;
     // System.out.println("lab"+" "+lab);

   }
   void setAssignment()
   {
        assignment=(assignment*5)/10;
       
     // System.out.println(assignment);
        
                
   }
     void setAttendance()
   {
       if(attendance<50)
       {
           System.out.println("repeat term");
           
            attend=0;
          // System.out.println(attend);
       }
       else if((attendance>=50)&&(attendance<75))
       {
           
            attend=2;
           // System.out.println(attend);
       }
        else if((attendance>=75)&&(attendance<85))
       {
           
            attend=3;
            //System.out.println(attend);
       }
        else if((attendance>=85)&&(attendance<90))
       {
           
            attend=4;
           // System.out.println(attend);
       }
        else if(attendance>=90)
       {
           
            attend=5;
           // System.out.println(attend);
       }
       
   }
    void setProject()
   {
       finalproject=project;
   }
   double result()
       {
          double sum=lab+assignment+finalproject+attend;
          return sum;
       }
   void tostring(double assign[])
   {
        int i;
       for(i=0;i<assign.length;i++)
        {
            if(i==0)
            {
                assign[i]=lab;
                
                
            }
            else if(i==1)
            {
               assign[i]=assignment;
               
            }
             else if(i==2)
            {
                assign[i]=project;
              
            }
             else if(i==3)
            {
                assign[i]=attend;
                
               
            }
        }
   }
}
/**
 *
 * @author Mahum
 */
public class courseC {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double grades[]=new double[4];
        int i=0;
        double marks=0;
        while(i<grades.length)
        {    switch(i)
           {
              case 0: System.out.println("enter lab grade out of 100");// for 10 experiment
                      grades[i]=sc.nextDouble();
                        break;
              case 1:System.out.println("enter Assignment grades out of 10");// for 2 assignment of 5 marks
                      grades[i]=sc.nextDouble();
                      break;
              case 2:System.out.println("enter mini project grades out of 5");
                      grades[i]=sc.nextDouble();
                      break;
              case 3:System.out.println("enter attendance out of 100");
                      grades[i]=sc.nextDouble();
                     
          }
           i++;
        }
        
        
       
        Courserade obj=new Courserade(grades);
        obj.setlab();
        obj.setAttendance();
        obj.setAssignment();
        obj.setProject();
       obj.tostring(grades);
        for(i=0;i<grades.length;i++)
        {
             if(i==0)
            {
                System.out.println("final lab grade:-"+grades[i]);
        
                
                
            }
            else if(i==1)
            {
               System.out.println("final assignment grade:-"+grades[i]);
        
               
            }
             else if(i==2)
            {
                System.out.println("final mini project grade:-"+grades[i]);
        
              
            }
             else
            {
                System.out.println("final attendance grades:-"+grades[i]);
         
                
               
            }
            
        }
        marks=obj.result();
      // int m=(int)marks;
       System.out.println("marks out of 25 is:-");
       System.out.println(marks);
        
              
    }
    
    
}
