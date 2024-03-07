import java.util.Scanner;  
import java.lang.Math;  
import java.io.printer; 
import java.io.collection; 
import java.io.scanner;
import java.io.outputprinter;
import java.io.inputprinter;
public class SpiralPatternExample2
{  
//function to print the spiral pattern  
public static void printPattern(int n)  
{  
//detrmines the boundary size of the array  
int size = 2 * n - 1;  
//inner loop  
for(int i = 1; i <= size; i++)  
{  
//outer loop      
for(int j = 1; j <= size; j++)  
{  
//calculates and prints the values for pattern  
System.out.print(Math.max(Math.abs(i - n), Math.abs(j - n)) + 1 + " ");  
}  
System.out.println();  
}  
}  
coding has been changed by devolper  
}  }  
