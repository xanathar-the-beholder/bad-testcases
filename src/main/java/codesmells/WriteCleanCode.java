package codesmells;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class WriteCleanCode {

	public void leaveNoBadCommentsBehind() {
		// TODO: Make this method a lot faster some day
		// CHECKSTYLE:OFF
		// JIRA-1234: Fixes a bug when summing negative numbers
	}
	
	public void leaveNoCodeInCommentsBehind() {
		// System.out.println("Test")
	}
	
	public int leaveNoDeadCodeBehind_deadBranch() {
		if (true) {
			return 42;
		} else {
			return 0;
		}
	}
	
	private void leaveNoDeadCodeBehind_unusedPrivateMethod() {
		System.out.println("Hi!");
	}
	
	public boolean leaveNoLongIdentifiersBehindWellThisIdentifierIsRatherLongAndContainsStringIntegerBooleanAndDouble() {
		return true;
	}
	
	public int leaveNoMagicConstantsBehind(int value) {
		return (value * 42 + 72 - 3) / 4;
	}
	
	public void leaveNoBadlyHandledExceptionBehind_Swallow() {
		try {
			new FileInputStream(new File("pom.xml"));
		} catch (IOException ex) {
			
		}
	}
	
	public void leaveNoBadlyHandledExceptionBehind_Throwable() {
		try {
			leaveNoDeadCodeBehind_deadBranch();
		} catch (Throwable ex) {
			throw new RuntimeException(ex);
		}
	}
	
	
	
	
}
