package PervesiveElectronic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileToOut1 {
	public static void main(String args[]) {
		try {
			FileInputStream infile = new FileInputStream("testfile.txt");
			byte buffer[] = new byte[50];
			int nBytesRead;
			do {
				nBytesRead = infile.read(buffer);
				System.out.write(buffer, 0, nBytesRead);
			} while (nBytesRead == buffer.length);
			infile.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Read failed");
		}
	}
}
