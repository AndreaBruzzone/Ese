package PervesiveElectronic;

import java.io.*;

public class ReadData {
	public static void main(String args[]) {
		try {
			FileInputStream fis = new FileInputStream("stuff.dat");
			DataInputStream dis = new DataInputStream(fis);
			int n = dis.readInt();
			System.out.println(n);
			for (int i = 0; i < n; i++) {
				System.out.println(dis.readDouble());
			}
			dis.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
		} catch (IOException e) {
			System.err.println("Read or write failed");
		}
	}
}