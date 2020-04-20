package health;

import java.util.Scanner;

public class CHESTexercise extends Health {
	
	public CHESTexercise(Healthkind kind) {
		super(kind);		
	}
	
	protected String trainnerweight;
	protected String trainnerbreaktime;
	
	public void getUserInput(Scanner input) {
		System.out.print("Health Program name :");//운동 이름을 입력받기
		String ProgramName = input.next();
		this.setProgramName(ProgramName);
		
		System.out.print("What is your member ID? :");//회원 아이디를 입력받기
		int id = input.nextInt();
		this.setId(id);
		
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.print("Can you lift the weight?(Y/N)");//중량을 들 수 있는지 입력받기
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {//중량을 들 수 있다고 답하다면
				System.out.print("How much weight will you carry?(kg)");//몇키로를 들 수 있는지 입력받기
				String weight = input.next();
				this.setWeight(weight);
				break;
			}
			else if (answer == 'n'|| answer == 'N') {//중량을 들 수 없다고 답하면
				System.out.print("");//null
				break;
			}
			else {//Y,y,N,n이 아닌 character를 입력하면 while문이 계속 실행 된다.
			}	
		}
		
		answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.print("Do you have a Health trainner?(Y/N)");//트레이너가 있는지 입력받기
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {//중량을 들 수 있다고 답하다면
				System.out.print("How much weight wil your trainner carry?(kg)");//당신의 트레이너는 몇키로를 들 수 있는지 입력받기
				String weight = input.next();
				this.setWeight(weight);
				break;
			}
			else if (answer == 'n'|| answer == 'N') {//중량을 들 수 없다고 답하면
				System.out.print("");//null
				break;
			}
			else {//Y,y,N,n이 아닌 character를 입력하면 while문이 계속 실행 된다.
			}	
		}
		
		System.out.print("How much break time do you need? :");//운동하는 동안의 쉬는시간 입력받기
		String breaktime = input.next();
		this.setBreaktime(breaktime);
	}
	
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case lowerBodyExercise : 
			skind = "LowerBody Exercise";
			break;
		case ArmExercise :
			skind = "Arm Exercise";
			break;
		case BackExercise :
			skind = "Back Exercise";
			break;
		case ChestExercise :
			skind = "Chest Exercise";
			break;
		default :
			
		}
		System.out.println("kind:" + skind + "Program name : "+ ProgramName + "member id: "+ id +"weight:" + weight + "breaktime: "+ breaktime +"trainner's weight:" + weight + "trainner's breaktime: "+ breaktime);	
	}

}
