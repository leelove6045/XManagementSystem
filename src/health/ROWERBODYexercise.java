package health;

import java.util.Scanner;

public class ROWERBODYexercise extends Health{
	
	public ROWERBODYexercise(Healthkind kind) {
		super(kind);		
	}
	
	public void getUserInput(Scanner input) {
		setProgramName(input);
		setHealthID(input);
		setWeight(input);
		setBreaktime(input);		
	}

	public void printInfo() {
		String skind =getKindString();
		System.out.println("kind:" + skind + "Program name : "+ ProgramName + "member id: "+ id +"weight:" + weight + "breaktime: "+ breaktime +"trainner's weight:" + weight + "trainner's breaktime: "+ breaktime);	
	}
}
