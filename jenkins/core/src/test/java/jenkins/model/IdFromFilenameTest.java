package jenkins.model;

import jenkins.model.IdStrategy.CaseSensitive;
import org.junit.Test;
import static org.junit.Assert.*;

public class IdFromFilenameTest {

	
	@Test public void Str_LenFour() {
		
		String filename = "$AB11";
		String correct_str = "AB11";
		CaseSensitive Obj = new CaseSensitive();
		String test_str = Obj.idFromFilename(filename);
		char correct_char = Character.valueOf((char)Integer.parseInt(correct_str, 16));
		String testAgainst = String.valueOf(correct_char);
		
		assertEquals(testAgainst, test_str);
		
	}
	
	@Test public void Str_Varied() {
		
		String filename = "ab$E1B2b$B3";
		String coded_str = "E1B2";
		CaseSensitive Obj = new CaseSensitive();
		String test_str = Obj.idFromFilename(filename);
		char decoded_char = Character.valueOf((char)Integer.parseInt(coded_str, 16));
		String testAgainst = "ab" + String.valueOf(decoded_char) + "b";
		
		assertEquals(testAgainst, test_str);
	}
}
