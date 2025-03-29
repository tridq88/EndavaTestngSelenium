package unittest;

import org.testng.annotations.Test;

public class MultipleBrowserTest {
  
	@Parameters("browser")
	@Test
	public void runInBrowser(String browser) {
	  
	}
}
