package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import utils.Global_Vars;

public class Contact_Us_PO extends Base_PO{

    private @FindBy(how = How.XPATH, using = "//input[@name='first_name']")
    WebElement firstName_TextField;

    private @FindBy(xpath = "//input[@name=\"last_name\"]")
    WebElement lastName_TextField;

    private @FindBy(xpath = "//input[@name=\"email\"]")
    WebElement email_Text_Field;

    private @FindBy(xpath = "//textarea[@name=\"message\"]")
    WebElement commentField;

    private @FindBy(xpath = "//input[@value=\"SUBMIT\"]")
    WebElement submut_button;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfullSubmision_Message_Text;

    public Contact_Us_PO() {
        super();
    }
    public void navigate_WebDriverUniversity_Contacy_Us_Page(){
        navigateTo_URL(Global_Vars.WEBDRIVER_UNIVERSITY_HOMEPAGE_URL + "/Contact-Us/contactus.html");
    }
    public void setUnique_FirstName(){
        sendKeys(firstName_TextField, "AutoFN" + generateRandomNumber(5));
    }
    public void setUnique_LastName(){
        sendKeys(lastName_TextField, "AutoLN" + generateRandomNumber(5));
    }
    public void setUnique_email_address(){
        sendKeys(email_Text_Field, "AutoEmail" + generateRandomNumber(10) + "@mail.com");
    }
    public void setUnique_comment (){
        sendKeys(commentField, "Hello world " + generateRandomString(20));
    }

    public void setSpecific_First_Name(String fistName){
        sendKeys(firstName_TextField, fistName);
    }

    public void setSpecific_Last_Name(String lastName){
        sendKeys(lastName_TextField, lastName);
    }
    public void setSpecific_Email(String email){
        sendKeys(email_Text_Field, email);
    }

    public void setSpecific_Comment(String comment){
        sendKeys(commentField, comment);
    }
    public void clickOn_Submit_Button(){
       waitForWebElementAndClick(submut_button);
    }
    public void validate_Successfull_Submission_Message_Text(){
        waitFor(successfullSubmision_Message_Text);
        Assert.assertEquals(successfullSubmision_Message_Text.getText(), "Thank You for your Message!");

    }

}
