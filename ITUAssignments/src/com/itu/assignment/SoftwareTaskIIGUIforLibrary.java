package com.itu.assignment;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class SoftwareTaskIIGUIforLibrary {

	  static int[] initialBookCountForEachTitle = {5,5,5,5,5};
	  static int[] availableCountForEachTitle = {5,5,5,5,5};

	    public static void main (String args[])
	    {       
	        JTextField username = new JTextField();
	        JTextField password = new JPasswordField();
	        Object[] message = {  "Username:", username,  "Password:", password };
	        
	        String enter;
	        
	        
	        //User Authentication
	        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
	        
	        if (option == JOptionPane.OK_OPTION) 
	        {
	            if (username.getText().equals("student") && password.getText().equals("ituOfsanjose")) 
	            {
	                JOptionPane.showMessageDialog(null,"Login successful");
	                //Asking user to continue program
	                enter=JOptionPane.showInputDialog(null,ShowStatusWithPrompt());
	                
	                while ( !enter.toLowerCase().equals("q"))
	                {
	                    if(enter.toLowerCase().equals("r") || enter.toLowerCase().equals("b"))
	                    {
	                        String enterCode = "";
	                        enterCode=JOptionPane.showInputDialog(null,GetCodeMessagePrompt());
	                        
	                        //Without Switch
	                        //Remove one of this delete this block if you want with switch
	                        int codeValueEntered =IntegerValue(enterCode);
	                        if(codeValueEntered > 0 && codeValueEntered <=5)
	                        {
	                            JOptionPane.showMessageDialog(null,UpdateCount("Java",codeValueEntered,enter.toUpperCase()));
	                        }
	                        else
	                        {
	                            JOptionPane.showMessageDialog(null, "Wrong code please try again!");
	                        }
	                    }
	                    else
	                    {
	                        JOptionPane.showMessageDialog(null, "Wrong option please try again!");
	                    }
	                    
	                    enter=JOptionPane.showInputDialog(null,ShowStatusWithPrompt());
	                    if(enter.toLowerCase().equals("q"))
	                    {
	                        //System.exit(0);
	                        continue;
	                    }
	                }
	            } 
	            else 
	            {
	                JOptionPane.showMessageDialog(null,"login failed");
	            }
	        } 
	        else 
	        {
	            JOptionPane.showMessageDialog(null,"Login canceled");
	        }
	    }
	    
	    
	    public static String UpdateCount(String title, int code, String borrowedReturned)
	    {
	        code = code -1;
	        if(borrowedReturned.equals("B"))
	        {
	            if(availableCountForEachTitle[code]>0)
	            {
	                availableCountForEachTitle[code] = availableCountForEachTitle[code]  -1;
	                return  title + " book succesfully borrowed";
	            }
	            else
	            {
	                return title +  " book is not available to borrow";     
	            }
	        }
	        else
	        {
	            if(availableCountForEachTitle[code]< 3)
	            {
	                availableCountForEachTitle[code] = availableCountForEachTitle[code]  + 1;
	                return  title + " book succesfully returned";
	            }
	            else
	            {
	                return title + " book is already full in stock. worng command.";
	            }
	        }
	    }
	    public static String ShowStatusWithPrompt()
	    {
	        return "Welcome to book Titles...\n" +
	        "______________________________________________\n" +
	          "\nCode:1 Title: JAVA Available: " + availableCountForEachTitle[0] + " Borrowed: " + (initialBookCountForEachTitle[0] - availableCountForEachTitle[0]) 
	        + "\nCode:2 Title: Python Available: " + availableCountForEachTitle[1] + " Borrowed: " + (initialBookCountForEachTitle[1] - availableCountForEachTitle[1]) 
	        + "\nCode:3 Title: JavaScript Available: " + availableCountForEachTitle[2] + " Borrowed: " + (initialBookCountForEachTitle[2] - availableCountForEachTitle[2]) 
	        + "\nCode:4 Title: PHP Available: " + availableCountForEachTitle[3] + " Borrowed: " + (initialBookCountForEachTitle[3] - availableCountForEachTitle[3]) 
	        + "\nCode:5 Title: Ruby Available: " + availableCountForEachTitle[4] + " Borrowed: " + (initialBookCountForEachTitle[4] - availableCountForEachTitle[4])
	        + "\n\nEnter R to return the book and B to borrow the book or Q to exit."
	        + "\n";

	  

	    }
	    
	    public static int IntegerValue(String s) {
	        int number;
	        try { 
	            number = Integer.parseInt(s); 
	        } catch(NumberFormatException e) { 
	            return 0; 
	        }
	        // only got here if we didn't return false
	        return number;
	    }
	    
	}