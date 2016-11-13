/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datatogenes;
import java.util.Scanner;
/**
 *
 * @author lildocta
 */
public class Convert {
    
    
    
    public static void main(String[] args) {
        
        System.out.println("Enter your name and watch as it is converted to DNA from the binary code of the letters!");
        
        Scanner kb = new Scanner(System.in);
        
        String name1 = kb.next();
        String name = name1.replaceAll(" ", "");
        System.out.println(name);
        int nameLength = name.length();
        String finalbytes = "";
        String bytes;
        String DNA = "";
        String sisterStrand = "";
        
        for (int i = 0; i < nameLength ;i++ )
        {
            char c = name.charAt(i);
            
            bytes = charToByteString(c);
         
            finalbytes = finalbytes + bytes;
        }
        int finalLength = finalbytes.length();
        for (int i = 0; i < finalLength; i = i + 2)
        {
            char firstChar = finalbytes.charAt(i);
            char secondChar = finalbytes.charAt(i + 1);
            
            if (firstChar == '0' && secondChar == '0')
            {
                DNA = DNA + "A";
            } else if (firstChar == '0' && secondChar == '1')
            {
                DNA = DNA + "T";
            } else if (firstChar == '1' && secondChar == '0')
            {
                DNA = DNA + "G";
            } else if (firstChar == '1' && secondChar == '1')
            {
                DNA = DNA + "C";
                int DNALength = DNA.length();
                for (int j = 0; j < DNALength; j++)
                {
                    char firstDNA = DNA.charAt(j);
                    
                    switch (firstDNA)
                    {
                        case 'A': sisterStrand = sisterStrand + 'T';
                                  break;
                        case 'T': sisterStrand = sisterStrand + 'A';
                                  break;
                        case 'G': sisterStrand = sisterStrand + 'C';
                                  break;
                        case 'C': sisterStrand = sisterStrand + 'G';
                                  break;
                    }
                }
            }
        }
        System.out.println(finalbytes);
        System.out.println("ATG-" + DNA + "-TAA");
        //System.out.println("TAC-" + sisterStrand + "-ATT");
    }
    public static String charToByteString (char input)
    {   String output = "";  
                switch(input)
                {
                    //Lowercase Letter Converstion to Bytes
                    case 'a': output = "01100001";
                    break;         
                    case 'b': output = "01100010";
                    break;
                    case 'c': output = "01100011";
                    break;
                    case 'd': output = "01100100";
                    break;
                    case 'e': output = "01100101";
                    break;
                    case 'f': output = "01100110";
                    break;
                    case 'g': output = "01100111";
                    break;
                    case 'h': output = "01101000";
                    break;
                    case 'i': output = "01101001";
                    break;
                    case 'j': output = "01101010";
                    break;
                    case 'k': output = "01101011";
                    break;
                    case 'l': output = "01101100";
                    break;
                    case 'm': output = "01101101";
                    break;
                    case 'n': output = "01101110";
                    break;
                    case 'o': output = "01101111";
                    break;
                    case 'p': output = "01110000";
                    break;
                    case 'q': output = "01110001";
                    break;
                    case 'r': output = "01110010";    
                    break;
                    case 's': output = "01110011";
                    break;
                    case 't': output = "01110100";
                    break;
                    case 'u': output = "01110101";
                    break;
                    case 'v': output = "01110110";
                    break;
                    case 'w': output = "01110111";
                    break;
                    case 'x': output = "01111000";
                    break;
                    case 'y': output = "01111001";
                    break;
                    case 'z': output = "01111010";
                    break;
                    //Capital Letter Conversion
                    
                    case 'A': output = "01000001";
                    break;         
                    case 'B': output = "01000010";
                    break;
                    case 'C': output = "01000011";
                    break;
                    case 'D': output = "01000100";
                    break;
                    case 'E': output = "01000101";
                    break;
                    case 'F': output = "01000110";
                    break;
                    case 'G': output = "01000111";
                    break;
                    case 'H': output = "01001000";
                    break;
                    case 'I': output = "01001001";
                    break;
                    case 'J': output = "01001010";
                    break;
                    case 'K': output = "01001011";
                    break;
                    case 'L': output = "01001100";
                    break;
                    case 'M': output = "01001101";
                    break;
                    case 'N': output = "01001110";
                    break;
                    case 'O': output = "01001111";
                    break;
                    case 'P': output = "01010000";
                    break;
                    case 'Q': output = "01010001";
                    break;
                    case 'R': output = "01010010";    
                    break;
                    case 'S': output = "01010011";
                    break;
                    case 'T': output = "01010100";
                    break;
                    case 'U': output = "01010101";
                    break;
                    case 'V': output = "01010110";
                    break;
                    case 'W': output = "01010111";
                    break;
                    case 'X': output = "01011000";
                    break;
                    case 'Y': output = "01011001";
                    break;
                    case 'Z': output = "01011010";
                    break;
                }
                  return output;  
    }
}
