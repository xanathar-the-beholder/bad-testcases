package methodlength;

/**
 * Does the analyzer count lines or statements? -> Lines
 * Does it include comments? -> No
 */
public class WriteShortUnitsOfCode {

	public void statements16Comments0Lines16() {
		int value = 0;
		value = value +1;
		value = value +2;
		value = value +1;
		value = value +3;
		value = value +1;
		value = value +2;
		value = value +1;
		value = value +4;
		value = value +1;
		value = value +2;
		value = value +1;
		value = value +5;
		value = value +1;
		value = value +2;
		value = value +1;
	}
	
	public void statements16WithLineComments16Lines16() {
		int value = 0;    // Comment
		value = value +1; // Comment
		value = value +2; // Comment
		value = value +1; // Comment
		value = value +3; // Comment
		value = value +1; // Comment
		/* comment*/ value = value +2;
		/* comment*/ value = value +1;
		/* comment*/ value = value +4;
		/* comment*/ value = value +1;
		/* comment*/ value = value +2;
		/* comment*/ value = value +1;
		value = value +5;
		value = value +1;
		value = value +2;
		value = value +1;
	}

	public void statements16Comments0Lines8() {
		int value = 0; value = value +1;
		value = value +1; value = value +1;
		value = value +1; value = value +1;
		value = value +1; value = value +1;
		value = value +1; value = value +1;
		value = value +1; value = value +1;
		value = value +1; value = value +1; 
		value = value +1; value = value +1;
	}
	
	public void statements2Comments14Lines16() {
		int value = 0;
		// A comment 1
		// A comment 2
		// A comment 3
		// A comment 4
		// A comment 5
		// A comment 6
		// A comment 7
		// A comment 8
		// A comment 9
		// A comment 10
		// A comment 11
		// A comment 12
		// A comment 13
		// A comment 14
		value = value +1;
	}
	
	public void statements2MultilineComments14Lines16() {
		int value = 0;
		/* A comment 1
		   A comment 2
		   A comment 3
		   A comment 4
		   A comment 5
		   A comment 6
		   A comment 7
		   A comment 8
		   A comment 9
		   A comment 10
		   A comment 11
		   A comment 12
		   A comment 13
		   A comment 14 */
		value = value +1;
	}
	
	public void statements2JavadocComments14Lines16() {
		int value = 0;
		/** A comment 1
		   A comment 2
		   A comment 3
		   A comment 4
		   A comment 5
		   A comment 6
		   A comment 7
		   A comment 8
		   A comment 9
		   A comment 10
		   A comment 11
		   A comment 12
		   A comment 13
		   A comment 14 */
		value = value +1;
	}

}
