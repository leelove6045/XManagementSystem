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
	
	public Health(Healthkind kind) {
		this.kind = kind;
		
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
	
	public Health(Healthkind kind, String ProgramName, int id, String weight, String breaktime) {
	super();
	this.kind = kind;
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
		System.out.println("kind:" + skind + " Program name : "+ ProgramName + " member id: "+ id +" weight:" + weight + " breaktime: "+ breaktime);	
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Health Program name :");//� �̸��� �Է¹ޱ�
		String ProgramName = input.next();
		this.setProgramName(ProgramName);
		
		System.out.print("What is your member ID? :");//ȸ�� ���̵� �Է¹ޱ�
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("How much weight will you carry?(kg)");//�� �� �ִ� �߷� �Է¹ޱ�
		String weight = input.next();
		this.setWeight(weight);
		
		System.out.print("How much break time do you need? :");//��ϴ� ������ ���½ð� �Է¹ޱ�
		String breaktime = input.next();
		this.setBreaktime(breaktime);
	}

}