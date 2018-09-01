package session9;

import java.io.IOException;

public class TestCase {

	public static void main(String[] args) throws IOException {
		
		String testcaseName = "ESS";
		
		xlReading xl = new xlReading();
		
		String two = xl.getCellValue(testcaseName, "What is 2+2?");
//		String incorrect = xl.getCellValue(testcaseName, "incorrect");
		
		System.out.println(two);
		
			
		

	}

}
