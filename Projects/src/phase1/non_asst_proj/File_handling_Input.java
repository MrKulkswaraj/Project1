package phase1.non_asst_proj;

import java.io.*;

public class File_handling_Input {
	public static void main(String[] args) throws Exception {
		FileInputStream Read = new FileInputStream("E:\\Reading_file.txt");
		FileOutputStream Write = new FileOutputStream("E:\\Copeid_file.txt");

		int i;

		// read value character by character and returns value-1
		while ((i = Read.read()) != -1) {

			// to know the value of each character
			
			//System.out.println(i);
			// write the value in the
			Write.write((char) i);

		}

		System.out.println("Copied Text Successfully");
	}

}
