/* Nicolas Shelley CIT 244
*  Assignment 2 9/25/2020
*/

public class Family {
private String relation, name;

public Family() {
	
}

public Family(String name, String relation) {
	this.name = name;
	this.relation = relation;
}

public String getName() {
	return name;
}

public void setName(String n) {
	name = n;
}

public String getRelation() {
	return relation;
}

public void setRelation(String r) {
	relation = r;
}
}
