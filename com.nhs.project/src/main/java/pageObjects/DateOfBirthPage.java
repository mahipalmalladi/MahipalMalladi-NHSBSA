package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.LocalDate;
import java.time.Period;


public class DateOfBirthPage extends BasePage {

	@FindBy(how = How.ID, using = "dob-day")
	private WebElement dayTextBox;
	
	@FindBy(how = How.ID, using = "dob-month")
	private WebElement monthTextBox;
	
	@FindBy(how = How.ID, using = "dob-year")
	private WebElement yearTextBox;
		
	public DateOfBirthPage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void enterdayofBirth(String day,String month, String year ) 
	{
		dayTextBox.sendKeys(day);
		monthTextBox.sendKeys(month);
		yearTextBox.sendKeys(year);
		
	}
	
}
