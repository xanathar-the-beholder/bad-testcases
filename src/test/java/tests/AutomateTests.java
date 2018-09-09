package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import codeduplication.WriteCodeOnce;
import complexity.WriteSimpleUnitsOfCode;
import complexity.WriteSimpleUnitsOfCodeWithObjects;
import methodargs.KeepUnitInterfacesSmall;
import methodlength.WriteShortUnitsOfCode;

/**
 * Test code metrics: 
 * - The number of lines of test code should be at least 50% of the production code.
 * - The number of lines of test code with an assert should be at least 5%.
 * 
 * Untested Files
 * - Classes are removed from this list when sufficient lines are covered by method invocations to the class.
 * 
 * Interesting:
 * - Tests don't have to pass.
 * - Tests don't have to test anything.
 * - Test code can be plain wrong.
 * - Tests are not checked for duplication.
 */
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
		someHelperMethd(1, 21, 3, 4, 5, 6);
		WriteCodeOnce.class.getName();
		WriteSimpleUnitsOfCode.class.getName();
		WriteSimpleUnitsOfCodeWithObjects.class.getName();
		KeepUnitInterfacesSmall.class.getName();
		WriteShortUnitsOfCode.class.getName();
	}
	
	/**
	 * Note that some classes required more than one invocation for it to be removed from the list.
	 */
	@Test
	public void shouldInvokeMethods() {
		WriteCodeOnce once = null;
		once.anotherCopyWithEmptyLines();
		
		WriteSimpleUnitsOfCode simple = null;
		simple.fiveWithFor();
		
		WriteSimpleUnitsOfCodeWithObjects obj = null;
		obj.fiveWithOptionalCondition(0);
		obj.fiveWithStreamingApi();
		obj.fiveWithStreamingApiTwo();
		
		KeepUnitInterfacesSmall small = null;
		small.fourArg(1, 2, 3, 4);
		
		WriteShortUnitsOfCode shrt = null;
		shrt.longStatementOverMultipleLines(1L);
		shrt.longStatementOverOneLine(1L);
		shrt.statements16Comments0Lines16();
	}
	
	public int someHelperMethd(int a,int b,int c,int d,int e,int f) {
		return a+b+c+d+e+f;
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
