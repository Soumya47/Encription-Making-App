package EncriptionMakingApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncriptionMakingAppTest {
	
	private EncriptionMakingApp encriptionMakingApp = new EncriptionMakingApp();

	@Test
	void testEncriptedMessageWithOffsetOf12() {
		assertEquals("tai mdq kag pauzs fapmk",encriptionMakingApp.makingApp("how are you doing today", 12));
	}
	@Test
	void testEmptyString() {
		assertEquals("",encriptionMakingApp.makingApp("", 12));
	}
	
//	@Test
//	void testEncriptedMessageWithOffsetOf11() {
//		assertEquals("tai mdq kag pauzs fapmk",encriptionMakingApp.makingApp("how are you doing today", 11));
//	}

}
