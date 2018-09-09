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

	/**
	 * Doesn't work
	 */
	@Test
	public void shouldRefenceClasses() {
		WriteCodeOnce.class.getName();
		WriteSimpleUnitsOfCode.class.getName();
		WriteSimpleUnitsOfCodeWithObjects.class.getName();
		KeepUnitInterfacesSmall.class.getName();
		WriteShortUnitsOfCode.class.getName();
	}
	
	@Test
	public void shouldInvokeMethods() {
		WriteCodeOnce once = null;
		once.anotherCopyWithEmptyLines();
		WriteSimpleUnitsOfCode simple = null;
		simple.fiveWithFor();
		WriteSimpleUnitsOfCodeWithObjects obj = null;
		obj.fiveWithOptionalCondition(0);
		KeepUnitInterfacesSmall small = null;
		small.fourArg(1, 2, 3, 4);
		WriteShortUnitsOfCode shrt = null;
		shrt.longStatementOverMultipleLines(1L);
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
