package health;

import java.util.Scanner;

public class ARMexercise extends UpperBodyexercise {
	
	public ARMexercise(Healthkind kind) {
		super(kind);
		
	}
	
	public void getUserInput(Scanner input) {
		setProgramName(input);
		setHealthID(input);
		setWeightwithYN(input);
		setTrainnerWeightwithYN(input);
		setBreaktime(input);
	}
	
	public void setTrainnerWeightwithYN(Scanner input) {
		char answer ='x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.println("Can yout health trainner lift the weight?(Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y'|| answer == 'Y') {//�߷��� �� �� �ִٰ� ���ϴٸ�
				System.out.println("health trainner's weight that he can lift(kg)");
				setWeight(input);
				break;
			}
			else if (answer == 'n'|| answer == 'N') {//�߷��� �� �� ���ٰ� ���ϸ�
				System.out.print("");//null
				break;
			}
			else {//Y,y,N,n�� �ƴ� character�� �Է��ϸ� while���� ��� ���� �ȴ�.
			}
		}
		
	}
	
	public void printInfo() {
		String skind =getKindString();
		System.out.println("kind:" + skind + "Program name : "+ ProgramName + "member id: "+ id +"weight:" + weight + "breaktime: "+ breaktime +"trainner's weight:" + weight + "trainner's breaktime: "+ breaktime);	
	}

}
