package health;

import java.util.Scanner;

public interface HealthInput {
	
	public void setProgramName(String programName);
	
	public int getId();
	
	public void setId(int id);
	
	public void setWeight(String weight);
	
	public void setBreaktime(String breaktime);
	
	public abstract void getUserInput(Scanner input);
	
	public abstract void printInfo() ;

	public void setProgramName(Scanner input);
	
	public void setHealthID(Scanner input);
	
	public void setWeight(Scanner input);
	
	public void setBreaktime(Scanner input);
	
}
