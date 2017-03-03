package PervesiveElectronic;

import java.io.*;
import java.util.*;

public class ReadDate {
	public ReadDate() {
		Date d = null;
		ObjectInputStream s = null;
		try {
			FileInputStream f = new FileInputStream("date.ser");
			s = new ObjectInputStream(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			d = (Date) s.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InvalidClassException e) {
			e.printStackTrace();
		} catch (StreamCorruptedException e) {
			e.printStackTrace();
		} catch (OptionalDataException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Date serialized at: " + d);
	}

	public static void main(String args[]) {
		new ReadDate();
	}
}
