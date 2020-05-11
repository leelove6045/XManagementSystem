package health;

import java.util.Scanner;

public class CHESTexercise extends UpperBodyexercise {
	
	public CHESTexercise(Healthkind kind) {
		super(kind);		
	}
	
	protected String trainnerweight;
	protected String trainnerbreaktime;
	
	public void getUserInput(Scanner input) {
		setProgramName(input);
		setHealthID(input);
		setWeightwithYN(input);
		setBreaktime(input);
	}

}
