import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hello {
	public static void main(String[] args) throws IOException {
		try {
			File file = new File("C:\\Users\\User\\Desktop\\captmidn.txt");
			Scanner scan = new Scanner(file);
			String fileContent = "This is a new File";
			while (scan.hasNextLine()) {
				fileContent = fileContent.concat(scan.nextLine() + "\n");
			}
			FileWriter fileWriter = new FileWriter("C:\\\\Users\\\\User\\\\Desktop\\\\captmidn2.txt");
			fileWriter.write(fileContent);
			fileWriter.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
