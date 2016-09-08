package Common;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class ReadTextFile {
	private String path="//Automation//src//config.txt";
	public void Read_File(String file_Path)
	{
		path=file_Path;

	}
	public String[] OpenFile () throws IOException
	{
		int numberOfLines=readNumberOfLine();
		String[] textData=new String[numberOfLines];
			FileReader fd=new FileReader(path);
			BufferedReader br=new BufferedReader(fd);
			for(int i=0;i<numberOfLines;i++)
			{
				textData[i]=br.readLine();

			}
			br.close();
		return textData;
	}
	
	public int readNumberOfLine() throws IOException
	{
		FileReader fd=new FileReader(path);
		BufferedReader br=new BufferedReader(fd);
		int numberOfLines=0;
		while((br.readLine())!=null)
		{
			numberOfLines++;
		}
		return numberOfLines;
	}
}
