package test.nexttech;

public class StringProgram {

	public static void main(String[] args) {
		/*Anything we store in double quotes is a String. Once its stored as a String - We can then do anything with it > We can print it out, add 
		  something else to it, we can also perform any other actions that String class provided us. 
		 */
		
		//System.out.println("My Name Is Sal");
		
		//So lets say we want to fill out the blanks of the statement we are printing below..
		//System.out.println("My brand new _____ does not _____ when i press the start ______");
		
		//As you can see the statement will print with the blanks. However, we can use the String variables to fill the blanks. 
		String a = "Car";
		String b = "Start";
		String c = "Button";
		//We can then add the variables using the + operators before and after the variable to add them to the statement.
		
		//System.out.println("My brand new "+a+" does not "+b+" when i press the start "+c+" ..!");
		System.out.println(a.replace('C', 'T'));
		
		

	}

}
