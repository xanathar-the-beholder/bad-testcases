package codeduplication;

/**
 * Duplication detection ignores comments and whitespace.
 * But doesn't detect if put multiple statements on one line. 
 */
public class WriteCodeOnce {

	private int name;
	
	public void methodToDuplicate() {
		name++;
		name++;
		name++;
		name++;
		name++;
		name++;
		name++;
		name++;
		name++;
		name++;
	}

	/**
	 * Flagged : Yes
	 */
	public void literalCopy() {
		name++;
		name++;
		name++;
		name++;
		name++;
		name++;
		name++;
		name++;
		name++;
		name++;
	}
	
	/**
	 * Flagged : Yes
	 */
	public void literalCopyWithDifferentFormatting() {
		name ++ ;
		name ++ ;
		name ++ ;
		name ++ ;
		name ++ ;
		name ++ ;
		name ++ ;
		name ++ ;
		name ++ ;
		name ++ ;
	}

	/**
	 * Flagged : No
	 */
	public void multipleStatementsOnOneLine() {
		name++;name++;
		name++;name++;
		name++;name++;
		name++;name++;
		name++;name++;
	}

	/**
	 * Flagged : Yes
	 */
	public void copyWithComments() {
		name++;
		name++; // Comment
		name++;
		name++;
		name++;
		name++;
		name++; // Comment
		name++;
		name++;
		name++;
	}

	/**
	 * Flagged : Yes
	 */
	public void anotherCopyWithEmptyLines() {
		name++;
		
		name++; 
		name++;
		
		name++;
		name++;
		
		name++;
		name++;
		
		name++;
		name++;
		
		name++;
	}

}
