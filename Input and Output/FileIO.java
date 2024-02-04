import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileIO
{
	public static void main(String[] args) 
	{
		String[] names = {"John", "Mark", "Steve", "Jerry"};

		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Writing to a file");
			writer.write("\nWriting another line");

			for (String name : names) {
				writer.write("\nHi " + name + "!");
			}

			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);	
			}

			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		

	}
}