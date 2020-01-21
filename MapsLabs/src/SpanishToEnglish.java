import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class SpanishToEnglish {

		private Map<String,String> pairs;

		public SpanishToEnglish()
		{

		TreeMap<String,String > map = new TreeMap<String,String>();
			

		}

		public void putEntry(String entry)
		{
			String[] list = entry.split(" ");



		}

		public String translate(String sent)
		{
			Scanner chop = new Scanner(sent);
			String output ="";






			return output;
		}

		public String toString()
		{
			return pairs.toString().replaceAll("\\,","\n");
		}

}
