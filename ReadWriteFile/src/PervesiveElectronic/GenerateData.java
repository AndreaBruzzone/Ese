package PervesiveElectronic;

import java.io.*;

public class GenerateData {
	public static void main(String args[]) {
		try {
			FileOutputStream fos = new FileOutputStream("stuff.dat");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(2);
			dos.writeDouble(2.718281828459045);
			dos.writeDouble(3.1415926535);
			dos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Read or write failed");
		}
	}
}
