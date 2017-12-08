package sample;
import java.io.*;

public class Consoletest {
	
	public static String getLineFromConsole(String prompt) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println(prompt + ":");
		
		try {
			
			return (br.readLine());
			
		}
		
		catch(Exception e )
		{
			
			System.err.print("Exception error = "+ e.getMessage());
			return (null);
			
			
			
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String line = getLineFromConsole("Type some text ");
System.out.println("You typed: " + line);
	}

}
