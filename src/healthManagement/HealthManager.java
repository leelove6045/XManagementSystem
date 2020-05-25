package healthManagement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import health.ARMexercise;
import health.CHESTexercise;
import health.HealthInput;
import health.Healthkind;
import health.ROWERBODYexercise;

public class HealthManager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7213391238241187200L;
	
	ArrayList<HealthInput> healths = new ArrayList<HealthInput>();
	transient Scanner input;
	
	HealthManager (Scanner input){
		this.input = input;
	}
	
	
    public void setScanner(Scanner input) {
        this.input = input;
    }
	
	public void addHealth() {//헬스 추가하기
		int kind = 0;
		HealthInput healthInput;
		while (kind !=1 && kind !=2 && kind != 3) {//1, 2, 3을 선택하지 않으면 계속 반복
			try {
				System.out.print("1 for LowerBody Health Program\n");//운동의 종류 선택하기
				System.out.print("2 for Arm Health Program\n");
				System.out.print("3 for Chest Health Program\n");
				System.out.print("Select num 1, 2, or 3 for Health Program kind:");
				kind = input.nextInt();
				if (kind == 1) {
					//하체운동 일때 입력파트
					healthInput = new ROWERBODYexercise(Healthkind.lowerBodyExercise);
					healthInput.getUserInput(input);
					healths.add(healthInput);
					break;
				}
				else if (kind == 2) {
					//팔운동 일때 입력파트
					healthInput = new ARMexercise(Healthkind.ArmExercise);
					healthInput.getUserInput(input);
					healths.add(healthInput);
					break;
				}
				else if (kind == 3) {
					//가슴운동 일때 입력파트
					healthInput = new CHESTexercise(Healthkind.ChestExercise);
					healthInput.getUserInput(input);
					healths.add(healthInput);
					break;
				}
				else {
					System.out.println("Select num for Health Program kind between 1 and 3 :");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if (input.hasNext()) {
					input.next();
				}
				kind=-1;		
			}
		}
	}

	
	public void deleteHealth() {//헬스 지우기
		System.out.print("What is your member ID :");
		int healthId = input.nextInt();	
		int index = findIndex(healthId);
		removefromHealth (index, healthId);
	}
	
	public int findIndex(int healthId) {
		int index = -1;
		for(int i=0; i<healths.size();i++) {
			if (healths.get(i).getId() == healthId) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromHealth (int index,int healthId) {
		if (index>=0) {
			healths.remove(index);
			System.out.println("the member ID"+healthId+" is deleted");
			return 1;
		}
		else {
			System.out.println("the member ID has not been registered");
			return -1;
		}
	}
		
	public void editHealth() {//헬스 수정하기
		System.out.print("What is your member ID :");
		int healthId = input.nextInt();
		for(int i=0; i<healths.size();i++) {
			HealthInput health = healths.get(i);
			if (health.getId() == healthId) {
				int num = -1;
			
				while (num != 5) {//수정할 항목을 선택한다
					showEditHealth();
					num = input .nextInt();
					
					switch(num) {
					case 1:
						health.setProgramName(input);
						break;
					case 2:
						health.setHealthID(input);
						break;
					case 3:
						health.setWeight(input);
						break;
					case 4:
						health.setBreaktime(input);
						break;
					default:
						continue;
					}//switch
				}//while
				break;
			}//if
		}//for
	}
	public void viewHealths() {//저장된 헬스 모두 보여주기
		System.out.println("# of registered members : "+healths.size());
		for(int i=0; i<healths.size();i++) {
			healths.get(i).printInfo();
		}
	}
	
	
	public void showEditHealth() {
		System.out.println("** Health Info Edit Menu **");
		System.out.println("1. Edit Program Name");
		System.out.println("2. Edit Member Id");
		System.out.println("3. Edit weight");
		System.out.println("4. Edit break time");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5:");
		
		
	}

}
