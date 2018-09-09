package codesmells;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class WriteCleanCode {

	/**
	 * Todo is flagged.
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
	public void leaveNoBadlyHandledExceptionBehind_Throwable() {
		try {
			leaveNoDeadCodeBehind_deadBranch();
		} catch (Throwable ex) {
			throw new RuntimeException(ex);
		}
	}
	
}
