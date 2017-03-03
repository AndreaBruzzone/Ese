package PervesiveElectronic;

import java.io.*;
import java.util.*;

public class WriteDate {
	public WriteDate() {
		Date d = new Date();
		try {
			FileOutputStream f = new FileOutputStream("date.ser");
			ObjectOutputStream s = new ObjectOutputStream(f);
			s.writeObject(d);
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		new WriteDate();
	}
}
