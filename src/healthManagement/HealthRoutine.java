package healthManagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;


public class HealthRoutine {
	static EventLogger logger = new EventLogger("log.txt");

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HealthManager healthManager = getObject("healthmanager.ser");
		
		if(healthManager==null) {
			healthManager = new HealthManager(input);//������ ������
		}
		else {
			healthManager.setScanner(input);
		}
		
		selectHealth(input, healthManager);
		putObject(healthManager, "healthmanager.ser");
		
	}
	public static void selectHealth(Scanner input,HealthManager healthManager ) {
		int num = -1;
		while (num != 5) {
			try {
				showHealth();
				num = input .nextInt();
				switch(num) {
				case 1:
					healthManager.addHealth();
					logger.log("add Health");
					break;
				case 2:
					healthManager.deleteHealth();
					logger.log("delete Health");
					break;
				case 3:
					healthManager.editHealth();
					logger.log("edit Health");
					break;
				case 4:
					healthManager.viewHealths();
					logger.log("view Health");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if (input.hasNext()) {
					input.next();
				}
				num=-1;		
			}
		}	
	}
	public static void showHealth() {
		
		System.out.println("*** Health Routine Management System Menu ***");
		System.out.println("1. Add Health Program");
		System.out.println("2. Delete Health Program");
		System.out.println("3. Edit Health Program");
		System.out.println("4. View Health Programs");
		System.out.println("5. Exit");
		System.out.println("Select one number between 1 - 5:");	
	}
	

	
	public static HealthManager getObject(String filename) {
		HealthManager healthManager = null;
		
		
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			healthManager = (HealthManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return healthManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return healthManager;
	}
	
	public static void putObject(HealthManager healthManager,String filename){
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(healthManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}