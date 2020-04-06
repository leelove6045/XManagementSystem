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
		System.out.print("How many times per set?");
		health.weight = input.next();
		System.out.print("How much weight will you carry?(kg) :");
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
			health=null;
			System.out.println("the Program to be edited is"+ healthId);
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
