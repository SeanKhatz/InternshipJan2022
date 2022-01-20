package stepDefination;

import base.MainParent;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends MainParent {
	
	@Before
	public void loadingBrowser() {
	initialization();
	}
	@After
	public void closingBrowser() {
	tearDown();
	}
}
