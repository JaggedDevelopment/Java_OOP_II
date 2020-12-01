/* 10/16/2020
 * Nicolas Shelley
 * CIT 244 Assignment 3
 */



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EncoderMain
{
        public static void main(String args[]) throws FileNotFoundException {
            File file = new File("passwords.txt");
                Scanner sc = new Scanner(file); // read text file
                System.out.println("***DECRYPTED*** : \n");
        while (sc.hasNextLine()) {
            String encryptText = sc.nextLine(); // process the line
            int key = 5; // key for shifting
            System.out.println(decrypt(encryptText, key)); // printing outputs
        } 
        
        }
        
        public static String decrypt(String encryptText, int key) 
    { 
        String plainText= ""; // set String variable for decrypted text
        char ch; // character variable for check each character in string
        
        for(int i = 0; i < encryptText.length(); ++i){ // for loop till length of encrypt string
                        ch = encryptText.charAt(i); // character at ith position
                        
                        if(ch >= 'a' && ch <= 'z'){
                    ch = (char)(ch - key);
                    
                    if(ch < 'a'){
                        ch = (char)(ch + 'z' - 'a' + 1);
                    }
                    
                    plainText += ch;
                }
                else if(ch >= 'A' && ch <= 'Z'){
                    ch = (char)(ch - key);
                    
                    if(ch < 'A'){
                        ch = (char)(ch + 'Z' - 'A' + 1);
                    }
                    
                    plainText += ch;
                }
                else {
                        plainText += ch;
                }
                }
        return plainText; 
    }
}