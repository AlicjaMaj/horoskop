package pl.edu.pwr.horoskoptakinowy;

import java.time.LocalDate;
import java.util.Random;

public class Horoscope {

	public int getHealthIndexProphecy(String nameSurname) {
		return nameSurname.replace(" ", "").length() % 12;
	}

	public int getLoveIndexProphecy(LocalDate date) {
		return (date.getDayOfMonth() - 1) % 12;
	}

	public int getWorkIndexProphecy(int random) {
		return random;
	}

	public String getLoveProphecy() {
		LocalDate currentTime = LocalDate.now();
		return Przepowiednie.MILOSC[getLoveIndexProphecy(currentTime)];
	}

	public String getHealthProphecy(String nameSurname) {

		return Przepowiednie.ZDROWIE[getHealthIndexProphecy(nameSurname)];
	}

	public String getWorkProphecy() {
		int randomInt = new Random().nextInt(12);
		return Przepowiednie.PRACA[getWorkIndexProphecy(randomInt)];
	}

}
