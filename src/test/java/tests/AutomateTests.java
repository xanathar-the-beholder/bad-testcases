package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import codeduplication.WriteCodeOnce;
import complexity.WriteSimpleUnitsOfCode;
import complexity.WriteSimpleUnitsOfCodeWithObjects;
import methodargs.KeepUnitInterfacesSmall;
import methodlength.WriteShortUnitsOfCode;

public class AutomateTests {

	@Test
	public void shouldAcceptPassingTest() {
		assertTrue(true);
	}

	@Test
	public void shouldAcceptFailingTest() {
		assertTrue(false);
	}

	@Test
	public void shouldRefenceClasses() {
		WriteCodeOnce.class.getName();
		WriteSimpleUnitsOfCode.class.getName();
		WriteSimpleUnitsOfCodeWithObjects.class.getName();
		KeepUnitInterfacesSmall.class.getName();
		WriteShortUnitsOfCode.class.getName();
	}
	
	@Test
	public void shouldHaveLotsOfLinesWithAsserts() {
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
		assertTrue(true);
	}

}
