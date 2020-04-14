package health;

import java.util.Scanner;

public class Health {

	protected Healthkind kind = Healthkind.ArmExercise;
	protected String ProgramName;
	protected int id;
	protected String weight;
	protected String breaktime;
		
	public Health() {
		
	}
	public Health(String ProgramName, int id) {
	super();
	this.ProgramName = ProgramName;
	this.id = id;
	}
	
	public Health(String ProgramName, int id, String weight, String breaktime) {
	super();
	this.ProgramName = ProgramName;
	this.id = id;
	this.weight = weight;
	this.breaktime = breaktime;
	}
	
	public Healthkind getKind() {
		return kind;
	}
	public void setKind(Healthkind kind) {
		this.kind = kind;
	}
	public String getProgramName() {
		return ProgramName;
	}
	public void setProgramName(String programName) {
		ProgramName = programName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getBreaktime() {
		return breaktime;
	}
	public void setBreaktime(String breaktime) {
		this.breaktime = breaktime;
	}

	public void printInfo() {
		System.out.println("Program name : "+ this.ProgramName + "member id: "+ this.id +"weight:" + this.weight + "breaktime: "+ this.breaktime);	
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Health Program name :");//운동 이름을 입력받기
		String ProgramName = input.next();
		this.setProgramName(ProgramName);
		
		System.out.print("What is your member ID? :");//회원 아이디를 입력받기
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("How much weight will you carry?(kg)");//들 수 있는 중량 입력받기
		String weight = input.next();
		this.setWeight(weight);
		
		System.out.print("How much break time do you need? :");//운동하는 동안의 쉬는시간 입력받기
		String breaktime = input.next();
		this.setBreaktime(breaktime);
	}

}
