package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomepage {
	//Declaration
	//Address of Gears
	@FindBy(xpath=" //a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	//Address of Skillrary demo
	@FindBy(xpath="( //a[text()=' SkillRary Demo APP'])[1]")
	private WebElement skillrarydemoApp;

	//Address of search text field
		@FindBy(xpath="//input[@name='q']")
		private WebElement searchTF;

		//Address of search icon
				@FindBy(xpath="//input[@value='go']")
				private WebElement searchicon;
	
				//Address of cookie cross icon
				@FindBy(xpath="//a[@class='close_cookies']")
				private WebElement coockies;
				
				//initilization
				public SkillraryHomepage(WebDriver driver) {
					PageFactory.initElements(driver, this);
				}
				
				//utilization
				public void gearsbutton() {
					gearsbtn.click();
				
				}
				public void Skillrarydemoapplink() {
					skillrarydemoApp.click();
				}
				public void searchTextfield() {
					searchTF.click();
				}
				public void searchicon() {
					searchicon.click();
				}
				public void coockiesicon() {
					coockies.click();
				}
}
