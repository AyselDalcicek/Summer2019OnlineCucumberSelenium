package com.vytrack.pages;

import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CalendarEventsPage extends BasePage {

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(css = "span[class='grid-header-cell__label']")
    public List<WebElement> columnNames;

    @FindBy(css = "button[class*='btn dropdown-toggle']")
    public WebElement viewPerPageToggle;

    @FindBy(css = "[class*='btn-group'] [class='dropdown-menu pull-right'] li")
    public List<WebElement> viewPerPageOptions;

    public void clickToCreateCalendarEvent() {
        BrowserUtils.waitForVisibility(createCalendarEvent, 5);
        BrowserUtils.waitForClickablity(createCalendarEvent, 5);
        createCalendarEvent.click();
    }


    public List<String> getColumnNames() {
        return BrowserUtils.getListOfString(columnNames);
    }

    public List<String> getViewPerPageOptions(){
        BrowserUtils.waitForVisibility(viewPerPageToggle, 10);
        BrowserUtils.clickWithWait(viewPerPageToggle);
        return BrowserUtils.getListOfString(viewPerPageOptions);
    }

    public WebElement getCalendarEventOption(String title, String optionText) {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 15);
        Actions actions = new Actions(Driver.get());
        optionText = optionText.substring(0,1).toUpperCase()+optionText.substring(1).toLowerCase();

        By threeDotsBy = By.xpath("//td[normalize-space()='" + title + "']/following-sibling::td//a[@class='dropdown-toggle']");
        By optionBy = By.xpath("//ul[@class='dropdown-menu dropdown-menu__action-cell launchers-dropdown-menu detach dropdown-menu__floating']//a[@title='" + optionText + "']");
        System.out.println(optionBy.toString());
        wait.until(ExpectedConditions.presenceOfElementLocated(threeDotsBy));

        WebElement threeDotsElement = Driver.get().findElement(threeDotsBy);
        wait.until(ExpectedConditions.visibilityOf(threeDotsElement));

        actions.moveToElement(threeDotsElement).pause(500).build().perform();

        wait.until(ExpectedConditions.presenceOfElementLocated(optionBy));
        WebElement optionWebElement = Driver.get().findElement(optionBy);
        System.out.println(Driver.get().findElements(optionBy).size());
        wait.until(ExpectedConditions.visibilityOf(optionWebElement));

        return optionWebElement;
    }




}
