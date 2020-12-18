package stepDefinition;

import cucumber.api.java.Before;
import testBase.TestBase;

public class Background extends TestBase{
	
	public Background() {
		super();
		
	}
	@Before
	public void setUp() {
		TestBase.initialization();
	}
}
