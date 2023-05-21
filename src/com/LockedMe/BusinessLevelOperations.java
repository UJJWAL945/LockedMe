package com.LockedMe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BusinessLevelOperations {

	   Scanner sc = new Scanner(System.in);

	    protected void sortingFileNames() {

	        System.out.println("Enter a path");
	        String path = sc.nextLine();

	        File file = new File(path);
	        File[] files = file.listFiles();
	        Arrays.sort(files);

	        if(files.length>0) {
	            System.out.println("Files are : ");
	            for(File f : files) {	
	                System.out.println(f.getName());
	            }
	        } else
	            System.out.println("The root directory is empty");
	    }

	    protected void AddingFile() {

	        System.out.println("Enter name of the file to be added with path : ");
	        String fileName = sc.nextLine();

	        try {
	            File file = new File(fileName);
	            FileOutputStream fos = new FileOutputStream(fileName);
	            System.out.println("Enter content to be entered in the file : ");
	            String content = sc.nextLine();
	            byte[] b = content.getBytes();
	            fos.write(b);
	            fos.close();
	            System.out.println("'" + file.getName() + "'" + " file is added to the directory");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	    }

	    protected void DeletingFile() {

	        System.out.println("Enter name of the file to be deleted with path : ");
	        String fileName = sc.nextLine();
	        try {
	        	File file = new File(fileName);
	          
	                if(file.isDirectory()) {
	                    System.out.println(file.getName() + " is a directory");
	                } else if(file.delete()) {
	                    System.out.println("'" + file.getName() + "'" + " file is deleted successfully");
	                } else
	                    System.out.println("'" + file.getName() + "'" + " file deletion failed");
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    void SearchingFile() {

	        System.out.println("Enter the directory path: ");
	        String path = sc.nextLine();
	        System.out.println("Enter the desired file name with extension: ");
	        String fileName = sc.nextLine();
	        File file = new File(path);
	        String[] list = file.list();
	        boolean flag = false;
	            for (int i = 0; i < list.length; i++) {
	                if(fileName.equals(list[i])) {
	                    flag = true;
	                }
	            }

	            if(flag)
	                System.out.println("File Found");
	            else
	                System.out.println("File Not Found");
	    }

	}

