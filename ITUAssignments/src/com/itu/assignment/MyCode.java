package com.itu.assignment;
import javax.swing.JOptionPane;

public class MyCode {

       public static void main(String[] args)
       {
               String Username, Password,input="a";
               int[] BookCount = new int[5];
               String[] BookNames= new String[5];
               BookNames[0]="JAVA";
               BookNames[1]="PYTHON";
               BookNames[2]="JAVASCRIPT";
               BookNames[3]="PHP";
               BookNames[4]="RUBY";
               BookCount[0] = 5;
               BookCount[1] = 5;
               BookCount[2] = 5;
               BookCount[3] = 5;
               BookCount[4] = 5;
               int x = 0;
               while(x != 1)
               {
                       Username =JOptionPane.showInputDialog(null,"please enter Username");
                       Password = JOptionPane.showInputDialog(null,"please enter Password");
                       x = Authenticate(Username, Password);
                       if(x==1)
                       {                           
                         while(!input.equals("Q"))
                         {
                        
                             input=JOptionPane.showInputDialog(null,
                                     "Enter Options as below\n"+
                                             "V- To view the stock \n"+
                                             "B- To Borrow the book \n"+
                                             "R - To return the book \n"+
                                             "Q - To exit from the application");
                             if(input.equals("V"))
                                 ViewCount(BookCount,BookNames);
                             if(input.equals("B"))
                             {
                                 BorrowBook(BookCount,BookNames);
                                 ViewCount(BookCount,BookNames);
                             }
                             if(input.equals("R"))
                             {    
                                 ReturnBook(BookCount,BookNames);
                                 ViewCount(BookCount,BookNames);
                             }
                             }
                             
                         }
                 }
                                        
                           
  }
       
       
       public static int Authenticate(String Username1, String Password1)
       {
               int a;
               String MyUserName;
               String MyPassword;
               MyUserName = "student_2";
               MyPassword = "ituOfsanjose";
               
               if(MyUserName.equals(Username1) && MyPassword.equals(Password1) )
               a= 1;
               else
               a= 0;
                
               return a;
       }
       
       
       public static void ViewCount(int[] ViewC,String[] BookNm)
       {
           
    	   JOptionPane.showMessageDialog(null, " Number of " + BookNm[0] + "books available are " + ViewC[0] + " Borrowed Books are "+ (5-ViewC[0]) +
    			   "\n Number of"+ BookNm[1] + "books available are " + ViewC[1]+ " Borrowed Books are "+ (5-ViewC[1])
    			   + "\n Number of " + BookNm[2] + "books available are " + ViewC[2]+ " Borrowed Books are "+ (5-ViewC[2])
    					   + "\n Number of " + BookNm[3] + "books available are " + ViewC[3]+ " Borrowed Books are "+ (5-ViewC[3])
    							   + "\n Number of " + BookNm[4] + "books available are " + ViewC[4] + " Borrowed Books are "+ (5-ViewC[4]));
       }
       
       
       public static void BorrowBook(int[] BorrowCount,String[] BorrowNm)
       {
           String choice;
           choice =JOptionPane.showInputDialog(null," Below books are available \n"+
           "JAVA \n"+
                   "PYTHON \n" +
           "JAVASCRIPT \n"+
                   "PHP \n"+
           "RUBY \n"+
                   "Enter the Name of the book to borrow");
                     
           for (int i=0; i<BorrowCount.length; i++)
           {
               if(choice.equals(BorrowNm[i]))
               {
                 if(BorrowCount[i]==0)
                     JOptionPane.showMessageDialog(null, "Books not available to borrow, Enter a valid value on the next selection");
                 else
                   BorrowCount[i]=BorrowCount[i]-1;
               }
               
           }
       }
       
       
       public static void ReturnBook(int[] ReturnCount,String[] ReturnNm)
       {
           
           String choice;
           choice =JOptionPane.showInputDialog(null," Enter the name of the book from below to return \n"+
           "JAVA \n"+
                   "PYTHON \n" +
           "JAVASCRIPT \n"+
                   "PHP \n"+
           "RUBY"
                   );
                     
           for (int i=0; i<ReturnCount.length; i++)
           {
               if(choice.equals(ReturnNm[i]))
               {
                   if(ReturnCount[i]==5)
                       JOptionPane.showMessageDialog(null, "Invalid Return,Enter a valid input on the next selection");
                   else
                   ReturnCount[i]=ReturnCount[i]+1;
               }
           }
       }
       
}