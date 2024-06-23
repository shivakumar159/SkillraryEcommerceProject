package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtocartPage {

	//declaration
			//address of plus icon
			@FindBy(xpath="//i[@class='fa fa-plus']")
			private WebElement plusIcon;
			
			//address of Add to cart
			@FindBy(xpath="(//button[@type='submit'])[1]")
			private WebElement addtoCart;
			
			
			
			//initilization
			public AddtocartPage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}


			//utilization
			public WebElement getPlusIcon() {
				return plusIcon;
			}
public void addtoCart() {
	addtoCart.click();
}


			
		
}
