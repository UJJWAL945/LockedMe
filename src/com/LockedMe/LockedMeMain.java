package com.LockedMe;
import java.util.Scanner;

public class LockedMeMain {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------------");
        System.out.println("|                          WELCOME                            |");
        System.out.println("|                                                             |");
        System.out.println("|                       LockedMe.com                          |");
        System.out.println("|                                                             |");
        System.out.println("|                       Developed by                          |");
        System.out.println("|                                                             |");
        System.out.println("|                    	UJJWAL SAXENA                         |");
        System.out.println("|                                                             |");
        System.out.println("---------------------------------------------------------------");
        
        
        int ch1, ch2;
        do {
            System.out.println("Please choose one from the below options:");
            System.out.println("1. Retrieve files in ascending order");
            System.out.println("2. Add, Delete and Search a user specified file");
            System.out.println("3. Exit");
            ch1 = sc.nextInt();
            switch(ch1) {
            case 1 :
                BusinessLevelOperations retrifilesobj = new BusinessLevelOperations();
                retrifilesobj.sortingFileNames();
                System.out.println();
                System.out.println("Retrieved files in an ascending order");
                break;
            case 2 :
                do {
                    System.out.println("Please choose one from the business level operations below:");
                    System.out.println("1. Add a user specified file to the application");
                    System.out.println("2. Delete a user specified file from the application");
                    System.out.println("3. Search a user specified file from the application");
                    System.out.println("4. Return to Main Menu");
                    System.out.println("5. Quit");
                    ch2 = sc.nextInt();
                    switch(ch2) {
                    case 1 :
                    	BusinessLevelOperations addfilesobj = new BusinessLevelOperations();
                        addfilesobj.AddingFile();
                        break;
                    case 2 :
                    	BusinessLevelOperations delfilesobj = new BusinessLevelOperations();
                        delfilesobj.DeletingFile();
                        break;
                    case 3 :
                    	BusinessLevelOperations searchfilesobj = new BusinessLevelOperations();
                        searchfilesobj.SearchingFile();
                        break;
                    case 4 :
                        System.out.println("Welcome back to Main Menu");
                        break;
                    case 5 :
                        System.out.println("Thank you for using LockedMe.com.");
                        System.exit(ch2);
                    default :
                        System.out.println("Invalid choice. Please select the correct choice");
                        break;
                    }
                } while(ch2!=4);
                break;
            case 3 :
                System.out.println("Thank you for using LockedMe.com.");
                break;
            default :
                System.out.println("Invalid Choice. Please select the correct choice");
                break;
            }
        } while(ch1!=3);
    }
}


