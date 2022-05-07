package com.demo;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

public class MainProjectUpload {

	
 public static void add() throws IOException
 {
	 System.out.println("Enter your file name");
	 Scanner s1 = new Scanner(System.in);
	 String p = s1.nextLine();
	 
	 File f11 = new File("C:\\Users\\Vishnu Avtar\\Desktop\\Project\\"+p);
	 
	 if(f11.createNewFile())
		 System.out.println("File is created");
	 else
		 System.out.println("File is alredy exist");
 }
 
 
 
 public static void delete()
 {
	 System.out.println("Enter file name which you want to delete..Example :- abc.txt");
	 Scanner s2 = new Scanner(System.in);
	 String p2 = s2.nextLine();
      
	 File f12 = new File("C:\\Users\\Vishnu Avtar\\Desktop\\Project\\"+p2);	
	 
	 if(f12.delete())
		 System.out.println("File is deleted");
	 else
		 System.out.println("File is not deleted or file is not found");
 }
 
 
 
 public static void search()
 {
	 System.out.println("Enter your file name to search");
	 Scanner s3 = new Scanner(System.in);
	 String p3 = null;
	 p3 = s3.nextLine();
	 File f13 = new File("C:\\Users\\Vishnu Avtar\\Desktop\\Project\\"+p3);
	 if( f13.exists())
	 {
		System.out.println("File is available"); 
	 }
	 else 
		 System.out.println("File is not available");
 }
 
 
 
 public static void accendingorder()
 {
	//write logic to get the files names and arrange them in ascending order
		
		File dir = new File("C:\\Users\\Vishnu Avtar\\Desktop\\Project");
	    if(dir.isDirectory())
	    {
	      // This is through fetching the file from list the directory
	      File[] files = dir.listFiles();

	      System.out.println("All the files including folders");
	      System.out.println("@@@--------------------------------@@@");
	   
	   

	      // This is through sort files by name
	      Arrays.sort(files, new Comparator()
	      {
	        @Override
	        public int compare(Object f1, Object f2) {
	          return ((File) f1).getName().compareTo(((File) f2).getName());
	        }
	      });

	      // This is through print the file name in accending order.
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("\nAfter sorting by name");
	      System.out.println("|||----------------------------------|||");

	      // This is through Sort files by size.
	      Arrays.sort(files, new Comparator()
	      {
	        @Override
	        public int compare(Object f1, Object f2)
	        {
	          if (((File) f1).length() < ((File) f2).length())
	          {
	            return -1;
	          }
	          else if (((File) f1).length() > ((File) f2).length())
	          {
	            return 1;
	          }
	          else
	          {
	            return 0;
	          }
	        }
	      });

	      //By this Prints files in order by file size
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("\nAfter sorting by length");
	      System.out.println("<<<------------------------------->>>");

	      
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("-------------------------");
	      System.out.println("-------------------------");
	    }
		
 }
 

 public static void main(String[] args) throws IOException {
	 
	 System.out.println("\n**************** Welcome to Lockedme.com ***********************\n");
	    System.out.println("Application Name: Virtual Key \n");
	    System.out.println("*****----->>>Developer Details----->>>*******\n");
	    System.out.println("Name: Vishnu Avtar\r\n"
	    		+ "Designation: Software Developer\r\n"
	    		+ "Date: 05-05-2022");
	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		while(true)
		{
			System.out.println("\nThis is the main menu of the application-- Select any option which you want perform.");
			System.out.println("\nEnter 1 : get file names in ascending order");
			System.out.println("Enter 2:  for Business Level Operation");
			System.out.println("Enter 3: Close the Application");

			System.out.println("Enter your choice");
			
			Scanner v = new Scanner(System.in);
			
			int option= v.nextInt();

			if(option==1)
			{
				accendingorder();
			}

			else if(option ==2)
			{
				System.out.println("This is sub menu of the main menu which performs Business level operations. ");
				System.out.println("\n--->Select Any one to perform business levele operations");
				System.out.println("\nEnter 1 : add file");
				System.out.println("Enter 2:  delete file");
				System.out.println("Enter 3:  search file");
				System.out.println("Enter 4:  go back");
				
				System.out.println("Enter your choice :- ");
				
				int input = v.nextInt();
				
				switch(input)
				{
				
				case 1: {	add();  break;  }
					
			    case 2: { delete(); break;  }
				
				case 3: { search(); break;  }
				
				case 4: {  System.out.println("Back is Successful"); break;  }
					   
		     }
		 }
			
			else if(option == 3 )	
			{ 	 System.out.println("Your exit are successfully ");	
			     System.out.println("If you want to perform all the task again then you run the program again ");
				 System.exit(option); 
			}
			
			else
			{
				System.out.println("Please Enter valid Choice");
			}
}
				
}
	}