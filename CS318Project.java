import java.io.*;

public class CS318Project
{
	public static void main(String[] args) throws IOException
	{
		//Program is mimics the basic counters included within word editors.

		File file = new File("C:\\Users\\Brian\\Desktop\\testDoc.txt"); //change according to file location
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		
		String line;
		
		int countWord = 0;
		int sentenceCount = 0;
		int characterWO = 0;
		int characterCount = 0;
		int paragraphCount = 1;
		
		while((line = reader.readLine()) != null)
		{
			if(line.equals(""))
			{
				paragraphCount++;
			}
			else
			{
				
				characterCount += line.length();
				
				// \\s+ space delimiter
				String[] wordList = line.split("\\s+");
				
				countWord += wordList.length;
				
				// [!?.:]+ sentence delimiter
				String[] sentenceList = line.split("[!?.:]+");
				
				sentenceCount += sentenceList.length;
				
				//counts characters without spaces or punctuation 
				String spaceless = line.replace(" ", "");
				spaceless = spaceless.replace(",", "");
				spaceless = spaceless.replace(".", "");
				spaceless = spaceless.replace("?", "");
				spaceless = spaceless.replace("!", "");
				spaceless = spaceless.replace("'", "");
				characterWO += spaceless.length();
			}
		}
		
		System.out.println("Total word count: " + countWord);
		//System.out.println("Total word count without article(a,an,the) :");
		System.out.println("Total number of sentences: " + sentenceCount);
		System.out.println("Total number of characters: " + characterCount);
		System.out.println("Total number of characters without spaces and punctuation: " + characterWO);
		System.out.println("Number of paragraphs: " + paragraphCount);
		//System.out.println("Average number of letter per a word: " + );
		System.out.println("Average number of words per a sentenece: " + (countWord/sentenceCount));
		System.out.println("Average number of sentences per a paragraph: " + (sentenceCount/paragraphCount));
	}
}
