package Main_System;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;
public class welcomeWindow {
	
	static ArrayList<String> al=new ArrayList<String>(); //data structure used to store files
	
	//method to store some random files in the data structure
	public static void add() {
		 al.add("Index.txt");
		 al.add("Welcome.html");
		 al.add("Animal.css");
		 al.add("Profile.md");
		 al.add("123.jpg");
		 al.add("Song1.mp");
	}
	
	//main screen method 
	public static void displayScreen() {
		System.out.println("||		'Welcome To The SimpliLearn Storage System'	  ||\n");
		System.out.println("		Application Name : File Operating System \n");
		System.out.println("	 Developers Details :Name-Janhavi Soni, EmployeeId-10823 \n\n");
		System.out.println("Main Menu : \n");
		System.out.println("1. List the Files");
		System.out.println("2. Perform Operations on Files");
		System.out.println("3. Close The Application\n");
		userInputFromMain();
		
	}
	
	//method to take input form user from Main Screen
	public static void userInputFromMain() {
		System.out.print("Enter your choice (1/2/3) : ");
		Scanner sc=new Scanner(System.in);
		String userInput=sc.nextLine();
		switch(userInput){
		case "1": listFiles();
		System.out.println();
		userInputFromMain();
		break;
		case "2": System.out.println("\nList of Operations that can be performed :\n");
		performOperations();
		break;
		case "3": System.out.println("\nApplication Closed");
		System.out.println("Thank You");
		break;
		default: System.out.println("Invalid Input!! Enter correct option. ");
				userInputFromMain();
		
		}
	}
	
	//method to list the files
	public static void listFiles() {
		
		Collections.sort(al);
		System.out.println("\nThe File present in the System are : \n");
		for(String i:al) {
			System.out.println(i);
		}
	}
	
	//method to display the operation screen
		public static void performOperations() {
			
			System.out.println("1. Add a File");
			System.out.println("2. Delete a File");
			System.out.println("3. Search a File");
			System.out.println("4. Navigate Back To Main Menu");
			System.out.println();
			userInputFromOper();
		}
	
	//method to take input form user from Operation Screen
	public static void userInputFromOper() {
		System.out.print("Enter the operation you want to perform (1/2/3/4) : ");
		Scanner sc=new Scanner(System.in);
		String userInput2=sc.nextLine();
		switch(userInput2) {
		case "1": addFile();
		System.out.println("File Added Successfully\n");
		userInputFromOper();
		break;
		case "2": deleteFile();
		userInputFromOper();
		break;
		case "3": searchFile();
		userInputFromOper();
		break;
		case "4": System.out.println("Going back to Main Menu ");
		displayScreen();
		break;
		default:System.out.println("Wrong choice Entered\n");
		userInputFromOper();
		}
	}
	
	//method to add a file from user
	public static void addFile() {
		System.out.print("\nEnter the File that has to be added : ");
		Scanner sc=new Scanner (System.in);
		String fileToAdd = sc.nextLine();
		al.add(fileToAdd);
		
	}
	
	//method to delete a file from user
	public static void deleteFile() {
		System.out.print("\nEnter the file that has to be deleted : ");
		Scanner sc=new Scanner(System.in);
		String fileToDelete=sc.nextLine();
		if(al.contains(fileToDelete)) {
			al.remove(fileToDelete);
			System.out.println("File Deleted Successfully\n");	
		}
		else{
			System.out.println("File Not Found\n");
		}
	}
	
	//method to search a file from user
	public static void searchFile() {
		System.out.print("\nEnter the name of the File that has to be Searched : ");
		Scanner sc=new Scanner(System.in);
		String fileToSearch=sc.nextLine();
		if(al.contains(fileToSearch)) {
			int indexOfFile=al.indexOf(fileToSearch)+1;
			System.out.println("File is Present in the System at "+ indexOfFile + " position\n");
		}
		else {
			System.out.println("File is not present in the System\n");
		}
	}
	
	//main method
	
	public static void main(String[] args) {
		add();
		displayScreen();
		
		
		
		
	}

}
