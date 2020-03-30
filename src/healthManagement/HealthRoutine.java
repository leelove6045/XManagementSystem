package healthManagement;

import java.util.Scanner;

public class HealthRoutine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;
		
		while (num != 6) {
			System.out.println("*** Health Routine Management System Menu ***");
			System.out.println("1. Add Health Program");
			System.out.println("2. Delete Health Program");
			System.out.println("3. Edit Health Program");
			System.out.println("4. View Health Program");
			System.out.println("5. Show menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1 - 5:");
			num = input .nextInt();
			if (num==1) {
				addHealth();
			}
			else if (num==2) {
				deleteHealth();
			}
			else if (num==3) {
				editHealth();
			}
			else if (num==4) {
				viewHealth();
			}
			else {
				continue;
			}
		}
	}
	public static void addHealth() {
		Scanner input = new Scanner(System.in);
		System.out.print("Health Program name :");
		String ProgramName = input.next();
		System.out.print("How many sets will you do? :");
		String set = input.next();
		System.out.print("How many times per set?");
		String weight = input.next();
		System.out.print("How much weight will you carry?(kg) :");
		String breaktime = input.next();
		
	}
	public static void deleteHealth() {
		Scanner input = new Scanner(System.in);
		System.out.print("Health Program name :");
		String ProgramName = input.next();	
	}
	public static void editHealth() {
		Scanner input = new Scanner(System.in);
		System.out.print("Health Program name :");
		String ProgramName = input.next();
	}
	public static void viewHealth() {
		Scanner input = new Scanner(System.in);
		System.out.print("Health Program name :");
		String ProgramName = input.next();
	}
}