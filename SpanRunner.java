package TranslationMap;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		FileReader file = new FileReader(new File("C:\\Users\\adity\\eclipse-workspace\\AT Computer Science Honors\\src\\TranslationMap\\spantoeng.dat")); 
		BufferedReader br = new BufferedReader(file); 
		int numOfWords = Integer.parseInt(br.readLine());  
		String temp = "";
		for (int i = 0; i <numOfWords; i++) {
			   temp += br.readLine() + " ";
		}
		String translate = "";
		for (int i = 0; i < 6; i ++) {
				translate += br.readLine() + "\n";
		}
		
		
		
		
		SpanishToEnglish a = new SpanishToEnglish();
		a.putEntry(temp);
		System.out.println(a);
		System.out.println(a.translate(translate));
		
		
	}
}