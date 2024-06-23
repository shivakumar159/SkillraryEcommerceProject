package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryApppage;
import POM.SkillraryHomepage;
import POM.TestingPage;
import genericLibrary.BaseClass;

public class TextCase1 extends BaseClass {
	@Test
	public void tc1() throws Throwable {
		SkillraryHomepage s=new SkillraryHomepage(driver);
		s.gearsbutton();
		s.Skillrarydemoapplink();
		utilities.childBrowser(driver);
		DemoSkillraryApppage dS=new DemoSkillraryApppage(driver);
		utilities.dropDowns(dS.getSelectDd(), pdata.getpropertyData("coursedd"));
		TestingPage tP=new TestingPage(driver);
		utilities.scrollBar(driver, tP.getFbicon());
		tP.fbiconWebElement();
	
		
	}
}
 