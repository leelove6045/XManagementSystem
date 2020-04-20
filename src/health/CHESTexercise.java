package health;

import java.util.Scanner;

public class CHESTexercise extends Health {
	
	public CHESTexercise(Healthkind kind) {
		super(kind);		
	}
	
	protected String trainnerweight;
	protected String trainnerbreaktime;
	
	public void getUserInput(Scanner input) {
		System.out.print("Health Program name :");//� �̸��� �Է¹ޱ�
		String ProgramName = input.next();
		this.setProgramName(ProgramName);
		
		System.out.print("What is your member ID? :");//ȸ�� ���̵� �Է¹ޱ�
		int id = input.nextInt();
		this.setId(id);
		
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.print("Can you lift the weight?(Y/N)");//�߷��� �� �� �ִ��� �Է¹ޱ�
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {//�߷��� �� �� �ִٰ� ���ϴٸ�
				System.out.print("How much weight will you carry?(kg)");//��Ű�θ� �� �� �ִ��� �Է¹ޱ�
				String weight = input.next();
				this.setWeight(weight);
				break;
			}
			else if (answer == 'n'|| answer == 'N') {//�߷��� �� �� ���ٰ� ���ϸ�
				System.out.print("");//null
				break;
			}
			else {//Y,y,N,n�� �ƴ� character�� �Է��ϸ� while���� ��� ���� �ȴ�.
			}	
		}
		
		answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.print("Do you have a Health trainner?(Y/N)");//Ʈ���̳ʰ� �ִ��� �Է¹ޱ�
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {//�߷��� �� �� �ִٰ� ���ϴٸ�
				System.out.print("How much weight wil your trainner carry?(kg)");//����� Ʈ���̳ʴ� ��Ű�θ� �� �� �ִ��� �Է¹ޱ�
				String weight = input.next();
				this.setWeight(weight);
				break;
			}
			else if (answer == 'n'|| answer == 'N') {//�߷��� �� �� ���ٰ� ���ϸ�
				System.out.print("");//null
				break;
			}
			else {//Y,y,N,n�� �ƴ� character�� �Է��ϸ� while���� ��� ���� �ȴ�.
			}	
		}
		
		System.out.print("How much break time do you need? :");//��ϴ� ������ ���½ð� �Է¹ޱ�
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
