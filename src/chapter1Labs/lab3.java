/**
 * 
 */
package chapter1Labs;

/**
 * @author siham
 *
 */
public class lab3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		EXERCICE 1 :
//		Question 2
//		String[] daysOfWeeks = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
//		System.out.println(daysOfWeeks.length);

//		Question3
//--------------------- 1.First Method using for ---------------
//		for(int i=0;i<daysOfWeeks.length;i++) {
//			System.out.println(daysOfWeeks[i]);
//		}
		
//---------------------- 2.Second Method using for(for-each) ---------------
//		for(String d:daysOfWeeks) {
//			System.out.println(d);
//		}

//		Question 4
//		for (int i=6; 0 <=i && i < daysOfWeeks.length ; i--) {
//			System.out.println(daysOfWeeks[i]);
//		}
//--------------------------------------------------------------------------------
//		EXERCICE 2 :
//		int i=0;
//		while(i<= 20) {
//			if (i%2 ==0)
//				System.out.println(i);
//			i++;
//
//		}
//----------------------------------------------------------------------
//		EXERCICE 3 :
//		for(int i=1;i<=100;i++) {
//			if(i>=50 && i<=60) 
//				continue;
//			System.out.print(i+",");
//		}
//----------------------------------------------------------------------------------------------------------------------------------------
//		EXERCICE 4 :
//		String[] months = {"January","February","May","April","March","June","July","Aout","September","October","November","December"};	
//		int c=1;
//		while(c<=12) {			
//			switch (c) {
//			case 1:
//			case 3:
//			case 5:
//			case 7:
//			case 8:
//			case 10:
//			case 12:
//				System.out.println("There are 31 days in " +months[c-1]);
//				break;
//			case 2:
//				System.out.println("There are 28 days in " +months[c-1]);
//				break;
//			case 4:
//			case 6:
//			case 9:
//			case 11:
//				System.out.println("There are 30 days in " +months[c-1]);
//				break;
//			default:
//				System.out.println("Incorrect");
//
//			}
//			c++;
//		}
//--------------------------------------------------------------------------------------------------
// 		CHALLENGE EXERCICE :
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		for(String d:days) 
			System.out.print(d + " ");
		
		System.out.print("\n");
			
		int left_off=4;
		int daysCount=1;
		boolean printing=false;
		
		for(int y=0;y<6;y++) {
			for(int x=0;x<days.length;x++) {
				if(printing==false) {
					System.out.print("\t");
					if(x==left_off)
						printing=true;
				}
				else if(daysCount<=31) {
						System.out.print(daysCount+"\t");
						daysCount++;
				}
				
			}	
			System.out.println();
		}
//------------------- END -------------------
	}

}
