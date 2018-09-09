package codesmells;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * The book defines 7 code smells:
 * - 1   Leave No-Unit Level Code Smells Behind : covered in other categories.
 * - 1/2 Leave no bad comments behind: only the t o d o is found.
 * - 1/2 Leave no code in comments behind: only internal references are detected.
 * - 0   Leave no dead code behind: not detected.
 * - 0   Leave no long identifier names behind: not detected.
 * - 0   Leave no magic constants behind: not detected.
 * - 1/2 Leave no badly handled exceptions behind: only swallowing is detected.  
 */
public class WriteCleanCode {

	/**
	 * Todo is flagged (also in this line :)
	 */
	public void leaveNoBadCommentsBehind() {
		// TODO: Make this method a lot faster some day
		// CHECKSTYLE:OFF
		// JIRA-1234: Fixes a bug when summing negative numbers
	}
	
	/**
	 * Not flagged
	 */
	public void leaveNoCodeInCommentsBehind_one() {
		// System.out.println("Test")
	}

	/**
	 * Not flagged
	 */
	public void leaveNoCodeInCommentsBehind_two() {
		// WriteCleanCode.class.getName()
		// new WriteCodeOnce().anotherCopyWithEmptyLines();
	}

	/**
	 * Flagged
	 */
	public void leaveNoCodeInCommentsBehind_three() {
		// leaveNoDeadCodeBehind_deadBranch();
		// leaveNoLongIdentifiersBehindWellThisIdentifierIsRatherLongAndContainsStringIntegerBooleanAndDouble();
	}

	/**
	 * Not flagged
	 */
	public int leaveNoDeadCodeBehind_deadBranch() {
		if (true) {
			return 42;
		} else {
			return 0;
		}
	}
	
	/**
	 * Not flagged
	 */
	private void leaveNoDeadCodeBehind_unusedPrivateMethod() {
		System.out.println("Hi!");
	}
	
	/**
	 * Not flagged
	 */
	public boolean leaveNoLongIdentifiersBehindWellThisIdentifierIsRatherLongAndContainsStringIntegerBooleanAndDouble() {
		return true;
	}
	
	/**
	 * Not flagged
	 */
	public int leaveNoMagicConstantsBehind(int value) {
		return (value * 42 + 72 - 3) / 4;
	}
	
	/**
	 * Flagged
	 */
	public void leaveNoBadlyHandledExceptionBehind_Swallow() {
		try {
			new FileInputStream(new File("pom.xml"));
		} catch (IOException ex) {
			
		}
	}
	
	/**
	 * Not flagged
	 */
	public void leaveNoBadlyHandledExceptionBehind_CatchThrowable() {
		try {
			leaveNoDeadCodeBehind_deadBranch();
		} catch (Throwable ex) {
			throw new RuntimeException(ex);
		}
	}
	
}
