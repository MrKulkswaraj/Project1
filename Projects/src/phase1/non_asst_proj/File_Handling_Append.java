package phase1.non_asst_proj;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

	public class File_Handling_Append {
		public static void main(String[] args) throws IOException {
			FileWriter fw = new FileWriter("E:\\Reading_file.txt",true);
			BufferedWriter bw= new BufferedWriter(fw);
			bw.write("Hi I am the text");
			bw.newLine();
			bw.close();
		    fw.close();
		    System.out.println("File Append Done Successfully");
		}
}
