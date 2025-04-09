import java.io.*;
//this example takes input.txt and copies it to output.txt
public class FilesExample 
{
	public final int ENDOFFILE = -1;
	
	public  FilesExample() throws IOException //the throws means I don't have to have a try catch block, it is passing that reponsibility upwards
	{

		File file = new File("input.txt");
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		StringBuffer buffer = new StringBuffer(); //stringbuffer ids like a string but it is mutable (ie it can change)
		String line;
		while((line = br.readLine())!=null) //get a line into a striung line whilst making sure it isn't the end of file marker
		{
			buffer.append(line);
			buffer.append("\n");
			System.out.println("***"+line+"***");
		}
		System.out.println("The whole thing:"+buffer);
		//the code above read a file into a stringbuffer now write it out to another file
		try {
			// Creates a FileWriter
			FileWriter file2 = new FileWriter("output.txt");

			// Creates a BufferedWriter
			BufferedWriter output = new BufferedWriter(file2);

			// Writes the string to the file
			output.write(String.valueOf(buffer)); //BufferedWriter expects a String and not a StringBuffer, so convert it

			// Closes the writer
			output.close();
		}

		catch (Exception e)
		{
			System.out.println("error saving file");
		}
		
		
		
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		FilesExample o = new FilesExample();
	}

}
