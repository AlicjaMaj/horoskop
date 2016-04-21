package pl.edu.pwr.horoskoptakinowy;

import static org.hamcrest.Matchers.*; //.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class HoroscopeTest {
	Horoscope horoscope;

	@Before
	public void setUp() {
		horoscope = new Horoscope();
	}

	@Test
	public void shoudReturn4thHealthProphecyForJoannaSkurzynska() {
		// given
		String nameSurname = "Joanna Skurzynska";
		// Zdrowie - indeks wróżby to reszta z dzielenia długości imienia i
		// nazwiska przez 12
		// when
		int healthIndex = horoscope.getHealthIndexProphecy(nameSurname);
		// then
		assertThat(healthIndex, is(equalTo(4)));
	}

	@Test
	public void shoudReturn0thLoveProphecyFor13thDay() {
		// given
		LocalDate date = LocalDate.of(2014, Month.DECEMBER, 13);
		// Zdrowie - indeks wróżby to reszta z dzielenia długości imienia i
		// nazwiska przez 12
		// when
		int loveIndex = horoscope.getLoveProphecy(date);
		// then
		assertThat(loveIndex, is(equalTo(0)));
	}

	@Test
	public void shoudReturn5thWorkProphecyFor5() {
		// given
		int random = 5;
		// Zdrowie - indeks wróżby to reszta z dzielenia długości imienia i
		// nazwiska przez 12
		// when
		int workIndex = horoscope.getWorkProphecy(random);
		// then
		assertThat(workIndex, is(equalTo(5)));
	}
}
