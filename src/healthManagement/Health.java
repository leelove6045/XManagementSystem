package healthManagement;

public class Health {
	String ProgramName;
	int id;
	String weight;
	String breaktime;
	
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
	
	public void printInfo() {
		System.out.println("Program name : "+ this.ProgramName + "member id: "+ this.id +"weight:" + this.weight + "breaktime: "+ this.breaktime);
		
	}

}
