package co.grandcircus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SpellerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void test1() {
	    String expected
	     = "nine hundred thirty four dollars and fifty cents";
	    assertEquals(
	      expected, 
	      Speller.moneyToWords(934.5));
	}

}
