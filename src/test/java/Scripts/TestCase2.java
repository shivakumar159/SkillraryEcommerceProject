package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryApppage;
import POM.InvoicePage;
import POM.SkillraryHomepage;
import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass{
	@Test
	public void tc2() {
		
		SkillraryHomepage s=new SkillraryHomepage(driver);
		s.gearsbutton();
		s.Skillrarydemoapplink();
		utilities.childBrowser(driver);
		DemoSkillraryApppage dS=new DemoSkillraryApppage(driver);
		dS.feedBackButton();
		InvoicePage iP=new InvoicePage(driver);
		iP.InvoiceButton();
	}
	

}
