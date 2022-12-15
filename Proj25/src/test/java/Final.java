import org.junit.Assert;
import org.junit.Test;

import java.nio.channels.Selector;

public class Final {
    @Test
    public void CustDelTest() throws InterruptedException{
        String url ="https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String expected ="Dumbeldore";
        //setting the strings

        String ManagerLoginSelector="body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button";
        String CustomersSelector="body > div > div > div.ng-scope > div > div.center > button:nth-child(3)";
        String expectedSelector= "body > div > div > div.ng-scope > div > div.ng-scope > div > div > table > tbody > tr:nth-child(1) > td:nth-child(2)";
        String DeleteButtonSelector= "body > div > div > div.ng-scope > div > div.ng-scope > div > div > table > tbody > tr:nth-child(4) > td:nth-child(5) > button";

        //declare
        Prj selenium= new Prj();

        //open window

        selenium.driver.get(url);
        Thread.sleep(1000);
        selenium.driver.manage().window().maximize();
        Thread.sleep(1000);
        selenium.getElement(ManagerLoginSelector).click();
        Thread.sleep(1000);
        selenium.getElement(CustomersSelector).click();
        Thread.sleep(1000);
        selenium.getElement(DeleteButtonSelector).click();
        Thread.sleep(1000);
        String ActVal= selenium.getElement(expectedSelector).getText();
        Assert.assertNotEquals(expected,ActVal);
        //exit

        selenium.driver.quit();



    }
    @Test
    public void BalanceTest() throws InterruptedException{
        String url= "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String expected="750";
        //Setting Strings
        String CustLoginSelector="body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button";
        String YourNameSelector= "#userSelect";
        String UserSelectotr="#userSelect > option:nth-child(3)";
        String LogInSelector="body > div > div > div.ng-scope > div > form > button";
        String DepositSelector= "body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)";
        String AmountSelector= "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input";
        String Deposit2Selector= "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button";
        String WithdrawlSelector= "body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(3)";
        String WithdrawlAmtSelector= "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input";
        String Withdrawl2Selector= "body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button";
        String BalanceSelector="body > div > div > div.ng-scope > div > div:nth-child(3) > strong:nth-child(2)";

        //Setting inputs
        String DepositInput= "1000";
        String WithdrawlInput="250";

        //declare
        Prj selenium= new Prj();

        //open window

        selenium.driver.get(url);
        Thread.sleep(1000);
        selenium.getElement(CustLoginSelector).click();
        Thread.sleep(1000);
        selenium.getElement(YourNameSelector).click();
        Thread.sleep(1000);
        selenium.getElement(UserSelectotr).click();
        Thread.sleep(1000);
        selenium.getElement(LogInSelector).click();
        Thread.sleep(1000);
        selenium.getElement(DepositSelector).click();
        Thread.sleep(1000);
        selenium.getElement(AmountSelector).sendKeys(DepositInput);
        Thread.sleep(1000);
        selenium.getElement(Deposit2Selector).click();
        Thread.sleep(1000);
        selenium.getElement(WithdrawlSelector).click();
        Thread.sleep(1000);
        selenium.getElement(WithdrawlAmtSelector).sendKeys(WithdrawlInput);
        Thread.sleep(1000);
        selenium.getElement(Withdrawl2Selector).click();
        Thread.sleep(1000);
        String ActuVal= selenium.getElement(BalanceSelector).getText();
        Assert.assertEquals(expected,ActuVal);
        //exit
        selenium.driver.quit();










    }
}
