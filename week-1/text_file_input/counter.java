import java.io.*;
public class counter 
{
  public static void main(String[] args)
  throws IOException
  {
    File file = new File("D:\\Workspace (VS Code)\\Slot-B-Java\\src\\week-1\\text_file_input\\input.txt");
    FileInputStream fileInputStream = new FileInputStream(file);
    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    String line;
    int wordCount = 0;
    int characterCount = 0;
    int sentenceCount = 0;
    while ((line = bufferedReader.readLine()) != null) 
    {
      if (!line.equals(""))
      {
        characterCount += line.length();
        String words[] = line.split("\\s+");
        wordCount += words.length;
        String sentence[] = line.split("[!?.:]+");
        sentenceCount += sentence.length;
      }
    }
    System.out.println("Total word count = "+ wordCount);
    System.out.println("Total number of sentences = "+ sentenceCount);
    System.out.println("Total number of characters = "+ characterCount);
  }  
}
