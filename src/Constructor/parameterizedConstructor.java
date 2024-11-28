package Constructor;

public class parameterizedConstructor {
	
	int id;
	String name;
	
    parameterizedConstructor(int i, String n)
	{
		id = i;
		name = n;
		
	}
    
    void display() {
    	System.out.println("Employee ID: " + id + " & Name: " + name);
    }

	public static void main(String[] args) {
		parameterizedConstructor pc = new parameterizedConstructor(34, "ishu");
		pc.display();
		

	}

}
