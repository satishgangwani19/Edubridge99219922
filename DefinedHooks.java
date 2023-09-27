package hooksPackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class DefinedHooks {
	
		@Before()
		public void launchBrowser()
		{
			System.out.println("Application is launched");
		}

		@After()
		public void closedBrowser()
		{
			System.out.println("Application is closed");
		}

}
