package codeduplication;

/**
 *  
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

	public void multipleStatementsOnOneLine() {
		name++;name++;
		name++;name++;
		name++;name++;
		name++;name++;
		name++;name++;
	}

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
