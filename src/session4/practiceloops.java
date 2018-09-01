package session4;

public class practiceloops {

	public static void main(String[] args) {
	
		int a= 4;
		int b=3;
		String S1 = "Syed";
		String S2 = "syed";
		
	//if else loop	
		if (a<b)
		{
			System.out.println("B is greater");
	
		}
		
		else if (a==b)
		{
			
		System.out.println("A is equal to B");

	}
		else
		{
			System.out.println("A is greater");
		}
		
   if (S1.equals(S2))
		   {
	   System.out.println("pass");
		   }
   
   else 
   {
	   System.out.println("fail");   
   }
    
  //switch case
   
    String Branch = "CSE";
    int year = 3;
    
    
    switch (Branch) {
	case "Mech":
	
		    switch (year) {
			case 1:
				System.out.println("First year");
				break;
			case 2:
				System.out.println("second year");
			default:
				break;
			}
		break;
	case "CSE": 
		
		
	    switch (year) {
		case 1:
			System.out.println("First year");
			break;
		case 2:
			System.out.println("second year");
		default:
			System.out.println("Not studying");
			break;
	    }
	    break;
   case "ECE":
		
	    switch (year) {
		case 1:
			System.out.println("First year");
			break;
		case 2:
			System.out.println("second year");
		default:
			break;
	    }
	default:
		break;
	}
    
      		
   
	}
	
}

