package healthManagement;

import java.util.Scanner;

public class HealthRoutine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HealthManager healthManager = new HealthManager(input);
		
		int num = -1;
		while (num != 5) {
			showHealth();
			num = input .nextInt();
			switch(num) {
			case 1:
				healthManager.addHealth();
				break;
			case 2:
				healthManager.deleteHealth();
				break;
			case 3:
				healthManager.editHealth();
				break;
			case 4:
				healthManager.viewHealths();
				break;
			default:
				continue;
			}
		}
	}
	
	public static void showHealth() {
		
		System.out.println("*** Health Routine Management System Menu ***");
		System.out.println("1. Add Health Program");
		System.out.println("2. Delete Health Program");
		System.out.println("3. Edit Health Program");
		System.out.println("4. View Health Programs");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5:");
		
		
	}
}