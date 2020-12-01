/* Nicolas Shelley CIT 244
*  Assignment 2 9/25/2020
*/

public class Friends {
private int yearsKnown;
private String name;
public Friends() {
	
}

public Friends(String name, int yearsKnown) {
	 this.yearsKnown = yearsKnown; 
     this.name = name; 
}

public String getName() {
	return name;
}

public void setName(String n) {
	name = n;
}

public int getYearsKnown(){
	return yearsKnown;
}

public void setYearsKnown(int y) {
	yearsKnown = y;
}

}
