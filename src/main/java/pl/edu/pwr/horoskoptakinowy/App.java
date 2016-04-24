package pl.edu.pwr.horoskoptakinowy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

	public static void main(String[] args) {
		try (BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Podaj swoje imie i nazwisko:");
			String name = bufferRead.readLine();
			Horoscope horoscope = new Horoscope();
			
			System.out.println("Twój horoskop na dziś to: ");
			System.out.println("Zdrowie: " + horoscope.getHealthProphecy(name));
			System.out.println("Miłość: " + horoscope.getLoveProphecy());
			System.out.println("Praca: " + horoscope.getWorkProphecy());
			System.out.println("");
		} catch(IOException ex) {
	}
	}
}
