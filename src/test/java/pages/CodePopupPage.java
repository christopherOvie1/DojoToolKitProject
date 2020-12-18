package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import testBase.TestBase;
import waits.MyWebDriverWait;

import java.util.List;

public class CodePopupPage extends TestBase {





    @FindBy(how= How.XPATH,using ="//*[starts-with(@id,'dijit_layout_TabContainer_')]")
   List<WebElement> innerText;
    @FindBy(how= How.XPATH,using ="//*[starts-with(@id,'dijit_layout_ContentPane_')]")
    List<WebElement> messageTxt;
    @FindBy(how= How.XPATH,using ="//*[@id = 'dijit_layout_ContentPane_3']")
     WebElement messageText;
    @FindBy(how= How.XPATH,using ="//div[@class='dijitTabListWrapper dijitTabContainerTopNone dijitAlignCenter']//div//span[2]")
    List<WebElement> tabButtons;
    @FindBy(how= How.XPATH,using ="//div[@class='dijitTabListWrapper dijitTabContainerTopNone dijitAlignCenter']//div//span[2]")
    List<WebElement> tabBtns;
    private By frame = By.xpath("//iframe");


    public     CodePopupPage(){
        PageFactory.initElements(driver,this);
    }

      public void clickTabButtons(String Tab){
        tabButtons.stream().filter(x -> x.getText().equalsIgnoreCase(Tab)).findFirst().get().click();
          }

public void switchToFrame(){
    MyWebDriverWait.waitForElementToBeVisibleByAttributeValue((By) frame, "src", "My 2nd inner", 10);
        driver.switchTo().frame(0);
}

public void clickInnerText(String innerTxt){
    innerText.stream().filter(x->x.getText().equalsIgnoreCase(innerTxt)).findFirst().get().click();
                                           }

public void clickTabButtns(String tabButtons){
    tabBtns.stream().filter(x->x.getText().equalsIgnoreCase(tabButtons)).findFirst().get().click();
}
public boolean validateMessageTxt(String msg){
  return messageTxt.stream().filter(x->x.getText().equalsIgnoreCase(msg)).findFirst().get().isDisplayed();
}
}
