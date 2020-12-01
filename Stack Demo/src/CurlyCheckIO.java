/* Nicolas Shelley
 * 11/3/2020
 * CIT 244
 * Assignment 5
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class CurlyCheckIO {
    private Stack<Character> symbolStack;

    public void balance(String inputText) {
    	
        symbolStack = new Stack<Character>();
        for (int index = 0; index < inputText.length(); index++) {
            char currentSymbol = inputText.charAt(index);
            switch (currentSymbol) {
            case '{': //Checks Opening Bracket
                symbolStack.push(currentSymbol);
                break;

            case '}'://Checks Closing Bracket
                if (!symbolStack.isEmpty()) 
                    symbolStack.pop();
                break;
                
            default:
                break;
            }
        }
        
        if (!symbolStack.isEmpty())
            System.out.println("SportsTeam is unbalanced");
        else 
            System.out.println("SportsTeam is balanced");
        symbolStack.clear();
    }

    public static void main(String[] args) throws IOException {

        String input = null;
        StringBuilder sb = new StringBuilder();
        
        //----------Initialize----------
        
    	System.out.println("=====Loading SportsTeam1=====");
        BufferedReader in1 = new BufferedReader(new FileReader("SportsTeam1.java"));
        System.out.println("Reading SportsTeam1...");
        while ((input = in1.readLine()) != null) {
            sb.append(input);
        }
        new CurlyCheckIO().balance(sb.toString());
        System.out.println("------Clearing SportsTeam1------");
        
        //-----End of SportsTeam1-----
        
        System.out.println("=====Loading SportsTeam2=====");
        BufferedReader in2 = new BufferedReader(new FileReader("SportsTeam2.java"));
        System.out.println("Reading SportsTeam2...");
        while ((input = in2.readLine()) != null) {
            sb.append(input);
        }
        new CurlyCheckIO().balance(sb.toString());
        System.out.println("------Clearing SportsTeam2------");
        
        //-----End of SportsTeam1-----
       
    }
}
