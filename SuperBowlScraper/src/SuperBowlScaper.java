/* Nicolas Shelley
 * CIT 244
 * Assignment 6
 */

import java.util.ArrayList;
import java.util.Scanner;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


public class SuperBowlScaper {
    public static void main(String[] args) throws Exception {
		ArrayList<String> Teams = new ArrayList<String>();
		String Team;
		int temp = 0;
		Scanner input = new Scanner(System.in);
	    Document doc = Jsoup.connect("https://blog.ticketcity.com/nfl/super-bowl/super-bowl-champions/").get();
	    
	        for(int i=1; i<56; i++) {
		        for (Element e : doc.select("tr:eq("+i+") td:eq(2)")) { 
		            Teams.add(e.select("strong").text());
	        	}
	        }
        
	    System.out.println("What Team would you like to search for?");
	    Team = input.nextLine();
        
	        for (String element : Teams){
	            if (element.contains(Team)){
	            		temp++;    
	            }
	         }
	        
        System.out.println("The site has the " + Team + " winning the SuperBowl " + temp + " times");
        input.close();
    }
}