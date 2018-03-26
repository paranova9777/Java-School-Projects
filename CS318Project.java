import java.io.*;

public class CS318Project
{
	public static void main(String[] args) throws IOException
	{
		//Program mimic counters found within word editors such as the word counter, sentence per paragraph and similar stats
		File file = new File("C:\\Users\\Owner\\Documents\\testfile.txt"); //Edit this based on the system and location of file
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);
		
		String line;
		
		int countWord = 0;
		int sentenceCount = 0;
		int characterWO = 0;
		int characterCount = 0;
		int paragraphCount = 1;
                int wordExclusion = 0;
		
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
                                for(int x=0; x<wordList.length; x++){
                                    String check = wordList[x].replaceAll("[^a-zA-Z\\s]", "");
                                    //replaces non alphabet characters with ''
			check = check.toLowerCase();
                                    if(check.equals("a") || check.equals("an") || check.equals("the"))
                                        wordExclusion += 1;

                                    System.out.println(wordList[x]);
                                }
				
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
		System.out.println("Total word count without article(a,an,the) :" + (countWord - wordExclusion));
		System.out.println("Total number of sentences: " + sentenceCount);
		System.out.println("Total number of characters: " + characterCount);
		System.out.println("Total number of characters without spaces and punctuation: " + characterWO);
		System.out.println("Number of paragraphs: " + paragraphCount);
		System.out.println("Average number of words per sentence: " + (countWord/sentenceCount));
		System.out.println("Average number of sentences per paragraph: " + (sentenceCount/paragraphCount));
                System.out.println("Average number of characters per word: " + (characterWO/countWord));
	}
}
