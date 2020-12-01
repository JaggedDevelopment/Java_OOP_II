/* Nicolas Shelley 11/1/2020
 * CIT 244
 * Assignment 4
 */

import java.io.*;
import java.util.*;

public class SortSearchAssign_ {
    public static AllSearch search = new AllSearch();
    public static AllSorts sort = new AllSorts();
    public static void main(String[] args) throws FileNotFoundException {
    	Scanner input = new Scanner(System.in);
        
    	createFile();
    	
    	System.out.println("What integer between 0 - 99 would you like to search for?");
    	int s = input.nextInt();
 
    	System.out.println("Sorting Array...");
        int[] arr = sort.mergeSort(readFromFile());// sorts array
        
        System.out.println("Searching Array...");
        int find = search.binSearch(arr, s);
        System.out.println(find);
        
       
        
        
    }

    // Method which generates text file containing 1 million random numbers
    public static void createFile() 
    {
        // File to be created in default directory
        File file = new File("somanynumbers.txt");
        Random rng = new Random();
        int r;

        try {
            // Create the file
            PrintWriter output = new PrintWriter(file);

            // Write random numbers into a file
            for (int i = 0; i < 1000000; i++) 
            {
                // Genereates a random number in range of (0 - 100)
                r = rng.nextInt(101);
                output.write(r + " , ");
            }
            System.out.println("File created.");
            // Close file
            output.close();
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("Cannot do that.");
        }
    }
    
    public static int[] readFromFile() throws FileNotFoundException {
        //Reads and Interprets file
    	Scanner in = new Scanner(new File("somanynumbers.txt"));
        int[] a = new int[1000000];
        int x = 0;
        while(in.hasNext()) {
            String word = in.next();
            if (word.equals(",")) {
            	//removes commas
                continue;
            }
            int s = Integer.parseInt(word);//turns string into an int
            
            a[x++] = s;//adds int to array
        }
        return a;
    }


}
