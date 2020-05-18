package health;

import java.util.Scanner;

import exceptions.WeightFormatException;

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
			
			try {
				if (answer == 'y'|| answer == 'Y') {//중량을 들 수 있다고 답하다면
					System.out.println("health trainner's weight that he can lift(kg)");
					setWeight(input);
					break;
				}
				else if (answer == 'n'|| answer == 'N') {//중량을 들 수 없다고 답하면
					setWeight("");//null
					break;
				}
				else {//Y,y,N,n이 아닌 character를 입력하면 while문이 계속 실행 된다.
				}
			}
			catch(WeightFormatException e) {
				System.out.println("Incorreect Weight Format, put the weight that you can carry (kg)");
			}
		}
		
	}
	
	public void printInfo() {
		String skind =getKindString();
		System.out.println("kind:" + skind + "Program name : "+ ProgramName + "member id: "+ id +"weight:" + weight + "breaktime: "+ breaktime +"trainner's weight:" + weight + "trainner's breaktime: "+ breaktime);	
	}

}
