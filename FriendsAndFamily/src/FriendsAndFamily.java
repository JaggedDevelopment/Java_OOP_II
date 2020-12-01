/* Nicolas Shelley CIT 244
*  Assignment 2 9/25/2020
*/
import java.util.Scanner;

public class FriendsAndFamily {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);	
	
	int amtFOF, fam=0, fren=0, yearsKnown = 0;
	String FOF = "", name = "", relation = "";
	System.out.println("(Warning: When prompted for choice of 'friend' or 'family',\n anything other than friend or family will end the program.)");
	do {
	
	System.out.println("How many Friends or Family would you like to enter? ==> ");
	amtFOF = input.nextInt();
	input.nextLine();
	
	}while(amtFOF<=0);
	
	Friends[] arrFren = new Friends[amtFOF];
	Family[] arrFam = new Family[amtFOF];
	
	for (int c = 0;c < amtFOF;c++) {
	System.out.println("Is the Person Friend or Family? ==> ");
	FOF = input.next();
	input.nextLine();
	
		if(FOF.equalsIgnoreCase("Family")) {
			
			arrFam[fam] = new Family(name,relation);	
			
			System.out.println("Enter the name of the family member ==> ");
			name = input.next();
			arrFam[fam].setName(name);//assigns text input to family name slot
						
			System.out.println("Enter the relation to the family member ==> ");
			relation = input.next();
			arrFam[fam].setRelation(relation);//assigns text input to relation slot
			
			fam = fam + 1;//tracks family area
		}
		else if(FOF.equalsIgnoreCase("Friend")) {
			
			arrFren[fren] = new Friends(name,yearsKnown);	
			
			System.out.println("Enter the Friends name ==> ");
			name = input.next();
			arrFren[fren].setName(name);//assigns text input to friend name slot
						
			System.out.println("How long have you known " + name + "? ==>");
			yearsKnown = input.nextInt();
			if(yearsKnown<0) {//ensures the years are non-negative
				yearsKnown=0;
			}
			arrFren[fren].setYearsKnown(yearsKnown);//assigns integer input to yearsKnown slot		
			
			fren = fren + 1;//tracks friend array
			
		}
		else {//ends program for invalid friend or family input
			System.out.println("Invalid Input! Ending Program!");
			System.exit(0);
		}
	}
	
		for (int x = 0; x < fren; x++) { //to string to friend array
		 	System.out.println(arrFren[x].getName() + " and you have been friends for " + arrFren[x].getYearsKnown() + " year(s)."); 
		 	
	 }
		for (int x = 0; x < fam; x++) { //to string for family array
		 	System.out.println(arrFam[x].getName() + " is part of your family, the relationship is, " + arrFam[x].getRelation()); 
		 	
	 }
	 
	}
	}


