package health;

import java.util.Scanner;

public class ARMexercise extends Health {

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
		
		System.out.print("How much break time do you need? :");//��ϴ� ������ ���½ð� �Է¹ޱ�
		String breaktime = input.next();
		this.setBreaktime(breaktime);
	}
}
