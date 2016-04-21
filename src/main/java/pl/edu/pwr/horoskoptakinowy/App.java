package pl.edu.pwr.horoskoptakinowy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		try (BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in))) {
			String name = bufferRead.readLine();
			System.out.println("");
		} catch(IOException ex) {
	}
	}
}
