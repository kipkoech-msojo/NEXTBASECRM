package com.CRM.pages;

import com.CRM.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Poll {
    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollBtn;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement pollFrame;

    public Poll(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void createPoll(){
        this.pollBtn.click();
        Driver.getDriver().switchTo().frame(pollFrame);
        

    }
}
