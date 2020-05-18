package health;

import java.util.Scanner;

import exceptions.WeightFormatException;

public abstract class UpperBodyexercise extends Health {
	
	public UpperBodyexercise(Healthkind kind) {
		super(kind);		
	}

	@Override
	public abstract void getUserInput(Scanner input);
	
	@Override
	public void printInfo() {
		String skind =getKindString();
		System.out.println("kind:" + skind + "Program name : "+ ProgramName + "member id: "+ id +"weight:" + weight + "breaktime: "+ breaktime +"trainner's weight:" + weight + "trainner's breaktime: "+ breaktime);	
	}
	
	public void setWeightwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer !='Y' && answer != 'n' && answer !='N') {
			System.out.print("Can you lift the weight?(Y/N)");//�߷��� �� �� �ִ��� �Է¹ޱ�
			answer = input.next().charAt(0);
			try {
				if (answer == 'y'|| answer == 'Y') {//�߷��� �� �� �ִٰ� ���ϴٸ�
					setWeight(input);
					break;
				}
				else if (answer == 'n'|| answer == 'N') {//�߷��� �� �� ���ٰ� ���ϸ�
					setWeight("");//null
					break;
				}
				else {//Y,y,N,n�� �ƴ� character�� �Է��ϸ� while���� ��� ���� �ȴ�.
				}
			}
			catch(WeightFormatException e) {
				System.out.println("Incorreect Weight Format, put the weight that you can carry (kg)");
			}
		}
	}

}
