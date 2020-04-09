package healthManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class HealthManager {
	ArrayList<Health> healths = new ArrayList<Health>();
	Scanner input;
	
	HealthManager (Scanner input){
		this.input = input;
	}
	
	public void addHealth() {
		Health health = new Health();
		System.out.print("Health Program name :");
		health.ProgramName = input.next();
		System.out.print("What is your member ID? :");
		health.id = input.nextInt();
		System.out.print("How much weight will you carry?(kg)");
		health.weight = input.next();
		System.out.print("How much break time do you need? :");
		health.breaktime = input.next();
		healths.add(health);
	}
	public void deleteHealth() {
		System.out.print("What is your member ID :");
		int healthId = input.nextInt();	
		int index = -1;
		for(int i=0; i<healths.size();i++) {
			if (healths.get(i).id == healthId) {
				index = i;
				break;
			}
		}
		if (index>=0) {
			healths.remove(index);
			System.out.println("the member ID"+healthId+" is deleted");
		}
		else {
			System.out.println("the member ID has not been registered");
			return;
		}

	}
		
	public void editHealth() {
		System.out.print("What is your member ID :");
		int healthId = input.nextInt();
		for(int i=0; i<healths.size();i++) {
			Health health = healths.get(i);
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
					}//if
				}//while
				break;
			}//if
		}//for
	}
	public void viewHealths() {
//		System.out.print("What is your member ID :");
//		int healthId = input.nextInt();
		for(int i=0; i<healths.size();i++) {
			healths.get(i).printInfo();
		}
	}

}
