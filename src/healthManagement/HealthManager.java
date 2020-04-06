package healthManagement;

import java.util.Scanner;

public class HealthManager {
	Health health;
	Scanner input;
	
	HealthManager (Scanner input){
		this.input = input;
	}
	
	public void addHealth() {
		health = new Health();
		System.out.print("Health Program name :");
		health.ProgramName = input.next();
		System.out.print("What is your member ID? :");
		health.id = input.nextInt();
		System.out.print("How much weight will you carry?(kg)");
		health.weight = input.next();
		System.out.print("How much break time do you need? :");
		health.breaktime = input.next();
		
	}
	public void deleteHealth() {
		System.out.print("What is your member ID :");
		int healthId = input.nextInt();	
		if (health == null) {//생성 되어 있는지 아닌지 확인
			System.out.println("the Program has not been registered");
			return;
		}
		if (health.id == healthId) {
			health=null;
			System.out.println("the Program is deleted");
		}
	}
		
	public void editHealth() {
		System.out.print("What is your member ID :");
		int healthId = input.nextInt();
		if (health.id == healthId) {
			int num = -1;
		
			while (num != 5) {
				System.out.println("** Health Info Edit Menu **");
				System.out.println("1. Edit Program Name");
				System.out.println("2. Edit Member Id");
				System.out.println("3. Edit weight");
				System.out.println("4. Edit break time");
				System.out.println("5. Exit");
				System.out.println("Select one number between 1 - 5:");
				num = input .nextInt();
				if (num==1) {
					System.out.print("Health Program name :");
					health.ProgramName = input.next();
				}
				else if (num==2) {
					System.out.print("What is your member ID? :");
					health.id = input.nextInt();
				}
				else if (num==3) {
					System.out.print("How much weight will you carry?(kg)");
					health.weight = input.next();
				}
				else if (num==4) {
					System.out.print("How much break time do you need? :");
					health.breaktime = input.next();
				}
				else {
					continue;
				}
			}
		}
	}
	public void viewHealth() {
		System.out.print("What is your member ID :");
		int healthId = input.nextInt();
		if (health.id == healthId) {
			health.printInfo();
		}
	}

}
