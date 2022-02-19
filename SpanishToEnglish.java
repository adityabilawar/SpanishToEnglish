package TranslationMap;

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanishToEnglish
{
	private Map<String,String> pairs;

	public SpanishToEnglish()
	{
		pairs = new TreeMap<String, String>();
	}

	public void putEntry(String entry)
	{
		pairs = new TreeMap<String, String>();
		String[] list = entry.split(" ");
		for(int i = 0; i < list.length; i+=2) {
			pairs.put(list[i], list[i + 1]);
		}
	}

	public String translate(String sent)
	{
		String translate = "";
		Scanner chop = new Scanner(sent);
		String[] sentence = sent.split("\n");
		for(int i=0; i < sentence.length; i++) {
			String[] words = sentence[i].split(" ");
			for(int j = 0; j<words.length; j++) {
				translate+=pairs.get(words[j]) + " ";
			}
			translate+="\n";
		}
		String output = translate;
		return output;
	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}
