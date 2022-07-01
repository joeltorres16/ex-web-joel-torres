package com.nttdata.steps;

import com.nttdata.page.HomePage;
import org.openqa.selenium.WebDriver;

public class HomeStep {
    private WebDriver driver;
    public HomeStep(WebDriver driver){
        this.driver=driver;
    }
    public void insertNumer1(String num1){
        this.driver.findElement(HomePage.typeNumer1).sendKeys(num1);
    }
    public void insertNumer2(String num2){
        this.driver.findElement(HomePage.typeNumer2).sendKeys(num2);
    }
    public void SelectAdd(){
        this.driver.findElement(HomePage.typeAdd).click();
    }
    public void selectSubstract(){
        this.driver.findElement(HomePage.typeSustract).click();
    }
    public void selectMulti(){
        this.driver.findElement(HomePage.typeMult).click();
    }
    public void selectDiv(){
        this.driver.findElement(HomePage.typeDiv).click();
    }
    public void selectConcact(){
        this.driver.findElement(HomePage.typeConcact).click();
    }

    public void clickBoton(){
        this.driver.findElement(HomePage.clickbtn).click();
    }

    public String CapturaDato(){
        return this.driver.findElement(HomePage.result).getText();
    }
    public String capturoError(){
        return this.driver.findElement(HomePage.messageError).getText();
    }

    public void limpCamp(){
        this.driver.findElement(HomePage.typeNumer1).clear();
        this.driver.findElement(HomePage.typeNumer2).clear();
    }
    public void clickOnly(){
        this.driver.findElement(HomePage.clickOnlyInteger).click();
    }


}
