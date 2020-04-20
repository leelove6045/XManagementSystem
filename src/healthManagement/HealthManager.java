package healthManagement;

import java.util.ArrayList;
import java.util.Scanner;

import health.ARMexercise;
import health.CHESTexercise;
import health.Health;
import health.Healthkind;

public class HealthManager {
	ArrayList<Health> healths = new ArrayList<Health>();
	Scanner input;
	
	HealthManager (Scanner input){
		this.input = input;
	}
	
	public void addHealth() {//�ｺ �߰��ϱ�
		int kind = 0;
		Health health;
		while (kind !=1 && kind !=2) {//1�� 2�� �������� ������ ��� �ݺ�
			System.out.print("1 for LowerBody Health Program\n");//��� ���� �����ϱ�
			System.out.print("2 for Arm Health Program\n");
			System.out.print("3 for Chest Health Program\n");
			System.out.print("Select num 1, 2, or 3 for Health Program kind between 1 and 2 :");
			kind = input.nextInt();
			if (kind == 1) {
				//��ü� �϶� �Է���Ʈ
				health = new Health(Healthkind.lowerBodyExercise);
				health.getUserInput(input);
				healths.add(health);
				break;
			}
			else if (kind == 2) {
				//�ȿ �϶� �Է���Ʈ
				health = new ARMexercise(Healthkind.ArmExercise);
				health.getUserInput(input);
				healths.add(health);
				break;
			}
			else if (kind == 3) {
				//����� �϶� �Է���Ʈ
				health = new CHESTexercise(Healthkind.ChestExercise);
				health.getUserInput(input);
				healths.add(health);
				break;
			}
			else {
				System.out.println("Select num for Health Program kind between 1 and 3 :");
			}
		}
	
	}
	public void deleteHealth() {//�ｺ �����
		System.out.print("What is your member ID :");
		int healthId = input.nextInt();	
		int index = -1;
		for(int i=0; i<healths.size();i++) {
			if (healths.get(i).getId() == healthId) {
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
		
	public void editHealth() {//�ｺ �����ϱ�
		System.out.print("What is your member ID :");
		int healthId = input.nextInt();
		for(int i=0; i<healths.size();i++) {
			Health health = healths.get(i);
			if (health.getId() == healthId) {
				int num = -1;
			
				while (num != 5) {//������ �׸��� �����Ѵ�
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
						String ProgramName = input.next();
						health.setProgramName(ProgramName);
					}
					else if (num==2) {
						System.out.print("What is your member ID? :");
						int id = input.nextInt();
						health.setId(id);
					}
					else if (num==3) {
						System.out.print("How much weight will you carry?(kg)");
						String weight = input.next();
						health.setWeight(weight);
					}
					else if (num==4) {
						System.out.print("How much break time do you need? :");
						String breaktime = input.next();
						health.setBreaktime(breaktime);
					}
					else {
						continue;
					}//if
				}//while
				break;
			}//if
		}//for
	}
	public void viewHealths() {//����� �ｺ ��� �����ֱ�
//		System.out.print("What is your member ID :");
//		int healthId = input.nextInt();
		System.out.println("# of registered members : "+healths.size());
		for(int i=0; i<healths.size();i++) {
			healths.get(i).printInfo();
		}
	}

}
