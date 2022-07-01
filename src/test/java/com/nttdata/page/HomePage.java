package com.nttdata.page;

import org.openqa.selenium.By;

public class HomePage {
    public static By typeNumer1= By.cssSelector("#number1Field");
    public static By typeNumer2= By.cssSelector("#number2Field");
    public static By typeAdd= By.cssSelector("section.bg-light.page-section:nth-child(3) div.container div.row div.col-lg-12.text-left form.form-horizontal:nth-child(11) div.row:nth-child(4) div.col-sm-7 select.element.select.medium > option:nth-child(1)");
    public static By typeSustract= By.cssSelector("section.bg-light.page-section:nth-child(3) div.container div.row div.col-lg-12.text-left form.form-horizontal:nth-child(11) div.row:nth-child(4) div.col-sm-7 select.element.select.medium > option:nth-child(2)");
    public static By typeMult= By.cssSelector("section.bg-light.page-section:nth-child(3) div.container div.row div.col-lg-12.text-left form.form-horizontal:nth-child(11) div.row:nth-child(4) div.col-sm-7 select.element.select.medium > option:nth-child(3)");
    public static By typeDiv = By.cssSelector("section.bg-light.page-section:nth-child(3) div.container div.row div.col-lg-12.text-left form.form-horizontal:nth-child(11) div.row:nth-child(4) div.col-sm-7 select.element.select.medium > option:nth-child(4)");
    public static By typeConcact= By.cssSelector("section.bg-light.page-section:nth-child(3) div.container div.row div.col-lg-12.text-left form.form-horizontal:nth-child(11) div.row:nth-child(4) div.col-sm-7 select.element.select.medium > option:nth-child(5)");
    public static By messageError= By.cssSelector("#errorMsgField");
    public static By clickOnlyInteger= By.cssSelector("#integerSelect");
    public static By clickbtn= By.cssSelector("#calculateButton");
    public static By result= By.cssSelector("#numberAnswerField");
}
